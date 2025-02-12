package Class;

public class Pet 
{
   //Data Fields
    private String name;
    private String species;
    private String owner;
    private int age;
    private boolean isHungry;
    private double weight;
    
    //Constructor
    public Pet()
    {
        name = "Walter";
        species = "dog";
        owner = "Dixon";
        age = 4;
        isHungry = true;
        weight = 55;
        System.out.println("Walter is born");
    }
    public Pet(String n, String s, String o, int a, int w)
    {
        name = n;
        species = s;
        owner = o;
        age = a;
        weight = w;
        isHungry = true;
    }
    
    //Getters and Setters
    public String getName()
    {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    //Other Methods
    public String breed(Pet otherPet)
    {
        String st = "";
        st += name.substring(0, name.length()/2);//add first half - Wal
        st += otherPet.getName().substring(otherPet.getName().length()/2);
        
        return st;
    }
    
}
