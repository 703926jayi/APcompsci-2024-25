package Class;

public class Cookie {
	private int calories, minutes;

    private String name;
	private boolean isBought;
	static private int numCookies;
	public Cookie()
	{
		name = "Chocolate Chip cookie";
		calories = 115;
		minutes = 15;
		isBought = false;
		numCookies++;
	}
	public Cookie(String n, int c, int m, boolean i)
	{
		name = n;
		calories = c;
		minutes = m;
		isBought=i;
		numCookies++;
	}

//create all getters and setters for the private data fields (10 methods) done
	
//Create the toString method that will return either:
    public String toString(String n, int c, boolean i){
        if(i = false){
            return n + " takes minutes minutes to prepare and is" + c + "calories";
        } else {
            return n + " is already prepared and is"+ c +"calories";
        }
    }
	//1) if it isn't storeBought -    name takes minutes minutes to prepare and is calories calories
	//2) If it is storeBought - name is already prepared and is calories calories.
	
//Create the calculateCost method that calculates the dietary cost of the cookie based on the formula described in the next method
    public int calculateCost(){
        int z = 0;
        if(isBought = false){
            z = z+10;
        } else if(isBought = true){
            z = z -10;
        }
        z = z+calories;
        z = z-minutes;
        z = z + name.length();

        return z;
    }
	//   The cost should be returned as an int.
	
	
//Create the choose method that receives another Cookie object.  This method will decide which
    public void choose(Cookie other){
        System.out.println(name + " cost is " + calculateCost());
        System.out.println(other.name + " cost is " + other.calculateCost());
        if (calculateCost()<other.calculateCost()){
            System.out.println(name+" should be eaten");
        } else  if (calculateCost()>other.calculateCost()){
            System.out.println(other.name+" should be eaten");
            
        }
    } 
	//cookie to eat by calling each cookie's calculateCost method, which is based on the following formula:  
	//		1.  storeBought adds 10
	//		2.	homemade subtracts 10
	//		3.  add calories
	//		4.  subtract minutes
	//		5.  Add the length of the name of the cookie.  (sugar cookie adds 12)
	// Output should state which cookie should be eaten (based on lower cost) and display the cost of each cookie
	//Sugar cookie cost is 75.
	//No-bake cookie cost is 58.
	//No-bake cookie is chosen.








    	



    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBought(boolean isBought) {
        this.isBought = isBought;
    }
    public static void setNumCookies(int numCookies) {
        Cookie.numCookies = numCookies;
    }
    public int getCalories() {
        return calories;
    }
    public int getMinutes() {
        return minutes;
    }
    public String getName() {
        return name;
    }
    public boolean isBought() {
        return isBought;
    }
    public static int getNumCookies() {
        return numCookies;
    }
	
}