package Class;


public class PokemonRunner {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Charmander", "Fire",0, 15, 2, 14, 0,true);
		Pokemon p2 = new Pokemon("Squirtle", "Water",5, 15, 2, 14, 0,false);
		Pokemon p3 = new Pokemon("Weedle", "Grass", 9, 15, 1, 1, 0,true);
		//p3.hp = 0;
		Pokemon p4 = new Pokemon("Jigglypuff", "normal",8, 15, 3, 20, 0,false);
		//System.out.println(p3);//output Weedle
		
		//p2.attack(p1);//Squirtle attacks Charmander
		p1.heal(2);//Heal Charmander
		System.out.println(p1);//output Charmander
		//p4.attack(p1);//Jigglypuff attacks Charmander
		//p1.attack(p4);//Charmander tries to attack Jigglypuff
		//p3.attack(p1);//Weedle tries to attack
		//p2.attack(p1);//Squirtle finishes off Charmander
		//p1.heal(5);//Attempt to heal Charmander
	}

}