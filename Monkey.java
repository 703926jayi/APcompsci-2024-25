public class Monkey extends Mammal {
    private boolean isAlpha;
    private int iq;

    public Monkey() {
        super();
        this.isAlpha = false;
        this.iq = 50;
        this.setLegs(2);
        this.setHasFingers(true);
    }

    public Monkey(int value, char gender, boolean isAlpha, int iq) {
        super();
        this.setValue(value);
        this.setGender(gender);
        this.isAlpha = isAlpha;
        this.iq = iq;
        this.setLegs(2);
        this.setHasFingers(true);
    }

    public void teach() {
        if (!isAlive()) {
            System.out.println("Can't teach dead monkeys");
        } else {
            this.iq += 3;
            System.out.println("IQ has risen 3 points and is now at " + this.iq);
        }
    }

    public void teach(int iqIncrease) {
        if (!isAlive()) {
            System.out.println("Can't teach dead monkeys");
        } else {
            this.iq += iqIncrease;
            if (this.iq <= 0) {
                this.kill();
                System.out.println("The monkey drops into a coma of stupidity and dies.");
            } else {
                System.out.println("IQ has " + (iqIncrease > 0 ? "risen" : "fallen") + " " + iqIncrease + " points and is now at " + this.iq);
            }
        }
    }

    public void fight() {
        if (!isAlive()) {
            System.out.println("Dead monkeys cannot become the alpha male.");
        } else if (getGender() == 'm') {
            if (!isAlpha) {
                this.isAlpha = true;
                System.out.println("We have a new alpha male.");
            } else {
                System.out.println("This monkey is already the alpha male.");
            }
        } else {
            System.out.println("Females cannot be the alpha male.");
        }
    }

    public void hurlPoop() {
        if (!isAlive()) {
            System.out.println("Dead monkeys cannot hurl poop.");
        } else {
            this.setValue(this.getValue() - 100);
            this.iq -= 1;
            if (this.getValue() <= 0) {
                this.kill();
                System.out.println("This monkey's life is rendered worthless. He dies.");
            } else if (this.iq <= 0) {
                this.kill();
                System.out.println("The monkey drops into a coma of stupidity and dies.");
            } else {
                System.out.println("Hurling poop has taken its toll. Value is now " + this.getValue() + " and IQ drops to " + this.iq);
            }
        }
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean isAlpha) {
        if (getGender() == 'm') {
            this.isAlpha = isAlpha;
        } else {
            System.out.println("Females cannot be the alpha male.");
        }
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public void makeSound() {
        if (isAlive()) {
            if (this.iq > 75) {
                System.out.println("Hello");
            } else {
                System.out.println("Oooh oooh aaah aaah");
            }
        }
    }
}