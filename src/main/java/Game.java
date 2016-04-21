import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    private static int NO_OF_CARDS_TO_START_WITH = 2;

    public static void main(String[] args) {
        System.out.println(new Game().run() + " won");
    }

    private String run() {
        Integer sam = 0;
        Integer dealer = 0;
        List<Integer> deck = new ArrayList<>(Arrays.asList(
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
        ));
        Collections.shuffle(deck);

        for (int i = 0; i < NO_OF_CARDS_TO_START_WITH; i++) {
            sam += deck.remove(0);
            dealer += deck.remove(0);
        }

        if (sam == 21) {
            return "sam";
        }
        if (dealer == 21) {
            return "dealer";
        }

        sam = play(sam, deck);
        if (sam > 21) {
            return "dealer";
        }

        dealer = play(dealer, deck);
        if (dealer > 21) {
            return "sam";
        }

        final int x = sam.compareTo(dealer);
        if (x == 0) {
            return "noone";
        } else {
            return (x > 0 ? "sam" : "dealer");
        }
    }

    private Integer play(Integer points, List<Integer> deck) {
        while (points < 17) {
            points += deck.remove(0);
            if (points > 21) {
                break;
            }
        }
        return points;
    }
}
