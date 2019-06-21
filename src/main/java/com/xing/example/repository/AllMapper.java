package com.xing.example.repository;

import com.xing.example.entity.Answer;
import com.xing.example.entity.Author;
import com.xing.example.entity.Question;

import java.util.List;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
public interface AllMapper {

    /**
     * 根据问题id查询所有答案
     * @param qId
     * @return
     */
    List<Answer> selectByQid (long qId);

    /**
     * 唯一id查找作者
     * @param id
     * @return
     */
    Author selectAuthor(long id);

    /**
     * 获取问题
     * @param id
     * @return
     */
    Question selectQuestion(long id);
}
