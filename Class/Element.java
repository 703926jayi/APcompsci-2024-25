package Class;

public class Element {
    private String name;
    private boolean natural;
    private int valence;
    private String symbol;

    public Element() {
        name = "Hydrogen";
        natural = true;
        valence = 1;
        symbol = "H";
    }
    public Element(String name, boolean natural, int valence, String symbol) {
        this.name = name;
        this.natural = natural;
        this.valence = valence;
        this.symbol = symbol;
    }

    public Element(String name, String symbol, int valence) {
        this.name = name;
        this.symbol = symbol;
        this.valence = valence;
        this.natural = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNatural() {
        return natural;
    }

    public void setNatural(boolean natural) {
        this.natural = natural;
    }

    public int getValence() {
        return valence;
    }

    public void setValence(int valence) {
        this.valence = valence;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void combine(Element other) {
        if (valence == 0 || other.valence == 0) {
            System.out.println(name + " doesn't combine with " + other.name + ": One or more elements is a noble gas.");
            return;
        }

        if (!natural || !other.natural) {
            System.out.println(name + " doesn't combine with " + other.name + ": One or more elements is man-made.");
            return;
        }

        if (valence > 0 && other.valence > 0 || valence < 0 && other.valence < 0) {
            System.out.println(name + " doesn't combine with " + other.name + ": Both valence charges have same polarity.");
            return;
        }

        int absValence1 = Math.abs(valence);
        int absValence2 = Math.abs(other.valence);
        int lcm = lcm(absValence1, absValence2);

        int count1 = lcm / absValence1;
        int count2 = lcm / absValence2;

        if (count1 > 4 || count2 > 4) {
            System.out.println(name + " doesn't combine with " + other.name + ": Molecule would require more than four atoms of one element.");
            return;
        }

        if (valence > 0) {
            System.out.println(name + " combines with " + other.name + " to form " + (count1 == 1 ? "" : count1) + symbol + (count2 == 1 ? "" : count2) + other.symbol);
        } else {
            System.out.println(other.name + " combines with " + name + " to form " + (count2 == 1 ? "" : count2) + other.symbol + (count1 == 1 ? "" : count1) + symbol);
        }
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
