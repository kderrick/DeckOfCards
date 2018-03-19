import java.util.ArrayList;

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
}
