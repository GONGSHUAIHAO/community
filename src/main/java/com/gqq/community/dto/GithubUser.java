package com.gqq.community.dto;

import lombok.Data;

/**
 * @program: GithubUser
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/1 23:14
 * @Version: 1.0
 **/
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;


}
