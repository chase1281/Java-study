package collection.compare.test.refactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public void setDeck(){
        initDeck();
        shuffle();
    }

    private void initDeck() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(suit, i));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getDeck() {
        return deck;
    }
}
