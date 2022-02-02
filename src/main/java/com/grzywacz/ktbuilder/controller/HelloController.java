package com.grzywacz.ktbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @GetMapping("/")
    public String start(HttpServletRequest request, Model model) {

       return "index";
    }
}
