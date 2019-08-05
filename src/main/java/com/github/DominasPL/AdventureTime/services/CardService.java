package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.CardConverter;
import com.github.DominasPL.AdventureTime.converters.Converter;
import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.repositories.CardRepository;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private static final Logger logger = LoggerFactory.getLogger(CardService.class);

    private CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardDTO> findAllFractionCards(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id can't be null!");
        }

        List<Card> cards = cardRepository.findByFraction(id);

        if (cards == null) {
            logger.info("Fraction cards not found!");
            return null;
        }

        return CardConverter.convertToCardDTOList(cards);
    }
}
