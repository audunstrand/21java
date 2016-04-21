import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {

    @Test
    public void testCardValue() {

        final Card ace = new Card(Card.Color.DIAMONDS, Card.Value.ACE);
        final Card king = new Card(Card.Color.DIAMONDS, Card.Value.KING);
        final Card two = new Card(Card.Color.DIAMONDS, Card.Value.TWO);
        final Card four = new Card(Card.Color.DIAMONDS, Card.Value.FOUR);

        assertEquals(new PointCalculator().sum(ace, king), 21);
        assertEquals(new PointCalculator().sum(ace, two), 13);
        assertEquals(new PointCalculator().sum(ace, four), 15);
        assertEquals(new PointCalculator().sum(two, four), 6);
    }
}
