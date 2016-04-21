public class Game {
    private static int NO_OF_CARDS_TO_START_WITH = 2;

    public static void main(String[] args) {
        new Game().run();
    }

    public void run() {
        Hand sam = new Hand();
        Hand dealer = new Hand();
        Deck deck = new Deck();
        deal(deck, sam, dealer);

        if (hasBlackjack(sam)){
            System.out.println("Sam won " + sam);
            return;
        }
        if (hasBlackjack(dealer)){
            System.out.println("dealer won"+ dealer);
            return;
        }

        while(sam.points()<17){
            sam.addCards(deck.getTop());
            System.out.println("sam: "+ sam);
            if(sam.points()>21){
                System.out.println("sam lost with " + sam.points() + " points");
                return;
            }
        }
        while(dealer.points()<17){
            dealer.addCards(deck.getTop());
            System.out.println("dealer: "+ dealer);

            if(dealer.points()>21){
                System.out.println("dealer lost with " + dealer.points() + " points");
                return;
            }
        }

        System.out.println("GAME OVER");
        System.out.println("sam " + sam );
        System.out.println("delaer " + dealer);


    }


    private void deal(Deck deck, Hand player1, Hand player2) {
        for (int i = 0; i < NO_OF_CARDS_TO_START_WITH; i++) {
            player1.addCards(deck.getTop());
            player2.addCards(deck.getTop());
        }
    }

    public boolean hasBlackjack(Hand hand) {
        return hand.is21();
    }


}
