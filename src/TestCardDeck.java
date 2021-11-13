public class TestCardDeck {
 	/** Program f�r att testa metoderna i klassen CardDeck */
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		CardDeck deck2 = new CardDeck();

		System.out.println("Oblandad kortlek:");
		while (deck.moreCards()) {
			Card c = deck.getCard();
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Blandad kortlek:");
		int[] suitVect = new int[4];   // Antal spader, hj�rter etc
		int[] rankVect = new int[13];  // Antal 1:or, 2:or etc
		deck2.shuffle();
		while (deck2.moreCards()) {
			Card c = deck2.getCard();
			suitVect[c.getSuit() - Card.SPADES]++; 
			rankVect[c.getRank() - 1]++;
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Antal kort i de olika f�rgerna: ");
		for (int i = 0; i <= 3; i++) {
			System.out.print(suitVect[i] + " ");
		}
		System.out.println();
		System.out.print("Antal kort i de olika val�rerna: ");
		for (int i = 0; i <= 12; i++) {
			System.out.print(rankVect[i] + " ");
		}
		System.out.println();
	}
}