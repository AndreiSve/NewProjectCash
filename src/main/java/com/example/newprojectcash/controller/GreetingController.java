package com.example.newprojectcash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/login")
    public String handleLogin() {
        // Логика аутентификации пользователя
        return "redirect:/home";  // Перенаправление на другую страницу после успешного логина
    }

}
