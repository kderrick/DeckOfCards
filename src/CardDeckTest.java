import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardDeckTest {

	private CardDeck deck;
	
	@Before
    public void setup() {
		deck = new CardDeck();
        
    }

	@Test
	public void testCardDeckConstructor() {
		String firstCardSuit = deck.deckOfCards.get(0).getCardSuit();
		String firstCardValue = deck.deckOfCards.get(0).getCardValue();
		assertEquals("Club", firstCardSuit);
		assertEquals("Ace", firstCardValue);
	}

}
