import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {
        String[] dictionary = new String[45402];
        dictionary = buildDictionary(); //builds an Array of English words using a dictionary text file


        
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
	
}
