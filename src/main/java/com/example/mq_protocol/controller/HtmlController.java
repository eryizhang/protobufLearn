package com.example.mq_protocol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/testhtml")
    public String index(){
        System.out.println("index");
        return "index";
    }
}
