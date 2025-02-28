
import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;


public class Calculate 
{
    public static void main(String[] args) 
    {

         ArrayList<String> names = new ArrayList<String>();
        
        names.add("Dan");
        names.add("Yeti");
        names.add("Evelynn");
        names.add("Sinbad");
        names.add("Tim");
        names.add("Amy");
        names.add("Anne");
        int num = calculate(names);
        System.out.println(num);
        
        names.clear();
        names.add("Dan");
        names.add("Yeti");
        names.add("Evelynn");
        names.add("Sinbad");
        names.add("Tim");
        names.add("Mike");
        names.add("Bart");
        num = calculate(names);
        System.out.println(num);
        
    }
//    Write a method that will return the product of the indices of first two elements in the contacts ArrayList that
// begin with vowels. If there aren’t two elements starting vowels, it should return -1. Use the
// provided isVowel method.
// Paul, Raul, Eve, Andrea, Bill, Alex -> 6 (Eve at index 2 * Andrea at index 3) = 6
    public static int calculate (ArrayList<String> a)
    {
        for(int i = 0; i < a.size(); i++){
            if(isVowel(a.get(i).charAt(0))){
            for(int j = i+1; j < a.size(); j++){
                if(isVowel(a.get(j).charAt(0))){
                    return i*j;
                } 
            }
            }
        } 
        return -1;
    }
    public static boolean isVowel(char c)
    {
        return c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U';
    }

}