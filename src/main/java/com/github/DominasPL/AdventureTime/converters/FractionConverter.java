package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Fraction;
import com.github.DominasPL.AdventureTime.dtos.FractionDTO;

import java.util.ArrayList;
import java.util.List;

public class FractionConverter {


    public static List<FractionDTO> convertToFractionDTOList(List<Fraction> allFractions) {

        List<FractionDTO> fractionDTOList = new ArrayList<>();

        for (Fraction fraction : allFractions) {
            FractionDTO fractionDTO = new FractionDTO();
            fractionDTO.setId(fraction.getId());
            fractionDTO.setFractionName(fraction.getFractionName());
            fractionDTOList.add(fractionDTO);
        }

        return fractionDTOList;
    }

    public static FractionDTO convertToFractionDTO(Fraction fraction) {

        FractionDTO fractionDTO = new FractionDTO();
        fractionDTO.setId(fraction.getId());
        fractionDTO.setFractionName(fraction.getFractionName());

        return fractionDTO;
    }
}
