package com.example.testowy.controller;

import com.example.testowy.model.ModelName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap map){
        map.addAttribute("modelName", new ModelName());
        map.addAttribute("names", List.of("Kamil", "Marek", "Andrzej", "Robert"));
        return "SelectNameEnter";
    }
    @PostMapping("/")
    public String execute(ModelMap map, @ModelAttribute("modelName") ModelName name){
        map.addAttribute("result", name.getName());
        return "SelectNameExecute";
    }
}
