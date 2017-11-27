package com.greenfox.examretake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @Autowired
    ClothingRepo clothingRepo;

    @GetMapping(value = "/warehouse")
    public String warehouse(Model model){
        model.addAttribute("cloths" , clothingRepo.findAll());
        return "warehouse";
    }
}
