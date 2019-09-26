package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping  ("/")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("/page1")
    public String page1() {
        return "page1";
    }
    @RequestMapping("/page2")
    public String page2() {
        return "page2";
}
@RequestMapping("/page3")
public String page3() {
    return "page3";
    }
}
