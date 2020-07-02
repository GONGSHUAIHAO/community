package com.gqq.community.controller;

import com.gqq.community.dto.QuestionDTO;
import com.gqq.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: QuestionController
 * @description: TODO
 * @author: GQQ
 * @create: 2020/3/18 14:20
 * @Version: 1.0
 **/
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")Integer id, Model model){

        QuestionDTO question = questionService.getById(id);
        model.addAttribute("question",question);
        return "question";
    }
}
