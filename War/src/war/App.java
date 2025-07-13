package war;

	public class App {
		
		
	public static void main(String[] args) {
		System.out.println("Welcome to War - Let's Play!");
	
		//Instantiate Deck & Two Players:
		Deck deck = new Deck();
		Players player1 = new Players("Santa");
		Players player2 = new Players("Elf");
		
		
		//shuffle(cards);
		deck.shuffle();
		
		//deal cards into each players hand
		for (int i = 26; i > 0; i--) {
			
			player1.hand.add(deck.draw());
			
			player2.hand.add(deck.draw());
			
		}
		System.out.println("Player 1 Hand: ");
		player1.describe(player1);
		System.out.println("Player 2 Hand: ");
		player2.describe(player2);
		System.out.println("All cards have been dealt.  Let's play");
			
			
		//play cards from each players hand to see who wins the round, repeats 26 times
 		for (int i = 0; i < 26; i++) {
 			System.out.println("Round # " + (i+1));	
 				Card p1Card = player1.flip();
				Card p2Card = player2.flip();
				System.out.print(player1.getName() + "'s card is: ");
				
				p1Card.describe();
				System.out.print(player2.getName() + "'s card is: ");

				p2Card.describe();
								
				if(p1Card.getValue() > p2Card.getValue()) {
						player1.incrementScore();
						System.out.println(player1.getName() + " earned a point!");
					} else if (p2Card.getValue() > p1Card.getValue()) {
						player2.incrementScore();
							System.out.println(player2.getName() + " earned a point!");
					} else {
							System.out.println("Tie round - no points were awarded");
					}
					System.out.println(player1.getName() + "'s Score: " + player1.getScore());
					System.out.println(player2.getName() + "'s Score: " + player2.getScore());
					System.out.println();
 		}
 		
		
		// Winner determination
			System.out.println("Game Over. We have a winner! Congratulations!");	
			
			
			if (player1.getScore() > player2.getScore()) {
				System.out.println(player1.getName() + " won this game!  Congrats!");
			
			} else if (player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + " won this game!  Congrats!");
				
			} else {
				System.out.println("Tie Game!");
			}
	
}
}	