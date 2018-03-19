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
		String drawnCardInfo = "";
		
		if(deckOfCards.size() > 0) {
		Card drawnCard = deckOfCards.get(0);
		deckOfCards.remove(0);
		drawnCardInfo = drawnCard.getCardSuit() + "/" + drawnCard.getCardValue();
		} else {
			drawnCardInfo = "There are no cards left";
		}
		return drawnCardInfo;
	}
	
	public void shuffleDeckUsingCollections() {
		Collections.shuffle(deckOfCards);
	}
	
	public void shuffleDeckWithoutUsingCollections() {
		for(int i = 0; i <= deckOfCards.size() -1 ; i++) {
		int indexToShuffleCardTo = (int)Math.random()*(deckOfCards.size() -1);
		Card cardBeingShuffled = deckOfCards.get(i);
		deckOfCards.remove(i);
		deckOfCards.add(indexToShuffleCardTo, cardBeingShuffled);
		
		}
	}
}
