import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	private static final String[] SUITS = {"Club", "Diamond", "Heart", "Spade"};
	private static final String[] VALUES = {"Ace","King", "Queen","Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five",
		"Four", "Three", "Two" };
	ArrayList<Card> deckOfCards= new ArrayList<Card>();

	public CardDeck() {
		for(int i = 0; i <= SUITS.length - 1; i++) {
			for(int j = 0; j<= VALUES.length - 1; j++) {
				Card card = new Card(SUITS[i], VALUES[j]);
				deckOfCards.add(card);
			}
		}	
	}
	
	public String drawTopCardFromDeck() {
		Card drawnCard = deckOfCards.get(0);
		deckOfCards.remove(0);
		String drawnCardInfo = drawnCard.getCardSuit() + "/" + drawnCard.getCardValue();
		return drawnCardInfo;
	}
	
	public void shuffleDeckUsingCollections() {
		Collections.shuffle(deckOfCards);
	}
}
