package Class;

public class Dog extends Pet{
    private String breed = "";
    private int barkVolume = 0;
    public Dog(){
        breed = "Pitbull";
        barkVolume = 2;
    }


    public void speak(){
        if(breed.equals("Pitbull"))
        {
        }
        else{
            System.out.println("Bark");
            barkVolume++;
        }
    }





    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }


    public int getBarkVolume() {
        return barkVolume;
    }


    public void setBarkVolume(int barkVolume) {
        this.barkVolume = barkVolume;
    }


}
