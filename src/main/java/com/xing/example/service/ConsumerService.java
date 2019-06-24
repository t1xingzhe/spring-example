package com.xing.example.service;

import com.xing.example.entity.Answer;
import com.xing.example.entity.Author;
import com.xing.example.entity.Question;
import com.xing.example.repository.AllMapper;
import com.xing.example.result.AnswerResult;
import com.xing.example.result.QuestionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
@Service
public class ConsumerService {

    @Autowired
    private AllMapper allMapper;

    /**
     * 获取问题列表
     *
     * @return
     */
    public QuestionResult getQuestionList(long id) {
        //todo 增加分页入参
        QuestionResult questionResult = new QuestionResult();
        Question question = allMapper.selectQuestion(id);
        if (question != null) {
            Author author = allMapper.selectAuthor(question.getA_id());
            List<Answer> answers = allMapper.selectByQid(question.getId());
            questionResult.setAuthor(author);
            questionResult.setQuestion(question);
            List<AnswerResult> answerResults = new ArrayList<>();
            if(!CollectionUtils.isEmpty(answers)) {
                for (Answer answer:answers) {
                    //todo 循环调用，不可取，改成批量获取
                    Author authorTmp = allMapper.selectAuthor(answer.getA_id());
                    AnswerResult answerResult = new AnswerResult();
                    answerResult.setAuthor(authorTmp);
                    answerResult.setAnswer(answer);
                    answerResults.add(answerResult);
                }
            }
            questionResult.setAnswers(answerResults);
        }
        return questionResult;
    }

    public List<AnswerResult> getAnswers(long qId){
        List<AnswerResult> answerResults = new ArrayList<>();
        List<Answer> answers = allMapper.selectByQid(qId);
        if(!CollectionUtils.isEmpty(answers)){
            for(Answer answer:answers){
                AnswerResult answerResult = new AnswerResult();
                answerResult.setAnswer(answer);
                answerResult.setAuthor(allMapper.selectAuthor(answer.getA_id()));
                answerResults.add(answerResult);
            }
        }
        return answerResults;
    }
}
