package com.gqq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: IndexController
 * @description: TODO
 * @author: GQQ
 * @create: 2019/12/28 12:48
 * @Version: 1.0
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
