package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.Converter;
import com.github.DominasPL.AdventureTime.converters.HeroConverter;
import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import com.github.DominasPL.AdventureTime.domain.repositories.HeroRepository;
import com.github.DominasPL.AdventureTime.dtos.HeroDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    private HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<HeroDTO> findAllHeroes() {
        List<Hero> heroes = heroRepository.findAll();

        return HeroConverter.convertToHeroDTOList(heroes);
    }
}
