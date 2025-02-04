package collection.compare.test.myAnswer;

import java.util.List;

public class Deck{
    private final String[] images = {"\u2660", "\u2665", "\u2666", "\u2663"};
    private List<Card> deck;

    public Deck(List<Card> deck) {
        for (String image : images) {
            for (int i = 1; i < 14; i++) {
                deck.add(new Card(i, image));
            }
        }
        this.deck = deck;
    }

    public List<Card> getDeck() {
        return deck;
    }
}
