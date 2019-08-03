package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.domain.repositories.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }



}
