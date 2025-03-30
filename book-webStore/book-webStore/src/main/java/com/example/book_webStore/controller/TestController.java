package com.example.book_webStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String testPage(Model model) {
        model.addAttribute("message", "This is a test message!");
        return "test";
    }
}
