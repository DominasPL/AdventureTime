package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import com.github.DominasPL.AdventureTime.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/adventure/fraction/{id}/cards")
public class CardController {

    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public String displayAvailableCards(@PathVariable("id") Integer id, Model model) {

        List<CardDTO> allFractionCards = cardService.findAllFractionCards(id);
        System.out.println(allFractionCards);

        return "";
    }

}
