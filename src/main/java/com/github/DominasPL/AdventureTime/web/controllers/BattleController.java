package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.domain.repositories.DeckRepository;
import com.github.DominasPL.AdventureTime.dtos.BattleDeckDTO;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;
import com.github.DominasPL.AdventureTime.services.DeckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/battle/{id}")
public class BattleController {

    private DeckService deckService;

    public BattleController(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping
    public String battle(@PathVariable("id") Long id, Model model) {

        BattleDeckDTO battleDeck = deckService.findBattleDeckById(id);

        model.addAttribute("deck", battleDeck);
        return "battle";

    }


}
