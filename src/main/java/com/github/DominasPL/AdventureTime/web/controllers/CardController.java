package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adventure/fraction/cards")
public class CardController {

    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public String displayAvailableCards(Model model) {

        cardService.findAllFractionCards();

        return "";
    }

}
