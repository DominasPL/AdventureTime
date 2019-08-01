package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import com.github.DominasPL.AdventureTime.dtos.HeroDTO;

import java.util.ArrayList;
import java.util.List;

public class HeroConverter {

    public static List<HeroDTO> convertToHeroDTOList(List<Hero> heroes) {

        List<HeroDTO> heroDTOS = new ArrayList<>();

        for (Hero hero : heroes) {
            HeroDTO heroDTO = new HeroDTO();
            heroDTO.setHeroName(hero.getHeroName());
            heroDTO.setMagicCost(hero.getMagicCost());
            heroDTOS.add(heroDTO);
        }

        return heroDTOS;
    }
}
