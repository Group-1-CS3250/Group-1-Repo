import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	private List<Card> deck = new ArrayList<>();


    public Deck() {
	String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0; i < suits.length; i++){
			for(int j = 0; j< ranks.length; j++){
				Card newCard = new Card(ranks[j],suits[i]);
				deck.add(newCard);
			}
		}
    }
    // shuffles deck
    public void shuffle() {
	Collections.shuffle(deck);
	System.out.println("Cards Shuffled");
    }
    //draws card from top of deck and adds it to the end of the deck
    // todo: add functionality to add to discard, to indicate when decks needs to be reshuffled
    public Card draw() {
        Card first = deck.remove(0);
        System.out.println(first.DisplayCard());
        deck.add(first);
		return first;
    }
    public void showAll() {
    	for (Card c: deck) {
    	    System.out.println(c.DisplayCard());
    	}
    }
    
}
	
