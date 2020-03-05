package com.gqq.community.dto;

import lombok.Data;

/**
 * @program: AccessTokenDTO
 * @description: TODO
 * @author: GQQ
 * @create: 2019/12/31 1:08
 * @Version: 1.0
 **/
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
