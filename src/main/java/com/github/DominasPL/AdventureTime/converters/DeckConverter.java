package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;

import java.util.ArrayList;
import java.util.List;

public class DeckConverter {

    public static List<DeckDTO> convertToDeckDTOList(List<Deck> userDecks) {

        List<DeckDTO> deckDTOS = new ArrayList<>();

        for (Deck deck : userDecks) {
            DeckDTO deckDTO = new DeckDTO();
            deckDTO.setNumberOfCards(deck.getNumberOfCards());
            deckDTO.setMagicAmount(deck.getMagicAmount());
            deckDTO.setHeroName(deck.getHero().getHeroName());
            deckDTO.setHeroAvailableTurn(deck.getHero().getAvailableTurn());

            List<CardDTO> cardDTOS = CardConverter.convertToCardDTOList(deck.getCards());
            deckDTO.setCards(cardDTOS);

            deckDTOS.add(deckDTO);
        }

        return deckDTOS;

    }
}
