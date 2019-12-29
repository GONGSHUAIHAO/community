package com.gqq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: HelloController
 * @description: TODO
 * @author: GQQ
 * @create: 2019/12/28 12:48
 * @Version: 1.0
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "world", required = false) String name,
                        Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
