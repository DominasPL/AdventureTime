package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.DeckConverter;
import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.repositories.CardRepository;
import com.github.DominasPL.AdventureTime.domain.repositories.DeckRepository;
import com.github.DominasPL.AdventureTime.domain.repositories.HeroRepository;
import com.github.DominasPL.AdventureTime.domain.repositories.UserRepository;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DeckService {

    private DeckRepository deckRepository;
    private UserRepository userRepository;
    private HeroRepository heroRepository;
    private CardRepository cardRepository;

    public DeckService(DeckRepository deckRepository, UserRepository userRepository, HeroRepository heroRepository, CardRepository cardRepository) {
        this.deckRepository = deckRepository;
        this.userRepository = userRepository;
        this.heroRepository = heroRepository;
        this.cardRepository = cardRepository;
    }

    @Transactional
    public void saveDeck(Long heroId, String deckName, Long[] cards, String username) {

        if (heroId == null || deckName == null || username == null) {
            throw new IllegalArgumentException("Parameters can't be null!");
        }

        Optional<Hero> optionalHero = heroRepository.findById(heroId);
        Hero hero = optionalHero.orElse(null);

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (hero == null || user == null) {
            throw new IllegalStateException("Hero not found!");
        }

        List<Card> chosenCards = cardRepository.findByIdIn(cards);

        Deck deck = new Deck();
        deck.setDeckName(deckName);
        deck.setCards(chosenCards);
        deck.setUser(user);
        deck.setHero(hero);

        deckRepository.save(deck);
    }

    public List<DeckDTO> findAllUserDecks(String username) {
        if (username == null) {
            throw new IllegalArgumentException("Username must be given!");
        }

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            throw new IllegalStateException("User not found!");
        }

        List<Deck> userDecks = user.getDecks();

        return DeckConverter.convertToDeckDTOList(userDecks);

    }

    public DeckDTO findById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Deck> optionalDeck = deckRepository.findById(id);
        Deck deck = optionalDeck.orElse(null);

        if (deck == null) {
            throw new IllegalStateException("Deck not found!");
        }

        return DeckConverter.convertToDeckDTO(deck);
    }

}
