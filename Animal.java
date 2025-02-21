public class Animal {
    private boolean alive;
    private int numLegs;
    private char gender;
    private String reproduction;
    private static int numAnimals;

    public Animal() {
        this.alive = true;
        this.numLegs = 4;
        this.gender = 'm';
        this.reproduction = "eggs";
        numAnimals++;
    }

    public void kill() {
        if (alive) {
            this.alive = false;
            numAnimals--;
        }
    }

    public void setLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void setRepro(String reproduction) {
        this.reproduction = reproduction;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void setNumAnimals(int numAnimals) {
        Animal.numAnimals = numAnimals;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public String getReproduction() {
        return reproduction;
    }

    public char getGender() {
        return gender;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public void makeSound() {
        System.out.println("Makes no sound");
    }
}