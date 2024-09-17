import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cost = s.nextDouble();
        int costi = (int) cost*100;
        int d1 = costi %10;
        int d2 = (costi % 100) /10;
        int d3 = (costi % 1000) /100;
        int d4 = (costi % 10000) /1000;
        int d5 = (costi % 100000) /10000;
        if (d1 || d2 || d3 ||d4 ||d5 == 5){
            
        }


    }
}
