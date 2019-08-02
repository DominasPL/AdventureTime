package com.github.DominasPL.AdventureTime.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adventure/fraction")
public class FractionController {

    @GetMapping
    public String displayAllFractions() {
        

        return "fractions";
    }

}
