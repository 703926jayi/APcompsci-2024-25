public class Bird extends Animal {
    private boolean flies;
    private static int numBirds;

    public Bird() {
        super();
        this.flies = true;
        this.setLegs(2);
        this.setRepro("eggs");
        numBirds++;
    }

    public void canFly() {
        if (isAlive()) {
            this.flies = true;
            System.out.println("I believe I can fly!");
        } else {
            System.out.println("Dead birds can't fly.");
        }
    }

    public void cantFly() {
        if (isAlive()) {
            this.flies = false;
            System.out.println("Grounded again.");
        }
    }

    public boolean getFlies() {
        return flies;
    }

    public static int getNumBirds() {
        return numBirds;
    }

    @Override
    public void kill() {
        if (isAlive()) {
            super.kill();
            numBirds--;
        }
    }
}