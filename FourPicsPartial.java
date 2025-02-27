import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FourPicsPartial {
	
	 static ArrayList <String> dictionary = new ArrayList <String>();  //holds all the words in the dictionary text file
	 static char[] letters = new char[12];  //Array of 12 characters to compare against the words in the dictionary ArrayList (user provided)
	 static int numLetters=0;  //How many letters are in the word we are looking for (user provided)
	
public static void main(String[] args) throws Exception 
{		
		dictionary = buildDictionary(); //builds an ArrayList of English words using a dictionary text file
		getSizeAndLetters();  //Asks user for number of letters and the possible letters to use
		checkLength();  //removes words of the wrong length from the dictionary ArrayList
		checkLetters();  //removes words that contain letters not in 12 provided by user
		outputWords();   //output the words that remain in the dictionary ArrayList - these are potential solutions
}
public static ArrayList<String> buildDictionary()
{
	ArrayList <String> wordList = new ArrayList<String>();
	File f = new File("dictionary.txt");
	Scanner input = null;
	try //try...catch is used when the possibility of an error could result and we want to catch it without causing a runtime error
	{
		input = new Scanner(f);  	//Scanner is build based on input from the text, not the console
	} 
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	while (input.hasNext())
	{
		String word = input.nextLine();  //one word appears on each line in the text file
		wordList.add(word); 			//add each word into the wordList ArrayList
	}
	input.close();
	System.out.println(wordList.size() + " words loaded.");  //outputs the size of the ArrayList built
	return wordList;  
}
public static void getSizeAndLetters()
{
	Scanner s=  new Scanner(System.in);
	System.out.println("Enter number of letters in word:");
	numLetters = s.nextInt();  //numLetters specifies the number of letters in the word we are searching for 
	System.out.println("Enter available letters as a block of 12 letters:  (ex:  psbnoiyzvlvw)");
	String block = s.next();
	letters=block.toCharArray();  //build an array of characters from the word provided by user
}
public static void checkLength()
	{
		for (int i=0; i<dictionary.size(); i++)  
		{
			if (dictionary.get(i).length() != numLetters) 
			{
				dictionary.remove(i);  
				i--; 
			}
		}
		System.out.println("After eliminated words of different length, " + dictionary.size() + " remain.");
	}
public static void  checkLetters()  //checks to make sure all letters in the word are included in the block of 12 letters
	{
		for (int i=0; i<dictionary.size(); i++)  
		{
			if (!containsChar(dictionary.get(i), letters)) 
			{
				dictionary.remove(i);  
				i--; 
			}
		}
		System.out.println("After checking the letters provided to those left,  " + dictionary.size() + " remain.");
	} 
public static boolean containsChar(String st, char[] c)
	{
		for (int i=0; i<st.length(); i++)  
		{
			boolean found = false;
			for (int j=0; j<c.length; j++)  
			{
				if (st.charAt(i) == c[j]) 
				{  
					//make sure does not return true if duplicate letters are there
					// if (st.indexOf(st.charAt(i)) != st.lastIndexOf(st.charAt(i))) 
					// {
					// 	return false;
					// }
					found = true;
					break;
				}
			}
			if (!found) 
			{
				return false;
			}
		}
		return true;
	}
public static void outputWords()
	{
		for (int i=0; i<dictionary.size(); i++)  
		{
			System.out.println(dictionary.get(i));  
		}
		System.out.println("Total number of words found: " + dictionary.size());
	}

}