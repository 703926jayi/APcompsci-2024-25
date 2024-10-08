import java.util.Scanner;
public class MathTest {
    public static void main(String[] args) {
        int x = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = s.nextLine();
        System.out.println(name+" How many questions do you want?");
        int qnum = s.nextInt();
        int z = 0;
        
        while(x < qnum){
            
            int n1 = (int)(Math.random()*7)+2;
            int n2 = (int)(Math.random()*19)-9;
            int n3 = (int)(Math.random()*89)+10;
            double ans2 = ((double)n3 - (double)n2)/(double)n1;
            double ans = (n3 - n2)/n1;
            if(ans2 %2 == 0){
            if(n2>=0){
                System.out.println("Question" + qnum);
                System.out.println(n1+"x"+"+"+n2+"=" + n3);
            }else{
            System.out.println("Question" + qnum);
            System.out.println(n1+"x"+n2+"=" + n3);
            }
            System.out.println("Answer:");
            int pans= s.nextInt();
            if (pans == ans){
                System.out.println("Correct!");
                z++;
            } else{
                System.out.println("Wrong.");
                System.out.println(ans);
            }
            x++;
         }
        }
        double p = (((double)z)/((double)x))*100;
        System.out.println("Student: "+ name);
        System.out.println("Results: "+  z + "/" + x);
        System.out.println("Test Percent: "+p+"%");
        if(p>90)
        System.out.println("Letter Grade: A");
        if(p>80&&p<90)
        System.out.println("Letter Grade: B");
        if(p>70&&p<80)
        System.out.println("Letter Grade: C");
        if(p>60&&p<70)
        System.out.println("Letter Grade: D");
        if(p>50&&p<60)
        System.out.println("Letter Grade: E");
        if(p<60)
        System.out.println("Letter Grade: F");
        
    }
}
