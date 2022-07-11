package com.wesleyreisz.sample11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/farm")
public class IndexController {
    @GetMapping
    @ResponseBody
    public String welcome(){
        return "Welcome to FarmUp!\n" +
                "Let us manage and farm our gains";
    }
}
