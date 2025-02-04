package collection.compare.test.refactor;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand = new ArrayList<>();
    private int total;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void drawHand(List<Card> deck){
        hand.add(deck.removeFirst());
    }

    public int getTotal(){
        for (Card card : hand) {
            total += card.getRank();
        }
        return total;
    }
}
