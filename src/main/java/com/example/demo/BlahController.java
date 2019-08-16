package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlahController {
    @GetMapping("/")
    public String blah(Model model) {
        model.addAttribute("xyz", "BlahBlum");
        return "blah";
    }
}
