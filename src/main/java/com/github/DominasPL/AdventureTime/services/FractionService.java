package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.FractionConverter;
import com.github.DominasPL.AdventureTime.domain.entities.Fraction;
import com.github.DominasPL.AdventureTime.domain.repositories.FractionRepository;
import com.github.DominasPL.AdventureTime.dtos.FractionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FractionService {

    private static final Logger logger = LoggerFactory.getLogger(FractionService.class);

    private FractionRepository fractionRepository;

    public FractionService(FractionRepository fractionRepository) {
        this.fractionRepository = fractionRepository;
    }


    public List<FractionDTO> loadAllFractions() {

        List<Fraction> allFractions = fractionRepository.findAll();

        if (allFractions == null) {
            logger.info("Fractions not found!");
            return null;
        }

        return FractionConverter.convertToFractionDTOList(allFractions);

    }

    public FractionDTO findFractionById(Integer id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Fraction> optionalFraction = fractionRepository.findById(id);
        Fraction fraction = optionalFraction.orElse(null);

        if (fraction == null) {
            logger.info("Fraction not found!");
            return null;
        }

        return FractionConverter.convertToFractionDTO(fraction);

    }
}
