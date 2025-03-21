import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> shoe = new ArrayList<Card>();
    
    public ArrayList<Card> getShoe() {
        return shoe;
    }

    // No-arg constructor should build a deck out of 52 cards
    public Deck() {
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                shoe.add(new Card(rank, suit));
            }
        }
    }


    // Constructor receiving an integer will build shoe out of <int> decks.
    public Deck(int numDecks) {
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                for (int deck = 0; deck < numDecks; deck++) {
                    shoe.add(new Card(rank, suit));
                }
            }
        }
    }


    // Custom shuffle method will randomly shuffle the elements in the ArrayList.
    public void shuffle() {
        for (int i = shoe.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Card temp = shoe.get(i);
            shoe.set(i, shoe.get(j));
            shoe.set(j, temp);
        }
    }


    // dealHand - This method will remove and output the top five Cards from the shoe ArrayList
    public void dealHand() {
        for (int i = 0; i < 5; i++) {
            if (!shoe.isEmpty()) {
                System.out.println(shoe.remove(0));
            }
        }
    }


    public String toString() {
        String result = "";
        for (int i = 0; i < shoe.size(); i++) {
            result += shoe.get(i).toString();
            if ((i + 1) % 5 == 0) {
                result += "\n";
            } else {
                result += "\t";
            }
        }
        return result;
    }
   

  
}