package com.xing.example.result;

import com.xing.example.entity.Answer;
import com.xing.example.entity.Author;
import com.xing.example.entity.Question;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
@Setter
@Getter
@ToString
public class QuestionResult {
    private Question question;
    private Author author;
    private List<Answer> answers = Collections.emptyList();
}
