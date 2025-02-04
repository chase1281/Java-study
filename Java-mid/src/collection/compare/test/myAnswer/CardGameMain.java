package collection.compare.test.myAnswer;

import java.util.*;

public class CardGameMain {
    public static void main(String[] args) {

        Deck deck = new Deck(new ArrayList<>());
        List<Card> list = deck.getDeck();
        Collections.shuffle(list);

        Player player1 = new Player();
        Player player2 = new Player();

        player1.setCards(list);
        player1.cardSort();
        player2.setCards(list);
        player2.cardSort();

        System.out.print("플레이어1의 카드: ");
        player1.printCards();
        System.out.println();

        System.out.print("플레이어2의 카드: ");
        player2.printCards();
        System.out.println();

        WhoIsWinner(player1.getTotal(), player2.getTotal());
    }

    private static void WhoIsWinner(int total1, int total2) {
        if(total1 > total2){
            System.out.println("플레이어1 승리");
            return;
        }
        else if(total1 < total2){
            System.out.println("플레이어2 승리");
            return;
        }
        System.out.println("무승부");
    }
}
