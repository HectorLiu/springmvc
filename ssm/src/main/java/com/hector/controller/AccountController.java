package com.hector.controller;


import com.hector.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @Autowired
    private AccountService as = null;

    @RequestMapping("/list")
    public String findAll(){
        as.findAll();
        return "success";
    }
}
