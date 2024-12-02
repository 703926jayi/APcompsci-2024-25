import java.util.Scanner;

public class PayRoll
{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter employee information:");
			String[] name = new String[5]; //holds the name of the five employees
			int[] hoursWorked = new int[5]; //holds the hours worked this week for the employees
			double[] wage = new double[5];  //holds the hourly wage of each employee
			double []payCheck = new double[5];   //holds the gross pay for each employee
			
			for(int x = 0; x < name.length;x++)
			{
				name[x] = s.next();  
				hoursWorked[x]=s.nextInt();
				wage[x] = s.nextDouble();
				payCheck = calculatePay(hoursWorked, wage);
				
			}
			outputPayChecks(name, hoursWorked, wage, payCheck);
			System.out.println("Recommended Employee Termination: " + name[fireSomeone(payCheck)]);
		}

//create the calculatePay method - It should receive the hoursWorked and wage arrays and return a new array, holding the weekly pay for the five employees
    }
//create the outputPayChecks method - it should receive all four arrays and create the output show on the assignment.
		
//create the fireSomeonemethod - This method should receive the payCheck array and send back the index of the employee with the highest paycheck
		

