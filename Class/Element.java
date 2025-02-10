package Class;

public class Element {
    private String name;
    private Boolean natural;
	static private int valance;
    private String symbol;

    public Element(){
        name = "hydrogen";
        natural = true;
        valance = 1;
        symbol = "H";
    }
    public Element(String n, Boolean nat, int v, String s){
        name = n;
        natural = nat;
        valance = v;
        symbol = s;
    }
    
}
