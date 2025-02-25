import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> shoe = new ArrayList<Card>();
    private ArrayList<Card> shoe1 = new ArrayList<Card>();

    // No-arg constructor should build a deck out of 52 cards
    public Deck() {

    }

    // Constructor receiving an integer will build shoe out of <int> decks.
    public Deck(int numDecks) {
    }

    // Make getter and setter for shoe datafield

    // shuffle method will randomly shuffle the elements in the ArrayList. None of
    // the
    // Cards should be lost, just moved to a new index within the ArrayList.
    public void shuffle() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                shoe1.add(new Card(i, j));
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
        return "";
    }
}