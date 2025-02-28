
import java.util.ArrayList;


public class DoubleD 
{
    public static void main(String[] args) 
    {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Dan");
        names.add("Jeff");
        names.add("Daisy");
        names.add("Sinbad");
        names.add("Tim");
        names.add("Addison");
        names.add("Theresa");
        doubleD(names);
        for(String st:names)System.out.println(st);
    }
    public static void doubleD (ArrayList<String> a)
    {
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).contains("D") || a.get(i).contains("d")){
                a.add(i+1, a.get(i));
                i++;
            }
        }
    }
}
