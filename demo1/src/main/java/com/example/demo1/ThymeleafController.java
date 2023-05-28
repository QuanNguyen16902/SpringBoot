package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Thymeleaf");
        return "index";
    }
}
