import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardDeckTest {

	private CardDeck deck;
	private CardDeck deck2;
	
	@Before
    public void setup() {
		deck = new CardDeck();
		deck2 = new CardDeck();
        
    }

	@Test
	public void testCardDeckConstructor() {
		String firstCardSuit = deck.deckOfCards.get(0).getCardSuit();
		String firstCardValue = deck.deckOfCards.get(0).getCardValue();
		assertEquals("Club", firstCardSuit);
		assertEquals("Ace", firstCardValue);
	}

	
	@Test
	public void testDrawTopCardFromDeck() {
		assertEquals("Club/Ace", deck.drawTopCardFromDeck());
		assertEquals(51, deck.deckOfCards.size());
	}
	
	@Test
	public void testShuffleDeckUsingCollections() {
		deck.shuffleDeckUsingCollections();
		assertNotEquals(deck.drawTopCardFromDeck(), deck2.drawTopCardFromDeck());
		
	}
	
	@Test
	public void testShuffleDeckWithoutUsingCollections() {
		deck.shuffleDeckWithoutUsingCollections();
		assertNotEquals(deck.drawTopCardFromDeck(), deck2.drawTopCardFromDeck());
		
	}
}
