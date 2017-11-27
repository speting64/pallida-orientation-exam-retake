package com.greenfox.examretake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class MainController {

    @Autowired
    ClothingRepo clothingRepo;

    @GetMapping(value = "/warehouse")
    public String warehouse(Model model){
        model.addAttribute("cloths" , clothingRepo.findAll());
        return "warehouse";
    }

    @Postmapping("/warehouse/summary")
    public String summary

}
