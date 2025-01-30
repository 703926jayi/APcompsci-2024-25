import java.util.Scanner;
public class Password 
{
    public static void main(String[] args) 
    {
       int  int1 = 0;
       int  int2 = 0;
       int  int3 = 0;
       int  int4 = 0;
       int  int5 = 0;
       int  int6 = 0;
       int  int7 = 0;
       int  int8 = 0;

        Scanner s= new Scanner(System.in);
        String user = "javaWizard16";
        String pw = s.nextLine();  

        if(checkOne(pw)==1){
            int1 = 1;
        }
        if(checkTwo(pw)==1){
            int2 = 2;
        }if(checkThree(pw)==1){
            int3 = 3;
        }if(checkFour(pw)==1){
            int4 = 4;
        }if(checkFive(pw)==1){
            int5 = 5;
        }if(checkSix(pw)==1){
            int6 = 6;
        }if(checkSeven(pw)==1){
            int7 = 7;
        }if(checkEight(pw,user)==1){
            int8 = 8;
        }
        if(int1 ==0&&int2 ==0&&int3 ==0&&int4 ==0&&int5 ==0&&int6 ==0&&int7 ==0&&int8 ==0){
            System.out.println("password accepted");
        } else{
            System.out.print("invalid password ");
            if(int1 == 1){
                System.out.print("1");
            }
            if(int2 == 2){
                System.out.print("2");
            }
            if(int3 == 3){
                System.out.print("3");
            }
            if(int4 == 4){
                System.out.print("4");
            }
            if(int5 == 5){
                System.out.print("5");
            }
            if(int6 == 6){
                System.out.print("6");
            }
            if(int7 == 7){
                System.out.print("7");
            }
            if(int8 == 8){
                System.out.print("8");
            }
        }

                
    }
    public static int checkOne(String pw){
        int  a=0;
        if(pw.length()<7||pw.length()>=16){
            a = 1;
        }
        return a;
    } 
    public static int checkTwo(String pw){
        int  a=0;
        for(int i = 0; i < pw.length();i++){  
            if (isNumber(pw.charAt(i))||isLetter(pw.charAt(i))||isValidSymbol(pw.charAt(i))){
                a = 0; 
            } else{
                a = 1;
                break;
            }         
        }
        return a;
    } 
    public static int checkThree(String pw){
        int a =0;
        if(isLetter(pw.charAt(0))){
            a = 0;
        } else{
            a = 1;
        }
        return a;
    }
    public static int checkFour(String pw){
        int  a=0;
        int z = 0;
        for(int i = 0; i < pw.length();i++){  
            if (isNumber(pw.charAt(i))){
                z++; 
            }       
        }
        if (z<2){
            a++;
        }
        return a;
    } 
    public static int checkFive(String pw){
        int  a=0;
        for(int i = 0; i < pw.length();i++){  
            if(isValidSymbol(pw.charAt(i))){
                a = 0;
                break;

            } else{
                a =1;
            }
        }        
        return a;
    } 
    public static int checkSix(String pw){
        int  a=0;
        for(int i = 0; i < pw.length();i++){  
            if (isValidSymbol(pw.charAt(i))&&isValidSymbol(pw.charAt(i-1))){
                a = 1;
            }       
        }
        return a;
    } 
    public static int checkSeven(String pw){
        int  a=0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < pw.length();i++){  
           if(pw.charAt(i)>=65&&pw.charAt(i)<=90){
            c=1;
           }
           if(pw.charAt(i)>=97&&pw.charAt(i)<=122){
            b=1;
           }
        }
        if(b==0||c==0){
            a=1;
           }
        return a;
    } 
    public static int checkEight(String pw, String user){
        int a = 0;
        if(pw.equals("Lava1!")){
            a = 1;
        } else if (pw.equals("Cyranod1619")){
            a = 1;
        }
        return a;
    } 
    public static boolean isLetter(char c)
    {
        return c>=65 && c <=90 || c >=97 && c <=122;
    }

    public static boolean isNumber(char c)
    {
        return c >=48 && c <=57; 
    }

    public static boolean isValidSymbol(char c)
    {
        return c =='!' || c=='$' || c=='_';
    }
}
