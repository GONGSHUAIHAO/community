package com.gqq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: PublishController
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/17 0:00
 * @Version: 1.0
 **/
@Controller
public class PublishController {

    @GetMapping("publish")
    public String publish(){
        return "publish";
    }
}
