public class Recursion2
{
    public static void main(String[] args)
    {
        //Problem # 1 - Recursive Palindrome Checker
        String st = "racecar";
        if(isPalindrome(st)) System.out.println(st + " is a palindrome");
       else System.out.println(st+" is not a palindrome");
       
        //Problem # 2 - Sum Digits in an Integer
        int num = 3874;
        System.out.println(sumDigits(num));
        
        //Problem # 3 - Reverse String
        String st2 = "dixon";
        System.out.println(reverseString(st2));
       
        //Problem # 4 - Remove Repeated Letters
        String st3 = "aaabbbcdddefff";
        System.out.println(removeRepeats(st3));
    }
    public static boolean isPalindrome(String st)
    {
//this method checks to see if is a palindrome using recursion 
        if(st.length()<=1) return true; //basecase 
        if(st.charAt(0)!=st.charAt(st.length()-1)) return false; 
            else return isPalindrome(st.substring(1,st.length()-1));
    }
    public static int sumDigits(int n)
    {
        if(n<10) return n; //basecase
        return n%10 + sumDigits(n/10);
    }
    public static String reverseString(String st)
    {
        if(st.length()<=1) return st; //basecase
        return st.charAt(st.length()-1) + reverseString(st.substring(0,st.length()-1));
    }
   
    public static String removeRepeats(String st)
    {
        if(st.length()<=1) return st; //basecase
        if(st.charAt(0)==st.charAt(1)) return removeRepeats(st.substring(1));
        return st.charAt(0) + removeRepeats(st.substring(1));
    }
}