import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {
	
	Card card = new Card("Heart", "Ace");
	String suit = "Heart";
	String value = "Ace";

	@Test
	public void testCardConstructor() {
		assertEquals(suit, card.cardSuit);
		assertEquals(value, card.cardValue);
	}

}
