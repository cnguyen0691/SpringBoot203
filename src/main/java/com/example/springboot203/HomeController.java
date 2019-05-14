package com.example.springboot203;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping ("/application")
    public String applicationForm(Model model){
        model.addAttribute("Employee", new employee());
        return "application";
    }

    @PostMapping("/application")
    public String applicationForm(@ModelAttribute employee Employee, Model model){
        model.addAttribute("Employee", Employee);
        return "confirmApplication";
    }

}
