package com.example.backofficeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackofficeMainController {

    @GetMapping(value = {"/"})
    public String MainPage(){
        System.out.println("index");
        return "index";
    }

    @GetMapping(value = {"/login"})
    public String login(){
        System.out.println("login");
        return "login";
    }
}
