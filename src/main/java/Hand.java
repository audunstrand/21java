import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {
    private List<Card> cards = new ArrayList<>();
    private PointCalculator calculator = new PointCalculator();

    public void addCards(Card card) {
        cards.add(card);
    }

    int points() {
        return calculator.sum(cards);
    }

    boolean is21() {
        return calculator.sum(cards) == 21;
    }

    @Override
    public String toString() {
        return cards.stream().map(Card::toString).collect(Collectors.joining(" - ")) + ". Points = " + points() ;
    }
}
