import java.util.Scanner;
public class DixonianCurrency {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 // Receive the amount
 System.out.print(
 "Enter an amount, for example, 11.56: ");
 double amount = input.nextDouble();

 int remainingAmount = (int)(amount * 100);
 int numberOf$17 = remainingAmount / 1700;
 remainingAmount = remainingAmount % 1700;

 // Find the number of one dollars
 int numberOf$7 = remainingAmount / 700;
 remainingAmount = remainingAmount % 700;

 // Find the number of quarters in the remaining amount

 int numberOf$3 = remainingAmount / 300;
 remainingAmount = remainingAmount % 300;
 // Find the number of dimes in the remaining amount


 int numberOfc44 = remainingAmount / 44;
 remainingAmount = remainingAmount % 44;
 // Find the number of nickels in the remaining amount

 int numberOfc15 = remainingAmount / 15;
 remainingAmount = remainingAmount % 15;

 // Find the number of pennies in the remaining amount
 int numberOfc4 = remainingAmount / 4;
 remainingAmount = remainingAmount % 4;


 int numberOfc1 = remainingAmount;


 // Display results
 System.out.print(numberOf$17);
 System.out.print(numberOf$7);
 System.out.print(numberOf$3);
 System.out.print(numberOfc44);
 System.out.print(numberOfc15);
 System.out.print(numberOfc4);
 System.out.print(numberOfc1);
 
 }
}