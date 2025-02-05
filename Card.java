//Card.java
class Card{
	String rank;
	String suit;
	
	public Card(String rank , String suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){
		return rank+" of"+suit;
	} 
}
	public void createDeck(){
		String[] ranks = {"2" , "3" , "4", "5" , "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Spades" , "Hearts" , "Diamonds" ,"Clubs"};
		
		for (String rank : ranks){
			for(String suit : suits){
				deck.add(new Card(rank,suit));
			}
				
		}
			
	}
	public void displayDeck(){
		for (Card card : deck){
			System.out.println(card);
		}
	}
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
