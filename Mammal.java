public class Mammal extends Animal {
    private boolean domestic;
    private int value;
    private boolean hasFingers;
    protected static int numMammals;

    public Mammal() {
        super();
        this.domestic = true;
        this.value = 500;
        this.hasFingers = false;
        this.setRepro("live birth");
        numMammals++;
    }

    public void giveBirth() {
        if (!isAlive()) {
            System.out.println("Dead animals cannot give birth.");
        } else if (getGender() == 'm') {
            System.out.println("Males cannot give birth.");
        } else {
            numMammals++;
            System.out.println("Another animal is born into the world.");
        }
    }

    public void pickNose() {
        if (!isAlive()) {
            System.out.println("Dead animals can't pick their nose.");
        } else if (hasFingers) {
            System.out.println("One less booger to deal with.");
        } else {
            System.out.println("You can't pick your nose without fingers.");
        }
    }
    public static void decrementNumMammals() {
        numMammals--;
        }

    public void pet() {
        if (!isAlive()) {
            System.out.println("No response.");
        } else if (!domestic) {
            System.out.println("You lose your hand trying to pet a non-domestic mammal.");
        } else {
            System.out.println(getGender() == 'm' ? "He enjoys it." : "She enjoys it.");
        }
    }

    @Override
    public void kill() {
        if (isAlive()) {
            super.kill();
            numMammals--;
        }
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasFingers() {
        return hasFingers;
    }

    public void setHasFingers(boolean hasFingers) {
        this.hasFingers = hasFingers;
    }

    public static int getNumMammals() {
        return numMammals;
    }
}