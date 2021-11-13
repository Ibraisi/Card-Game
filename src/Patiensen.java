public class Patiensen {

	public static void main(String[] args) {
		double counter = 0;
	for(int i = 0; i<10000000; i++) {
		CardDeck patiensen = new CardDeck();
		patiensen.shuffle();
		Card first;
		Card second;
		Card third;
		while(patiensen.moreCards()) {
			first = patiensen.getCard();
			if(first.getRank()==1 || !patiensen.moreCards() )
				break;
			second = patiensen.getCard();
			if(second.getRank()==2 || !patiensen.moreCards())
				break;
			third = patiensen.getCard();
			if(third.getRank()==3)
				break;
		}
		if(!patiensen.moreCards())
			counter++;
	}
	double asnwer = counter/10000000;
	System.out.println();
		System.out.println(asnwer);

	}
}
