public class AnimalRunner {

	
	public static void main(String[] args) {
	//Add all animals
	Penguin p1 = new Penguin();
	p1.kill();
	p1.makeSound();
	Penguin p2 = new Penguin('m', false, "North");
	p2.makeSound();
	Duck d1 = new Duck();
	d1.makeSound();
	Duck d2 = new Duck('f', true, "Daisy");
	d2.makeSound();
	Monkey m1 = new Monkey();
	m1.makeSound();
	Monkey m2 = new Monkey(150, 'f', true, 90);
	m2.makeSound();
	Monkey m3 = new Monkey(600, 'f', false, 2);
	m3.makeSound();
	Tiger t1 = new Tiger();
	t1.makeSound();
	Tiger t2 = new Tiger(600, 'f', true, 11);
	t2.makeSound();
	Tiger t3 = new Tiger (300, 'm', false, 14);
	t3.makeSound();
	System.out.println("After adding all animals, we have " + Animal.getNumAnimals() + " animal(s), " + Mammal.getNumMammals() + " mammal(s) and " + Bird.getNumBirds() + " bird(s).\n");
	
	System.out.println("Let's start with the penguins....");
	p1.migrate();
	p2.migrate();
	p1.setHappyFeet(false);
	System.out.println("p1 can fly?  " + p1.getFlies());
	System.out.println("Now killing penguin p1 with a speargun.");
	p1.kill();
	System.out.println("At this point, we have " + Animal.getNumAnimals() + " animal(s), " + Mammal.getNumMammals() + " mammal(s) and " + Bird.getNumBirds() + " bird(s).");
	//Ducks
	System.out.println("\nNow let's mess with the ducks....");
	d1.setName("Daffy");
	d2.setHungry(false);
	d1.findBread();
	d2.findBread();
	d1.hunt();
	d2.hunt();
	System.out.println("At this point, we have " + Animal.getNumAnimals() + " animal(s), " + Mammal.getNumMammals() + " mammal(s) and " + Bird.getNumBirds() + " bird(s).");
	//Monkeys
	System.out.println("\nBring on the monkeys....");
	m1.fight();
	m1.giveBirth();
	m2.fight();
	m2.giveBirth();
	m3.setGender('m');
	m3.fight();
	m1.teach();
	m1.teach();
	m1.pickNose();
	m1.hurlPoop();
	m2.hurlPoop();
	m2.hurlPoop();
	m3.hurlPoop();
	m3.hurlPoop();
	m3.giveBirth();
	System.out.println("At this point, we have " + Animal.getNumAnimals() + " animal(s), " + Mammal.getNumMammals() + " mammal(s) and " + Bird.getNumBirds() + " bird(s).");
	
	//Tigers
	System.out.println("\nBeware of the tigers....");
	t1.hunt();
	t2.hunt();
	t2.hunt();
	t2.pickNose();
	t3.hunt();
	t1.attackElephant();
	t3.birthday(3);
	t3.hunt();
	t3.attackElephant();
	t2.birthday(6);
	t2.pickNose();
	t1.attackElephant();
	System.out.println("At this point, we have " + Animal.getNumAnimals() + " animal(s), " + Mammal.getNumMammals() + " mammal(s) and " + Bird.getNumBirds() + " bird(s).");
	

	}

}