import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> deck = new ArrayList<>();

    public Deck() {

        for (Card.Color color : Card.Color.values()) {
            for (Card.Value value : Card.Value.values()) {
                deck.add(new Card(color, value));
            }
        }
        Collections.shuffle(deck);
    }
    public Card getTop(){
        return deck.remove(0);
    }
}
