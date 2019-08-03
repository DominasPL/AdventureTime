package com.github.DominasPL.AdventureTime.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adventure/fraction/deck")
public class DeckController {

    

    @GetMapping
    public String displayAvailableCards(Model model) {



    }

}
