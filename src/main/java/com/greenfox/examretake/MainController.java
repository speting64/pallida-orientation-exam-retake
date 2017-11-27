package com.greenfox.examretake;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping(value = "/warehouse")
    public String warehouse(Model model){
        model.addAttribute("cloths" , clothingRepo.findAll());
        return "warehouse";
    }
}
