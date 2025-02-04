package collection.compare.test.myAnswer;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards;
    private int total;

    public Player() {
        this.cards = new ArrayList<>();
    }

    public void setCards(List<Card> list) {
        for (int i = 0; i < 5; i++) {
            cards.add(list.getFirst());
            list.removeFirst();
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getTotal() {
        return total;
    }

    public int calculateTotal(){
        for (Card card : cards) {
            total += card.getNumber();
        }
        return total;
    }

    public void cardSort(){
        cards.sort(null);
    }

    public void printCards() {
        int count = 1;
        System.out.print("[");
        for (Card card : cards) {
            System.out.print(card);
            if(count < cards.size()) System.out.print(", ");
            count++;
        }
        System.out.print("], 합계: " + calculateTotal());
    }
}
