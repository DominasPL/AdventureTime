package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.repositories.CardRepository;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }


    public String  findAllFractionCards() {

//        List<Card> cards = cardRepository.findByFraction();

        return "";
    }
}
