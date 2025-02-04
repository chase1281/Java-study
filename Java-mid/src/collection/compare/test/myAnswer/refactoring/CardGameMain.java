package collection.compare.test.refactor;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.setDeck();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawHand(deck.getDeck());
            player2.drawHand(deck.getDeck());
        }
        player1.getHand().sort(null);
        player2.getHand().sort(null);

        printCard(player1);
        printCard(player2);

        getWinner(player1, player2);
    }

    private static void getWinner(Player player1, Player player2) {
        if(player1.getTotal() > player2.getTotal()) System.out.println(player1.getName() + " 승리");
        else if(player1.getTotal() < player2.getTotal()) System.out.println(player2.getName() + " 승리");
        else System.out.println("무승부");
    }


    private static void printCard(Player player) {
        System.out.println(player.getName() + ": " + player.getHand()
         + ", 합계: " + player.getTotal());
    }
}
