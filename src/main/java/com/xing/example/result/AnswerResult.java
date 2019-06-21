package com.xing.example.result;

import com.xing.example.entity.Answer;
import com.xing.example.entity.Author;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
@Setter
@Getter
@ToString
public class AnswerResult {
    private Answer answer;
    private Author author;
}
