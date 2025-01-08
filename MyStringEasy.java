import java.util.Scanner;
public class MyStringEasy {
	
	//This method will simply captialize all the letters in the String
	//Examples:  dog--> DOG,  butter--> BUTTER,  try harder!-->  TRY HARDER!
	public String goBigTime(String st)
	{
		Scanner s = new Scanner(System.in);
		String z = s.next();
        System.out.println(z.toUpperCase());
		return st;
	}
	
	//This method will the number of characters in the string
	//Examples  radar--> 5,    Madam, I'm Adam--> 15,  food-->  4
	public int numChars(String st)
	{
		return st.length();
	}
	
	//User enters a single word String. The
        //program outputs that String with "ski" added
        //at end. However, if the last letter of the
        //inputted String ends in “s”, only add “ki”
        
	//Examples:   thomas--> thomaski, father--> fatherski, nadol--> nadolski
	public String makePolish(String st)
	{
       int z =st.length()-1;
       if (st.charAt(z)=='s'){
		return st+"ki";
	} else { 
		return st+"ski";
	}
	}
	
	//This method will return a String with xX added the the front and Xx added to end.
        //Examples:  Dixon -->  xXDixonXx   Toxic -->  xXToxicXx
	public String makeGamerTag(String st)
	{
		String bt = new String("xX"+st+"Xx");
		return bt;
	}
	
	//This boolean method will return true if the received String has either a "u" or "U".  However, if 
        //it contains both a capital and lower case U, they cancel each other out and returns false
	//Examples:  Unicorn --> true   boogers --> false  Ubiquities --> false 
	public boolean containsU(String st1)
	{
		int z = st1.indexOf('u');
		int y = st1.indexOf('U');
		if (z==-1&z!=y){
			return true;
		} else if(y==-1 && y!=z){
			return true;
		} else
		return false;
	}
	
	//This boolean method will return true if the String has the same character
        //at the beginning and end of the String.  They don't need to be the same case to return true
        //Examples  Radar --> true      trees --> false     Sassafrass -->  true
	public boolean areBookends(String st)
	{
		String bt = new String(st.toLowerCase());
		if (bt.charAt(0)==bt.charAt(bt.length()-1))
		return true;
		else
		return false;
	}
	
        //This boolean method will return if the String contains consecutive, identical letters
        //Examples  Radar --> false      trees --> true     Llama -->  false
	public boolean hasDoubleLetters(String st)
	{
	
		return true;
	}
	
        //This method will return the received String with all its vowels removed.
        //Only remove lower case y's at if they are the last character in the String
        //Examples  crypt --> crypt      trees --> trs     Sassafrass -->  Sssfrss  Yeti --> Yt
	public String deleteVowels(String st)
	{
	
		return "";
	}
        
        //This method will shift all letters three to the right in the alphabet.
        //Make sure x,y and z "wrap" back to beginning of alphabet.  Spaces and non-letter
        //are not shifted.
        //Examples  Bill Dixon --> Eloo Glarq
	public String shiftThree(String st)
	{
	
		return "";
	}
        
        //This method will return true if the received String is a palindrome (same forward as backward)
        //In this method, it will be a single word, with no punctuation and all lower case letters
        //Examples  radar--> true,   food-->  false
	public boolean isPalindrome(String st)
	{
	
		return true;
	}
        
         //This method will return true if the received String is a palindrome (same forward as backward)
        //In this method, it will be a phrase, again, the method shoud ignore punctuation and case of letters
        //Examples  Madam, I'm Adam --> true   A toyota --> true    Bill Dixon --> false
	public boolean isPalindromeHard(String st)
	{
	
		return true;
	}
}
