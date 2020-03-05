package com.gqq.community.model;

import lombok.Data;

/**
 * @program: User
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/3 1:47
 * @Version: 1.0
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
