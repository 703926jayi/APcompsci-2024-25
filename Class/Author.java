package Class;

public class Author {
    private String name;
    private int numBooks;
    private int yearBorn;
    private int netWorth;
    private boolean isAlive;
public Author()
{
name = "Steven King";
numBooks = 24;
yearBorn = 1947;
netWorth = 8000000;
isAlive = true;
}
public Author(String n, int num, int y, int net, boolean a)
{
    name = n;
    numBooks = num;
    yearBorn = y;
    netWorth = net;
    isAlive = a;
}

public String toString()
{
    String st = "";
    if(isAlive){
        return name + "was born in " + yearBorn + ", has written" + numBooks + "books and is worth $ " + netWorth;
    } else{
        return name + "was born in " + yearBorn + ", has written" + numBooks + "books and is dead";
    }
}



public void setName(String name) {
    this.name = name;
}
public void setNumBooks(int numBooks) {
    this.numBooks = numBooks;
}
public void setYearBorn(int yearBorn) {
    this.yearBorn = yearBorn;
}
public void setNetWorth(int netWorth) {
    this.netWorth = netWorth;
}
public void setAlive(boolean isAlive) {
    this.isAlive = isAlive;
}
public String getName() {
    return name;
}
public int getNumBooks() {
    return numBooks;
}
public int getYearBorn() {
    return yearBorn;
}
public int getNetWorth() {
    return netWorth;
}
public boolean isAlive() {
    return isAlive;
}

}
