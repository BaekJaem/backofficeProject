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

    @GetMapping(value = {"/admin/index"})
    public String admin(){
        System.out.println("admin");
        return "admin/index";
    }

    @GetMapping(value = {"/user/index"})
    public String user(){
        System.out.println("user");
        return "user/index";
    }

    @GetMapping(value = {"/test/index"})
    public String test(){
        System.out.println("user");
        return "test/index";
    }

    @GetMapping(value = {"/test"})
    public String test1(){
        System.out.println("user");
        return "test/index";
    }
}
