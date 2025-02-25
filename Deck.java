import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> shoe = new ArrayList<Card>();
    private ArrayList<Card> shoe1 = new ArrayList<Card>();

    // No-arg constructor should build a deck out of 52 cards
    public Deck() {
        for (int j = 1; j < 5; j++) {
        for (int i = 1; i < 14; i++) {
            if(i != 0&& j !=0){
                shoe.add(new Card(i, j));
            }
        }
    }
    }
    

    // Constructor receiving an integer will build shoe out of <int> decks.
    public Deck(int numDecks) {
    }

    // Make getter and setter for shoe datafield

    // shuffle method will randomly shuffle the elements in the ArrayList. None of
    // the
    // Cards should be lost, just moved to a new index within the ArrayList.
    public void shuffle() {
       
            for (int i = 1; i < 14; i++) {
                for (int j = 1; j < 5; j++) {
                if(new Card(i,j) != null){
                    shoe1.add(new Card(i, j));
                }
            }
        }
        shoe = shoe1;

    }

    // dealHand - This method will remove and output the top five Cards from the
    // shoe ArrayList
    public void dealHand() {
        for(int i = 0; i <5 ;i++)
        System.out.println(shoe.indexOf(i));
    }

    // toString - This method will return a String holding the contents of the Deck
    // with five cards per line (\n)- Use tabs (\t) or another mechanism to separate
    // them
    // extra credit if all cards line up when outputted

    public String toString() {
        return shoe.toString();
    }
}