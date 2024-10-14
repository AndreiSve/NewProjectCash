package com.example.newprojectcash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @PostMapping("/login")
    public String handleLogin() {
        // Логика аутентификации пользователя
        return "redirect:/home";  // Перенаправление на другую страницу после успешного логина
    }

}
