import java.util.ArrayList;
public class RemoveAfterT
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Terry");
        names.add("Jeff");
        names.add("Bill");
        names.add("tom");
        names.add("Tim");
        names.add("Anne");
        names.add("Theresa");
        removeAfterT(names);
        for(String st:names)System.out.println(st);
    }
    public static void removeAfterT (ArrayList<String> a)
    {
      for(int i = a.size()-1; i >0; i--){
            if(a.get(i-1).charAt(0) == 'T' || a.get(i-1).charAt(0) == 't'){
                a.remove(i);
            }
      }
        
      
    }
}

