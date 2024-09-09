import java.util.Scanner;


public class IfPractice 
{
    public static void main(String[] args) 
    {
       // Scanner s = new Scanner(System.in);
       // int num = s.nextInt();
        int rNum = (int)(Math.random()*100) + 1;
        
        System.out.println(rNum);
        //1 - Number is Odd
        if(rNum % 2 ==1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //2 - Divisible by 7
        if (rNum % 7 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        } 
        //3 - Greater than 50
        if(rNum > 50){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //4 - Less than 10
        if (rNum < 10){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //5 - Number is 17
        if (rNum == 17){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //6 - Has 2 digits
        if (rNum >= 10 && rNum <= 99){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //7 - Has the digit 2 in it
        if (rNum % 10 == 2||rNum /10 == 2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //8 - Number is in range of 90 to 100, or under 60
        if (rNum >= 90 || rNum < 60){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //9 - Has 2 digits and both digits are same
        if (rNum % 10 == rNum / 10){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        //10 - The number has an even digit
        if (rNum % 10 % 2 == 0 ||rNum/10 % 2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}