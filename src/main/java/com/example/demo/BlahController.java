package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlahController {
  @Autowired
  Environment environment;

  @Autowired
  BuildProperties buildProperties;

  @Autowired
  GitProperties gitProperties;

  @GetMapping("/")
  public String blah(Model model) {
    model.addAttribute("xyz", "Tester");
    return "blah";
  }

  @GetMapping("/one")
  public String one(Model model) {
    model.addAttribute("xyz", "Tester One");
    return "blah";
  }

  @GetMapping("/two")
  public String two(Model model) {
    model.addAttribute("xyz", "Tester Two");
    return "redirect:/dir1/blum";
  }
}