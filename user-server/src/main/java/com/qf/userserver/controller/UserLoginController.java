package com.qf.userserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserLoginController {

    @Value("${message}")
    private String message;

    @RequestMapping("/getMeg")
    public String getParam(){
        return  message;
    }

}
