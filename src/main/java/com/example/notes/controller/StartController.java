package com.example.notes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivan 13.01.2023
 */

@Controller
public class StartController {
    @GetMapping("/start")
    public String start(){
        return "start";
    }
}
