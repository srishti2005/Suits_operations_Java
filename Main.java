//Main.java

import java.util.*;
class Main{
	public static void main(String args []){
		Deck deck = new Deck();
		System.out.println("_______________Create Deck _________________");
		deck.createDeck();
		System.out.println("_______________Print Deck _________________");
		deck.displayDeck();
		System.out.println("_______________Shuffle Deck _________________");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("_______________Random Crads_________________");
		deck.shuffleDeck();
		deck.randomCards();
		deck.displayDeck();
	}
	
}
