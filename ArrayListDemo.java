import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        String st = "Mr. Dixon";
        String st2 = "Dom";
        String st3 = "Keira";
        //declare array list
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num = Integer.MAX_VALUE;

        //adding to array
        name.add(st);
        name.add("Dom");
        name.add(st3);
         String[] names = new String[3];
         names[0] = st;
         names[1] = st2; 
         names[2] = st3;
         System.out.println(name.size());
         name.remove(1);
         System.out.println(name.size());
        for(int i = 0; i<names.length;i++){
             System.out.println(names[i]);
         }
         name.clear();
         System.out.println(name.size());
    }
}