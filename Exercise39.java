import java.util.Scanner;
public class Exercise39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d1 =0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;
        int d7 =0;
        int d8 = 0;
        int d9 = 0;
        int num = s.nextInt();
        d1 = num / 100000000;
        //System.out.println(d1);
        d2 = (num % 100000000)/10000000;
       // System.out.println(d2);
        d3 = (num % 10000000)/1000000;
      //  System.out.println(d3);
        d4 = (num % 1000000)/100000;
       // System.out.println(d4);
        d5 = (num % 100000)/10000;
       // System.out.println(d5);
        d6 = (num % 10000)/1000;
      //  System.out.println(d6);
        d7 = (num % 1000)/100;
      //  System.out.println(d7);
        d8 = (num % 100)/10;
      // System.out.println(d8);
        d9 = (num % 10)/1;
     //  System.out.println(d9);
        int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);
        if (d10 != 10){
            System.out.println("The ISBN-10 number is " + d1 +"" + d2 +"" + d3 +"" + d4+ ""+ d5+ "" + d6 + ""+ d7+""+ d8+""+d9+""+d10);
        } else {
            System.out.println("The ISBN-10 number is " + d1 +"" + d2 +"" + d3 +"" + d4+ ""+ d5+ "" + d6 + ""+ d7+""+ d8+""+d9+"X");
        }
    }
}
