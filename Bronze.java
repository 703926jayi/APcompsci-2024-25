import java.util.Scanner;
public class Bronze
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        double hourlyWage = s.nextDouble();
        double totalWage = 0.0;
        if (hour <= 40){
            totalWage = hour*hourlyWage;
        } else if(hour <= 80 && hour > 40){
            totalWage = ((hourlyWage*40) + (1.5*hourlyWage*(hour - 40)));
        } else if(hour > 80){
            totalWage = ((hourlyWage*40) + (1.5*hourlyWage*40)+(2.0*hourlyWage*(hour-80)));
        }
        if((totalWage*100) %10 == 0){
        System.out.println("You earned $" + totalWage + "0" + " this week.");
        } else if((int)totalWage/1000 == 0){
            System.out.println("You earned $" + totalWage + "0" + " this week.");
        } else {
        System.out.println("You earned $" + totalWage + " this week.");
        }
    }
}
