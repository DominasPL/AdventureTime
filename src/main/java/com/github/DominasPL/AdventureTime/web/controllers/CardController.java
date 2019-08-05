package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.domain.entities.Fraction;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import com.github.DominasPL.AdventureTime.dtos.FractionDTO;
import com.github.DominasPL.AdventureTime.services.CardService;
import com.github.DominasPL.AdventureTime.services.FractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class CardController {

    private CardService cardService;
    private FractionService fractionService;

    public CardController(CardService cardService, FractionService fractionService) {
        this.cardService = cardService;
        this.fractionService = fractionService;
    }

    @GetMapping
    public String displayAvailableCards(@PathVariable("id") Long id, Model model) {

        List<CardDTO> allFractionCards = cardService.findAllFractionCards(id);
        FractionDTO fraction = fractionService.findFractionById(id);

        model.addAttribute("cards", allFractionCards);
        model.addAttribute("fraction", fraction);

        return "cards";
    }

}
