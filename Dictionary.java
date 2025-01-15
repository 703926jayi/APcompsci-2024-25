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
                        search9(dictionary);   
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
                boolean a = false;
                boolean b = false;
                if(word.indexOf("K")!=-1 || word.indexOf("k")!=-1){
                    a =  true;
                }
                if(word.indexOf("X")!=-1 || word.indexOf("x")!=-1){
                    b =  true;
                }
                if(a==true&&b==true&&word.length()<=6){
                    System.out.println(word);
                    count++;
                }
             }
            }
            System.out.println(count+ " matches");
        }
        
        //Find all words that are made of characters with only odd ASCII values.
        public static void search2(String[] dictionary)
        {
                int count = 0;
                for (int i = 0; i < dictionary.length; i++) {
                    String word = dictionary[i];
                    boolean allOdd = true;
            
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) % 2 == 0) {
                            allOdd = false;
                            break;
                        }
                    }
            
                    if (allOdd) {
                        System.out.println(word);
                        count++;
                    }
                }
                System.out.println(count + " matches");
        }
        
        // Find all words that have three vowels in a row. Consider A, E, I, O, and U vowels.
public static void search3(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        for (int j = 0; j < word.length() - 2; j++) {
            if (isVowel(word.charAt(j)) && isVowel(word.charAt(j + 1)) && isVowel(word.charAt(j + 2))) {
                System.out.println(word);
                count++;
                break;
            }
        }
    }
    System.out.println(count + " matches");
}

// Find all words that are not palindromes but would be if the first and last letters were removed.
// The original word must be at least 7 letters long.
public static void search4(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        if (word.length() >= 7) {
            String trimmed = word.substring(1, word.length() - 1);
            if (!isPalindrome(word) && isPalindrome(trimmed)) {
                System.out.println(word);
                count++;
            }
        }
    }
    System.out.println(count + " matches");
}

// Find all words that have more vowels than consonants.
public static void search5(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        int vowels = 0, consonants = 0;
        for (int j = 0; j < word.length(); j++) {
            if (isVowel(word.charAt(j))) {
                vowels++;
            } else {
                consonants++;
            }
        }
        if (vowels > consonants) {
            System.out.println(word);
            count++;
        }
    }
    System.out.println(count + " matches");
}

// Find all words that use the same letter four times or more.
public static void search6(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        for (int j = 0; j < word.length(); j++) {
            char letter = word.charAt(j);
            int occurrences = 0;
            for (int k = 0; k < word.length(); k++) {
                if (word.charAt(k) == letter) {
                    occurrences++;
                }
            }
            if (occurrences >= 4) {
                System.out.println(word);
                count++;
                break;
            }
        }
    }
    System.out.println(count + " matches");
}

// Find all words that contain the letters B I L L in order (not necessarily adjacent).
public static void search8(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        int matchIndex = 0;
        for (int j = 0; j < word.length(); j++) {
            if (matchIndex == 0 && word.charAt(j) == 'B') matchIndex++;
            else if (matchIndex == 1 && word.charAt(j) == 'I') matchIndex++;
            else if (matchIndex == 2 && word.charAt(j) == 'L') matchIndex++;
            else if (matchIndex == 3 && word.charAt(j) == 'L') {
                System.out.println(word);
                count++;
                break;
            }
        }
    }
    System.out.println(count + " matches");
}

public static void search9(String[] dictionary) {
    int count = 0;

    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        if (word == null || word.length() < 12) continue;

        for (int j = 6; j <= word.length() - 6; j++) {
            String part1 = word.substring(0, j);
            String part2 = word.substring(j);

            boolean part1Found = false;
            boolean part2Found = false;

            for (int k = 0; k < dictionary.length; k++) {
                if (dictionary[k] == null) continue;

                if (dictionary[k].equals(part1)) part1Found = true;
                if (dictionary[k].equals(part2)) part2Found = true;

                if (part1Found && part2Found) break;
            }

            if (part1Found && part2Found) {
                System.out.println(word);
                count++;
                break;
            }
        }
    }

    System.out.println(count + " matches");
}
// Find all odd-length words that do not start with "S" and have the same first, middle, and last letters.
public static void search10(String[] dictionary) {
    int count = 0;
    for (int i = 0; i < dictionary.length; i++) {
        String word = dictionary[i];
        if (word.length() % 2 == 1 && word.charAt(0) != 'S') {
            int midIndex = word.length() / 2;
            if (word.charAt(0) == word.charAt(midIndex) && word.charAt(midIndex) == word.charAt(word.length() - 1)) {
                System.out.println(word);
                count++;
            }
        }
    }
    System.out.println(count + " matches");
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