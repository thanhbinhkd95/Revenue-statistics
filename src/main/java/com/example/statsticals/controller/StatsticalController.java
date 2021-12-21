package com.example.statsticals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stats")
public class StatsticalController {
    @GetMapping("/category-stats")
    public String cateStats(){
        return "category-stats";
    }
}
