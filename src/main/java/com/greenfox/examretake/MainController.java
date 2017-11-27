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

    @Autowired
    Clothing clothing;

    @Autowired
    ErrorMessage errorMessage;

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

    @GetMapping("/warehouse/query")
    public ApiResponse api(@RequestParam float price){
        if (clothing.getPrice() < 50.0){
            return new ApiResponse(clothingRepo.findAllByPriceLessThan(price));
        }
        return errorMessage.getErrorMessage("TOO MUCH");
    }



}
