package collection.compare.test.refactor;

public class Card implements Comparable<Card>{
    private final Suit suit;
    private final int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }

    @Override
    public int compareTo(Card anotherCard) {
        if(rank != anotherCard.rank){
            return Integer.compare(rank, anotherCard.rank);
        }else{
            return suit.compareTo(anotherCard.suit);
        }
    }
}
