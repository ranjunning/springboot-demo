package com.example11.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
允许这个类去接受前端的请求
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";//自动去找hello这个模板
    }
}
