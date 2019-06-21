package com.xing.example.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
@Getter
@Setter
@ToString
public class Answer {

    /**
     * 唯一id
     */
    private long id;
    /**
     * 问题id映射
     */
    private long q_id;
    /**
     * 作者id映射
     */
    private long a_id;
    /**
     * 答案内容
     */
    private String content;
    /**
     * 点赞数
     */
    private long voteup_count;
    /**
     * 评论数
     */
    private long comment_count;
    private long created_time;
    private long updated_time;
    /**
     * 状态 0正常 1删除
     */
    private int status;
}
