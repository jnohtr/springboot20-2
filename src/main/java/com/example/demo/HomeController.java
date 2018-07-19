package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {

        return "index";

    }

    @RequestMapping("/login")
    public String login() {

        return "login";
    }

//    @RequestMapping("/admin")
//    public String admin() {
//
//        return "admin";
//    }

    @RequestMapping("/secure")
    public String secure() {
        return "secure";
    }

    //    <!--<h3 sec:authorize="isAuthenticated()" th:inline="text">[[${#authentication.name}]] is the user you are logged in as. Look at this syntax to see how it displays differently.</h3>-->
}
