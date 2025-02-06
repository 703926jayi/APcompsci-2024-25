package Class;

public class Pokemon {

	String name;
	String type;
	int power, defense, level, hp, maxHP;
	boolean isFainted;
	public Pokemon(){
        name = "Pikachu";
        type = "Electric";
        hp = 15;
        power = 6;
        defense = 2;
        isFainted = false;
        maxHP = 15;
        level = 0;
    }
	public Pokemon(String n, String t, int h, int m, int p, int d, int l, boolean f)
	{
		name = n;
        type = t;
        hp = h;
        power = p;
        defense = d;
        isFainted = f;
        maxHP = m;


	}
	public String toString()
	{
		return "\nName:\t" + name + "\nLevel:\t"+ level + "\t\tType:\t\t" + type + "\nPower:\t" 
				+ power + "\t\tDef:\t\t" + defense + "\nHealth:\t"+hp+"/"+maxHP +"\t\tFainted?:\t" + isFainted; 
	}
	public void levelUp(Pokemon other)
	{
        int damage = 0;
		if(isFainted != true&& type == other.type){
            damage = (power - other.defense);
            other.hp = other.hp - damage;
        }
	}
	public void attack(Pokemon enemy)
	{
	
	}
	public void kill()
	{
        if (hp<=0){
            System.out.println(name + "has fainted");
            isFainted = true;
            hp = 0;
        }
	}
	public void heal(int amount)
	{
		if(maxHP>hp){
            if(hp+amount<maxHP&& hp !=0){
                hp = hp+ amount;
                System.out.println(name + " healed " + amount + "hp");
            } else if(hp+amount<maxHP&& hp ==0){
                hp = hp+ amount;
                isFainted = false;
                System.out.println(name + " healed " + amount  + " hp");
            } else if(hp+amount>maxHP){
                System.out.println(name + " healed " + (maxHP-hp) + " hp");
                hp = maxHP;
            } 
        } else{
            System.out.println("This pokemon cannot be healed");
        }
	}
}
