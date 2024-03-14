package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
    

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logged-out")
    public String loggedOut() {
        return "logged-out";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

}
