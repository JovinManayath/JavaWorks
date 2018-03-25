package Demo;

import java.util.Scanner;

public class ArithmeticOperationsE1 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of hours worked");
		double hoursWorked = input.nextDouble();
		System.out.println("Enter pay rate");
		double payRate = input.nextDouble();
		double salary = hoursWorked * payRate;
		System.out.println("Salary is " + salary + " for " + hoursWorked + 
				" hours at a rate of " + payRate + " dollars") ;
		
		input.close();
	}

}
