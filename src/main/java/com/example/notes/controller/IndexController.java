package com.example.notes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivan 13.01.2023
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String start(Model model){
        model.addAttribute("role", "1");
        return "index";
    }
}
