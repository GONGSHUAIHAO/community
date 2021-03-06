package com.gqq.community.model;

import lombok.Data;

/**
 * @program: Question
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/17 19:14
 * @Version: 1.0
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;

}
