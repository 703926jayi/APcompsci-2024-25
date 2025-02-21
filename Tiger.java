public class Tiger extends Mammal {
    private boolean hungry;
    private int age;
    private static int numTigers;

    public Tiger() {
        super();
        this.hungry = true;
        this.age = 1;
        this.setDomestic(false);
        numTigers++;
    }

    public Tiger(int value, char gender, boolean hungry, int age) {
        super();
        this.setValue(value);
        this.setGender(gender);
        this.hungry = hungry;
        this.age = age;
        this.setDomestic(false);
        numTigers++;
    }

    public void hunt() {
        if (!isAlive()) {
            System.out.println("Dead tigers don't hunt.");
        } else if (!hungry) {
            System.out.println("The tiger isn't in a hunting mood due to lack of hunger.");
        } else {
            if (age <= 3) {
                System.out.println("The tiger captures and eats a rabbit.");
            } else if (age <= 8) {
                System.out.println("The tiger captures and eats a gazelle.");
            } else if (age <= 11) {
                System.out.println("The tiger captures and eats a caribou.");
            } else {
                System.out.println("The tiger captures and eats a blind mountain goat.");
            }
        }
    }

    public void attackElephant() {
        if (!isAlive()) {
            System.out.println("Dead tigers don't attack elephants.");
        } else if (numTigers > 1) {
            System.out.println(numTigers + " gang up and overcome the elephant and feast like tigers.");
        } else {
            this.kill();
            System.out.println("The foolish tiger tries to take down the elephant on his own and perishes from a tusk-induced lung puncture.");
        }
    }

    public void birthday(int years) {
        if (!isAlive()) {
            System.out.println("Dead tigers don't celebrate birthdays.");
        } else {
            this.age += years;
            if (this.age > 15) {
                this.kill();
                System.out.println("The tiger dies of old age.");
            } else {
                System.out.println("The tiger ages " + years + " years. It is now " + this.age + " years old.");
            }
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void kill() {
        if (isAlive()) {
            super.kill();
            numTigers--;
        }
    }

    @Override
    public void makeSound() {
        if (isAlive()) {
            if (this.age >= 2) {
                System.out.println("Roar");
            } else {
                System.out.println("Meow");
            }
        }
    }
}