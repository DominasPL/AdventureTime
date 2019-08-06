package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import com.github.DominasPL.AdventureTime.dtos.HeroDTO;
import com.github.DominasPL.AdventureTime.services.CardService;
import com.github.DominasPL.AdventureTime.services.DeckService;
import com.github.DominasPL.AdventureTime.services.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/deck/fraction/{id}/new_deck")
public class NewDeckController {

    private HeroService heroService;
    private CardService cardService;
    private DeckService deckService;

    public NewDeckController(HeroService heroService, CardService cardService, DeckService deckService) {
        this.heroService = heroService;
        this.cardService = cardService;
        this.deckService = deckService;
    }

    @GetMapping
    public String displayDeckForm(@PathVariable("id") Long fractionId, Model model) {

        List<HeroDTO> allHeroes = heroService.findAllHeroes();
        List<CardDTO> allFractionCards = cardService.findAllFractionCards(fractionId);
        model.addAttribute("heroes", allHeroes);
        model.addAttribute("cards", allFractionCards);

        return "deck-form";
    }

    @PostMapping
    public String saveNewDeck(@RequestParam("hero") Long heroId, @RequestParam("deckName") String deckName, @RequestParam("cards") Long[] cards, Principal principal) {

        deckService.saveDeck(heroId, deckName, cards, principal.getName());


        return "redirect:/";
    }

}
