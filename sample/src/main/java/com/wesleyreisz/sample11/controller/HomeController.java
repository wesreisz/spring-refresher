package com.wesleyreisz.sample11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/farm/home")
public class HomeController {
    @Autowired
    private String webmaster;

    @Autowired
    private String projectName;

    @Autowired
    private LocalDate localDate;

    @GetMapping(value = "/footer")
    @ResponseBody
    public String showFooter(){
        return String.format("Contact webmaster: %s", webmaster);
    }

    @GetMapping(value = "/header")
    @ResponseBody
    public String showHeader(){
        return projectName;
    }

    @PostMapping(value = "/accessDate")
    @ResponseBody
    public String showAccessDate() {
        return localDate.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
    }
}
