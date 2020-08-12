package com.erp.controller.usercenter;

import com.erp.service.usercenter.UserManagerService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
@Api
@Controller
public class UserManagerController {

    @Resource
    private UserManagerService userManagerService;

    @PostMapping("/login")
    public String login(){
        return "index";
    }

    @PostMapping("register")
    public String register(){
//        userManagerService.registerUser();
        return "login";
    }
}
