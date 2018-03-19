
public class Card {
	
	String cardSuit;
	String cardValue;
	public Card(String cardSuit, String cardValue) {
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}

	public String getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
	public String getCardValue() {
		return cardValue;
	}
	public void setCardValue(String cardValue) {
		this.cardValue = cardValue;
	}
	
}
