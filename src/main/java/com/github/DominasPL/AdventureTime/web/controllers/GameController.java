package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.HeroDTO;
import com.github.DominasPL.AdventureTime.services.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/adventure")
public class GameController {

    private HeroService heroService;

    public GameController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public String displayHeroes(Model model) {

        List<HeroDTO> allHeroes = heroService.findAllHeroes();
        model.addAttribute("heroes", allHeroes);

        return "heroes";
    }

}
