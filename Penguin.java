public class Penguin extends Bird {
    private boolean appearsInHappyFeet;
    private String poleLivesAt;

    public Penguin() {
        super();
        this.appearsInHappyFeet = true;
        this.poleLivesAt = "South";
        this.cantFly();
    }

    public Penguin(char gender, boolean appearsInHappyFeet, String poleLivesAt) {
        super();
        this.setGender(gender);
        this.appearsInHappyFeet = appearsInHappyFeet;
        this.poleLivesAt = poleLivesAt;
        this.cantFly();
    }

    public void migrate() {
        if (isAlive()) {
            this.poleLivesAt = this.poleLivesAt.equals("South") ? "North" : "South";
        }
    }

    public boolean setHappyFeet(boolean b) {
        return appearsInHappyFeet;
    }

    public void setSetHappyFeet(boolean appearsInHappyFeet) {
        this.appearsInHappyFeet = appearsInHappyFeet;
    }

    public String getPoleLivesAt() {
        return poleLivesAt;
    }

    public void setPoleLivesAt(String poleLivesAt) {
        this.poleLivesAt = poleLivesAt;
    }

    public void sitOnEgg() {
        if (isAlive() && this.getGender() == 'm' && this.appearsInHappyFeet && this.poleLivesAt.equals("South")) {
            System.out.println("Another musically talented penguin comes into the world.");
        }
    }
}