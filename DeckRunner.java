public class DeckRunner 
{
    public static void main(String[] args) 
    {
        Deck deck = new Deck();
        Deck deck2 = new Deck(6);
        System.out.println(deck);
        deck2.shuffle();
        System.out.println(deck2);
        deck2.dealHand();
        deck2.dealHand();
    }
}