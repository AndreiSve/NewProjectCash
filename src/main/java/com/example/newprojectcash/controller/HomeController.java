package com.example.newprojectcash.controller;

import com.example.newprojectcash.accessingdatamysql.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }

}
