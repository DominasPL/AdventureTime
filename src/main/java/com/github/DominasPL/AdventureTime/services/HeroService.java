package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.domain.repositories.HeroRepository;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }


}
