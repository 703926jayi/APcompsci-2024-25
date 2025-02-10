package Class;

public class PokemonRunner {
    public static void main(String[] args) 
    {
        Pokemon p = new Pokemon();
        System.out.println(p);
        p.levelUp();
        System.out.println(p);
        Pokemon b = new Pokemon("Bulbasaur", "Water", 9, 9, 4,5,0,false);
        b.kill();
        System.out.println(b);
        b.heal(15);
        System.out.println(b);
        p.attack(b);
        b.heal(4);
        p.attack(b);
        p.attack(b);
        System.out.println(b);
    }
}