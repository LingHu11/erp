package com.erp.controller.usercenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserManager {

    @PostMapping("/login")
    public String login(){
        return "index";
    }
}
