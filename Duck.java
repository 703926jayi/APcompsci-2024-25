public class Duck extends Bird {
    private boolean hungry;
    private String name;

    public Duck() {
        super();
        this.hungry = true;
        this.name = "Donald";
    }

    public Duck(char gender, boolean hungry, String name) {
        super();
        this.setGender(gender);
        this.hungry = hungry;
        this.name = name;
    }

    public void findBread() {
        if (!isAlive()) {
            System.out.println("Dead ducks can't find bread.");
        } else if (hungry) {
            this.hungry = false;
            System.out.println("The duck eats the bread and is no longer hungry.");
        } else {
            System.out.println("The duck isn't hungry and lets the other ducks feast.");
        }
    }

    public void hunt() {
        if (!isAlive()) {
            System.out.println("Dead ducks aren't hunted.");
        } else if (this.name.equals("Daffy")) {
            this.kill();
            System.out.println("Elmer Fudd got the duck.");
        } else {
            System.out.println(this.name + " is safe.");
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        if (isAlive() && getGender() == 'f') {
            System.out.println("Quack");
        } else {
            System.out.println("Makes no sound");
        }
    }
}