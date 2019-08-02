package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.FractionDTO;
import com.github.DominasPL.AdventureTime.services.FractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/adventure/fraction")
public class FractionController {

    private FractionService fractionService;

    public FractionController(FractionService fractionService) {
        this.fractionService = fractionService;
    }

    @GetMapping
    public String displayAllFractions(Model model) {

        List<FractionDTO> fractions = fractionService.loadAllFractions();
        model.addAttribute("fractions", fractions);

        return "fractions";
    }

}
