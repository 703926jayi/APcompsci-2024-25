public class Card { 
    private String suit, rank;
    private int value;
    public Card()
    {
        int v = (int)(Math.random()*13)+1;
        int s = (int)(Math.random()*4)+1;
        value = v;
        assignRank();
        assignSuit(s);
    }
    public Card(int v, int s)
    {
        value = v;
        assignRank();
        assignSuit(s);
    }
    
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    private void assignRank()
    {
        if(value==1) rank="Ace";
        if(value==2) rank="Two";
        if(value==3) rank="Three";
        if(value==4) rank="Four";
        if(value==5) rank="Five";
        if(value==6) rank="Six";
        if(value==7) rank="Seven";
        if(value==8) rank="Eight";
        if(value==9) rank="Nine";
        if(value==10) rank="Ten";
        if(value==11) rank="Jack";
        if(value==12) rank="Queen";
        if(value==13) rank="King";
        if(value>10) value =10;
        if(value ==1) value =11;
    }
    private void assignSuit(int s)
    {
        if(s==1) suit="Clubs";
        if(s==2) suit="Diamonds";
        if(s==3) suit="Hearts";
        if(s==4) suit="Spades";
    }
    public String toString()
    {
        return rank + " of " + suit;
    }
    
    
    }