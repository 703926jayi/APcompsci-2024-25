public class DeckRunner 
{
    public static void main(String[] args) 
    {
        Deck deck = new Deck();     
        System.out.println("Step # 1 - Unshuffled Deck");
        System.out.println(deck);
        System.out.println("\nStep # 2 - Shuffled Deck");
        deck.shuffle();
        System.out.println(deck);
        
        Deck deck2 = new Deck(6);
         System.out.println("\nStep # 3 - Unshuffled Shoe\n");
         System.out.println(deck2);
        deck2.shuffle();
         System.out.println("\nStep # 4 - Shuffled Shoe\n");
       System.out.println(deck2);
        System.out.println("\nStep # 5 - Hand # 1\n");
        deck2.dealHand();
        System.out.println("\nStep # 6 - Hand # 2\n");
        deck2.dealHand();
        System.out.println("\nStep # 6 - Card remaining - ");
        deck2.displayRemainingCards();
    }
}