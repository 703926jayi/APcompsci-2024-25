
import java.util.ArrayList;


public class ChangeSpelling 
{
    public static void main(String[] args) 
    {
     
        ArrayList<String> names = new ArrayList<String>();
        names.add("Dan");
        names.add("Yeti");
        names.add("Daisy");
        names.add("Sinbad");
        names.add("Tim");
        names.add("Amy");
        names.add("Yippy");
        changeSpelling(names);
        for(String st:names)System.out.println(st);
    }
    //Any String in the ArrayList that ends with &quot;y&quot; should change that “y” to ie;
     public static void changeSpelling (ArrayList<String> a)
    {
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).endsWith("y")){
                a.set(i, a.get(i).substring(0, a.get(i).length()-1) + "ie");
            }
        }
    }

}
