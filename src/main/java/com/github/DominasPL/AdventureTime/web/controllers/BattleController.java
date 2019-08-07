package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.domain.repositories.DeckRepository;
import com.github.DominasPL.AdventureTime.dtos.BattleDeckDTO;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;
import com.github.DominasPL.AdventureTime.dtos.HeroDTO;
import com.github.DominasPL.AdventureTime.services.DeckService;
import com.github.DominasPL.AdventureTime.services.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/battle/{id}")
public class BattleController {

    private DeckService deckService;
    private HeroService heroService;

    public BattleController(DeckService deckService, HeroService heroService) {
        this.deckService = deckService;
        this.heroService = heroService;
    }

    @GetMapping
    public String battle(@PathVariable("id") Long id, Model model) {

        BattleDeckDTO battleDeck = deckService.findBattleDeckById(id);

        model.addAttribute("deck", battleDeck);
        return "battle";

    }

    @ModelAttribute
    public BattleDeckDTO drawCompCards() {

        BattleDeckDTO battleDeckDTO = new BattleDeckDTO();
        heroService.findAll();
        //Zmienic hero na heroDTO, user na userDTO w BattleDeckDTO

    }


}
