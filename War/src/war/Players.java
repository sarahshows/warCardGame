package war;

import java.util.ArrayList;
import java.util.List;

public class Players {

	public List <Card> hand = new ArrayList<>();
	
	private int score;
	
	private String name;

	
	public Players() {
	}		  
	

public Players(String string) {
		this.name = string;
	}


public void draw(Deck deck) {
	hand.add(deck.draw());
}

public Card flip () {
	if (hand.isEmpty()) {
		throw new IllegalStateException("Cannot draw from empty deck");
	}
	return hand.remove(0);
	} 	
public void describe(Players player) {
	for (Card card : hand) {
		card.describe();
	}
}
public void incrementScore () {
	score++;
}


public List<Card> getHand() {
	return hand;
}


public int getScore() {
	return score;
}


public String getName() {
	return name;
}


public void setHand(List<Card> hand) {
	this.hand = hand;
}


public void setScore(int score) {
	this.score = score;
}


public void setName(String name) {
	this.name = name;
}
}
