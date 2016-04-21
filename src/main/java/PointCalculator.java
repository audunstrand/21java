import java.util.List;

public class PointCalculator {

    public int sum(Card first, Card second){
        return first.value.value + second.value.value;
    }

    public int sum(List<Card> cards){
        return cards.stream().mapToInt(c -> c.value.value).sum();
    }

}
