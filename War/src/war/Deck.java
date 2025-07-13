package war;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<>();
	


//Methods
public void shuffle () {
	//randomizes cards 
	Collections.shuffle(cards);
}
	
	
public Card draw () {
	if (cards.isEmpty()) {
		throw new IllegalStateException("Cannot draw from empty deck");
	}
	return cards.remove(0);
	}

public Deck() {
	String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"}; 
	String[] valueNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; 
	for (String suit : suits) {
		int count = 2;
			for (String valueName : valueNames) {
						
					String name = valueName + " of " + suit + " with a value of: " + count ;
					Card card = new Card(count, name);	
					cards.add(card);
					count++;
				
}}}
}
