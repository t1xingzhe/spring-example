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
public class Author {
    private long id;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 头图
     */
    private String avatar_url;
    /**
     * 标签
     */
    private String tags;
    /**
     * 性别 0女 1男
     */
    private short gender;
    private long created_time;
    /**
     * 状态 0正常 1冻结
     */
    private int status;
}
