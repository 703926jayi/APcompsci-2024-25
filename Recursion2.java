public class Recursion2
{
    public static void main(String[] args)
    {
        //Problem # 1 - Recursive Palindrome Checker
        String st = "racecar";
        if(isPalindrome(st)) System.out.println(st + " is a palindrom");
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
        //recursively solve this
        return false;
    }
    public static int sumDigits(int n)
    {
        return 0;
       
    }
    public static String reverseString(String st)
    {
        return "";
    }
   
    public static String removeRepeats(String st)
    {
        return "";
    }
}