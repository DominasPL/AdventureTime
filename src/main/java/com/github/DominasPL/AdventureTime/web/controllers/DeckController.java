package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.DeckDTO;
import com.github.DominasPL.AdventureTime.services.DeckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/deck")
public class DeckController {

    private DeckService deckService;

    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping
    public String displayUserDecks(Model model, Principal principal) {

        List<DeckDTO> allUserDecks = deckService.findAllUserDecks(principal.getName());
        model.addAttribute("decks", allUserDecks);

        return "decks";
    }

}
