import java.util.Scanner;
public class Silver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bs = s.next();
        int a = 32;
        
        for(int i = 0; i < bs.length();i++){
           int c = bs.charAt(i);
           bs.replace("you","U");

            bs.replace("y "," ");
            bs.replace("and","&");
            bs.replace("to","2");
            
            bs.replace("for","4");

            if(c != 85 && c != 32 && c ==65 ||c == 69 || c == 73|| c == 79 || c ==97 || c == 101 || c ==105|| c == 111|| c == 117){
                bs = bs.substring(0,c) + bs.substring(c, bs.length());
                i--;
            }
            if(c == 32 && bs.charAt(i-1)==32||c == 32 && bs.charAt(i+1)==32){
                bs = bs.substring(0,c) + bs.substring(c, bs.length());
                i--;
            }

        }
    }
}
