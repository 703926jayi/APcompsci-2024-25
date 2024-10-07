import java.util.Scanner;
public class MathTest {
    public static void main(String[] args) {
        int x = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = s.nextLine();
        System.out.println("How many questions do you want?");
        int qnum = s.nextInt();
        int z = 0;
        while(x <= qnum){
            int n1 = (int)(Math.random()*7)+2;
            int n2 = (int)(Math.random()*19)-9;
            int n3 = (int)(Math.random()*89)+10;
            if(n2>=0){
                System.out.println(n1+"x"+"+"+n2+"=" + n3);
            }else{
            System.out.println(n1+"x"+n2+"=" + n3);
            }
            System.out.println("Answer:");
            int pans= s.nextInt();
            int ans = (n3 - n2)/n1;
            if (pans == ans){
                System.out.println("Correct!");
                z++;
            } else{
                System.out.println("Wrong.");
            }
            x++;
        }
        System.out.println("Student: "+ name);
        System.out.println("Results: ");
    }
}
