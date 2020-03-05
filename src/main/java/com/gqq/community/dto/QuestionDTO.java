package com.gqq.community.dto;

import com.gqq.community.model.User;
import lombok.Data;

/**
 * @program: QuestionDTO
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/31 19:59
 * @Version: 1.0
 **/
@Data
public class QuestionDTO {
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
    private User user;
}
