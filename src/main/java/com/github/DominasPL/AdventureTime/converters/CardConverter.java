package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;

import java.util.ArrayList;
import java.util.List;

public class CardConverter {

    public static List<CardDTO> convertToCardDTOList(List<Card> cards) {

        List<CardDTO> cardDTOS = new ArrayList<>();

        for (Card card : cards) {
            CardDTO cardDTO = new CardDTO();
            cardDTO.setAttack(card.getAttack());
            cardDTO.setCardName(card.getCardName());
            cardDTO.setDefence(card.getDefence());
            cardDTO.setHP(card.getHP());
            cardDTO.setMagicCost(card.getMagicCost());
            cardDTOS.add(cardDTO);
        }

        return cardDTOS;

    }
}
