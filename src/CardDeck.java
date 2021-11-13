 import java.util.Random;
public class CardDeck {
	
	private Card[] theCards;
	int CardsNum = 52;

	public CardDeck() {
		theCards = new Card[52];
		int rank = 1;
		int suit = Card.SPADES;
			for(int i = 0; i<theCards.length; i++) {
				if(rank == 14) {
					rank = 1;
					suit++;
				}
				theCards[i] = new Card(suit, rank);
				rank++;
			}
		}
	
	public void shuffle() {
		Random rand  = new Random();
		int nr;
		for(int i = 0; i<theCards.length;i++) {
			nr = rand.nextInt(52);
			Card temp = theCards[i];
			theCards[i] = theCards[nr];
			theCards[nr] = temp;
		}
		
	}
	public boolean moreCards() {
		
		return CardsNum!=0;
	}
	
	public Card getCard() {
		CardsNum -=1;
		Card firstCard = theCards[CardsNum];
		return firstCard;
	}

}


