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
public class Question {
    private long id;
    /**
     * 问题标题
     */
    private String title;
    /**
     * 详情 可为空
     */
    private String detail;
    /**
     * 作者id映射
     */
    private long a_id;
    /**
     * 回答数
     */
    private long answer_count;
    /**
     * 关注数
     */
    private long follower_count;

    private long created_time;
    private long updated_time;
    /**
     * 状态 0正常 1删除 2冻结
     */
    private int status;
}
