import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Dictionary {
    public static void main(String[] args) throws Exception 
	{		
			String[] dictionary = new String[45402];
			dictionary = buildDictionary(); //builds an Array of English words using a dictionary text file
                       // outputWords(dictionary);   //Test to see if it works - delete this after confirmation
                        
                        //practiceSearch1(dictionary);  //89 matches
                        //practiceSearch2(dictionary);  //deny, stub, stun, stud (4 matches)
                        //practiceSearch3(dictionary);  //39 matches
                        
                        //search1(dictionary);  
                        //search2(dictionary);   
                        //search3(dictionary); 
                        //search4(dictionary);    
                        //search5(dictionary);  
                        //search6(dictionary); 
                        //search7(dictionary); 
                        //search8(dictionary);   
                        //search9(dictionary);   
                        //search10(dictionary); 
	}
    
        //Find all the words that start and end with a vowel and more than 12 letters long
        public static void practiceSearch1(String[] dictionary)
        {
           int count = 0; //track how many strings meet criteria 
           for(int i = 0; i < dictionary.length; i++){
            String word = dictionary[i];
            if(word.length()>12 && isVowel(word.charAt(0)) == true){
                if(isVowel(word.charAt(word.length()-1))){
                System.out.println(word);
                count++;
                }
            }
           }
           System.out.println(count+ " matches");

        }

        
        //Find all four letters words in the dictionary that have 3 consecutive letters of the alphabet.  (EX:  DEFY)
        public static void practiceSearch2(String[] dictionary)
        {
            int count = 0; //track how many strings meet criteria 
            for(int i = 0; i < dictionary.length; i++){
             String word = dictionary[i];
             if(word.length()==4){
                if(word.charAt(0)+1==word.charAt(1) && word.charAt(1)+1==word.charAt(2) || word.charAt(1)+1==word.charAt(2) && word.charAt(2)+1==word.charAt(3)-1){
                count++;
                System.out.println(word); 
                }
             }
            }
            System.out.println(count+ " matches");
         }
         //Find words in the dictionary that has three sets of double letters (MISSISSIPPI would qualify)
        public static void practiceSearch3(String[] dictionary)
        {
            {
                int count = 0; //track how many strings meet criteria 
                for(int i = 0; i < dictionary.length; i++){
                 String word = dictionary[i];
                 int doubleCount = 0;
                 for (int j = 0; j<word.length()-1; j++){
                    if (word.charAt(j)==word.charAt(j+1)){
                        doubleCount++;
                    }
                 }
                    if(doubleCount==3){
                        count++;
                        System.out.println(word);
                    }
                }
                System.out.println(count+ " matches");
             }
        }
       
        //Find all words that contain both an “X” and a “K” and are six letters long or shorter.
        public static void search1(String[] dictionary)
        {
            int count = 0; //track how many strings meet criteria 
            for(int i = 0; i < dictionary.length; i++){
             String word = dictionary[i];
             int doubleCount = 0;
             for (int j = 0; j<word.length()-1; j++){

             }
            }
            System.out.println(count+ " matches");
        }
        
        //Find all words that are made of characters with only odd ASCII values.
        public static void search2(String[] dictionary)
        {
            
        }
        
        //Find all words that have three vowels in a row.  Consider A, E, I, O and U vowels.  (Ex:  pious)
        public static void search3(String[] dictionary)
        {
            
        }
        
        //Find all words that are not palindromes, but would be palindromes if you dropped the first and last letter.  The original word also has be at least 7 letters long.  (Ex:  SNIFFING)
        public static void search4(String[] dictionary)
        {
            
        }
        
        //Find all words that have more vowels than consonants.
        public static void search5(String[] dictionary)
        {
            
        }
        
        //Find all words that use the same letter four times or more.  (Ex:  Mississippi)
        public static void search6(String[] dictionary)
        {
            
        }
        
        //Find all words that can be made from the letters found in PROSTHETIC.  You can use as many of each of the letters in PROSTHETIC as you want.  EX:  PROPER, PROSPER
        public static void search7(String[] dictionary)
        {
            
        }
        
        //Find all words that contain the letters B I L L in that order, but not necessarily next to one another.  (Ex:  BLISSFULLY)
        public static void search8(String[] dictionary)
        {
            
        }
        
        //Find all words that are compound words made from two other words in the dictionary.  Each of the words must be at least 6 letters long 
        //(Ex:  BATTLEGROUNDS is made from “cow” and “boy”, both of which exist in the dictionary.
        public static void search9(String[] dictionary)
        {
            
        }
        
        //Find all odd length words that do not start with an “S” and have the same first, middle and last letter.  (Ex:  ATLANTA)
         public static void search10(String[] dictionary)
        {
            
        }
	public static String[] buildDictionary()
	{
		String[] wordList = new String[45402];
		File f = new File("dictionary.txt");
		Scanner input = null;
		int x =0;
		try //try...catch is used when the possibility of an error could result and we want to catch it without causing a runtime error
		{
                    input = new Scanner(f);  	//Scanner is build based on input from the text, not the console
		} 
		catch (FileNotFoundException e) 
		{
                    System.out.println("dictionary.txt file not found");
                    e.printStackTrace();
		}
		while (input.hasNext())
		{
                    String word = input.nextLine().toUpperCase();  //one word appears on each line in the text file
                    wordList[x] = word; 			//add each word into the wordList Array
                    x++;
		}
		input.close();
		System.out.println(wordList.length + " words loaded.");  //outputs the size of the Array built
		return wordList;  
	}
	
        public static void outputWords(String[] words)
        {
            for (int x =0; x < words.length; x++)
            {
                System.out.println(words[x]);
            }
        }
         public static boolean isPalindrome(String st)
            {    	
                for (int x =0; x < st.length(); x++)
                {
                    if (st.charAt(x)!=st.charAt(st.length()-1-x)) return false;
                }
                return true;
            }
         public static boolean isVowel(char c)
            {
                return c=='A' || c == 'E' || c=='I' || c=='O' || c=='U';
            }
         public static boolean isConsonant(char c)
            {
                return !isVowel(c);
            }
         public static boolean isInDictionary(String st, String[] dictionary)
            {
                //You write - might be helpful, especially for search9
                return false;
            }
}