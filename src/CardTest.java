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
	
	@Test
	public void testGetCardSuit() {
		assertEquals(suit, card.getCardSuit());
	}

	@Test
	public void testSetCardSuit() {
		card.setCardSuit("Club");
		assertEquals("Club", card.cardSuit);
	}

	@Test
	public void testGetCardValue() {
		assertEquals(value, card.getCardValue());
	}

	@Test
	public void testSetCardValue() {
		card.setCardValue("King");
		assertEquals("King", card.getCardValue());
	}

}
