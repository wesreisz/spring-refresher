package com.wesleyreisz.sample11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/farm")
public class LoginFormController {
    @GetMapping("/login/guest")
    @ResponseBody
    public String loginGuest(
            @RequestParam("user") String username,
            @RequestParam("pass") String pass){
        return String.format("Welcome FarmUp guest: %s!!!", username);
    }
    @PostMapping("/login/auth")
    @ResponseBody
    public String loginUser(
            @RequestParam String username,
            @RequestParam String pass){
        return String.format("Welcome FarmUp member: %s!!!", username);
    }
    @GetMapping("/login/role/{user}")
    @ResponseBody
    public String validateUserRole(
            @PathVariable("user") String username){
        return String.format("User %s is an Administrator", username);
    }
    @PostMapping("/login/role/{user}/{pwd:[A-Za-z0-9@$_]{3,20}}")
    @ResponseBody
    public String generatePassphrase(
            @PathVariable("user") String username,
            @PathVariable("pwd") String pass){
        return new StringBuilder(String.join("",username,pass)).reverse().toString();
    }
    
}
