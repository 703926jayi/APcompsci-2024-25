import org.junit.Test;
import static org.junit.Assert.*;

public class MyStringEasyTest {
    
    MyStringEasy st = new MyStringEasy();
    
    @Test
	public void testReverseString() {
		assertEquals(st.goBigTime("god"), "GOD");
		assertEquals(st.goBigTime("violet"), "VIOLET");
		assertEquals(st.goBigTime("I love you"), "I LOVE YOU");
	}
    
        @Test
	public void testNumChars() {
		assertEquals(st.numChars("hilltop"), 7);
		assertEquals(st.numChars("violet"), 6);
		assertEquals(st.numChars("I love you"), 10);
	}
        
         @Test
	public void testmakePolish() {
		assertEquals(st.makePolish("hilltop"), "hilltopski");
		assertEquals(st.makePolish("violet"), "violetski");
		assertEquals(st.makePolish("Midas"), "Midaski");
	}
        
         @Test
	public void testmakeGamerTag() {
		assertEquals(st.makeGamerTag("Dixon"), "xXDixonXx");
		assertEquals(st.makeGamerTag("Marshall"), "xXMarshallXx");
		assertEquals(st.makeGamerTag("DarkLord69"), "xXDarkLord69Xx");
	}
        
          @Test
	public void testContainsU() {
		assertEquals(st.containsU("Dixon"), false);
		assertEquals(st.containsU("Uvula"), false);
		assertEquals(st.containsU("hurry"), true);
                assertEquals(st.containsU("Unbelievable"), true);
	}
        
         @Test
	public void testAreBookends() {
		assertEquals(st.areBookends("Treat"), true);
		assertEquals(st.areBookends("A wonderful idea"), true);
		assertEquals(st.areBookends("Jumanji"), false);
                assertEquals(st.areBookends("Unbelievable"), false);
	}
        
         @Test
	public void testHasDoubleLetters() {
		assertEquals(st.hasDoubleLetters("Dixon"), false);
		assertEquals(st.hasDoubleLetters("Butterscotch"), true);
		assertEquals(st.hasDoubleLetters("hurry"), true);
                assertEquals(st.hasDoubleLetters("Unbelievable"), false);
	}
        
         @Test
	public void testDeleteVowels() {
		assertEquals(st.deleteVowels("Dixon"), "Dxn");
		assertEquals(st.deleteVowels("I love you"), " lv y");
		assertEquals(st.deleteVowels("You are suss"), "Y r sss");
                assertEquals(st.deleteVowels("AP Computer Science"), "P Cmptr Scnc");
	}
        
         @Test
	public void testShiftThree() {
		assertEquals(st.shiftThree("Bill Dixon"), "Eloo Glarq");
		assertEquals(st.shiftThree("Bark"), "Edun");
		
	}
        
         @Test
	public void testisPalindrome() {
		assertEquals(st.isPalindrome("radar"), true);
		assertEquals(st.isPalindrome("toot"), true);
                assertEquals(st.isPalindrome("lollipop"), false);
		assertEquals(st.isPalindrome("vivid"), false);
		
	}
              @Test
	public void testisPalindromeHard() {
		assertEquals(st.isPalindromeHard("Madam, I'm Adam"), true);
		assertEquals(st.isPalindromeHard("A radar"), false);
                assertEquals(st.isPalindromeHard("Pop hop cat"), false);
		assertEquals(st.isPalindromeHard("A man, a plan, a canal, Panama"), true);
		
	}
}