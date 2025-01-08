import java.util.Scanner;


public class AdjustLetters 
{
    public static void main(String[] args) 
    {
        char[][] letters = { {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                             {'H', 'I', 'J', 'K', 'L', 'M', 'N'},
                             {'O', 'P', 'Q', 'R', 'S', 'T', 'U'},
                             {'V', 'W', 'X', 'Y', 'Z', 'A', 'B'},
                             {'C', 'D', 'E', 'F', 'G', 'H', 'I'}};
        
       Scanner s = new Scanner(System.in);
       int row = s.nextInt();
       int col = s.nextInt();
       if(row>=0&& col>=0&&row>=5&&col<=5){
       adjust(letters, row, col);
       output(letters);
       } else{
        System.out.println("invalid output");
       }
    }
     public static void adjust(char[][] letters, int x, int y){
        for(int r=0; r<letters.length;r++){
            for (int c = 0; c < letters[0].length; c++) 
            {
                if(r==x||c==y){
                    if (letters[r][c] >= 'A' && letters[r][c] <= 'Z') { letters[r][c] += 32; 
                } 
               
            }
            }
        }
     }
     public static void output(char[][] letters)
    {   
        for (int r = 0; r < letters.length; r++) 
        {
            for (int c = 0; c < letters[0].length; c++) 
            {
                System.out.print(letters[r][c]);
            }
            System.out.println("");
        }
    
    }
}