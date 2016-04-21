
public class Card {
    Color color;
    Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public static enum Color {
        SPADES, CLOVERS, HARTS, DIAMONDS
    }

    public static enum Value {
        ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), JACK(10), QUEEN(10), KING(10);

        int value;

        Value(int value) {
            this.value = value;
        }

    }

    @Override
    public String toString() {
        return value + " of " + color;
    }
}
