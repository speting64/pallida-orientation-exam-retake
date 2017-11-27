package com.greenfox.examretake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    ClothingRepo clothingRepo;

    @GetMapping(value = "/warehouse")
    public String warehouse(Model model){
        model.addAttribute("cloths" , clothingRepo.findAll());
        return "warehouse";
    }

    @PostMapping("/warehouse/summary")
    public String summary(Model model, @RequestParam String name){

        model.addAttribute("cloths" , clothingRepo.findAllByNameIsLike(name));
        return "warehouse";

    }



}
