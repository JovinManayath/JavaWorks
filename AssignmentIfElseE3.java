package Demo;

import java.util.Scanner;

public class AssignmentIfElseE3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the count of cookies");
		double cookieCount = input.nextDouble();
		
		System.out.println("Enter the count of cake");
		double cakeCount = input.nextDouble();
		
		double totalPrice = cookieCount * 0.05 + cakeCount * .03 ;
		if (totalPrice > 10) {
			System.out.println("Discount is " + totalPrice * .05);
		}
		else {
			System.out.println("No discount");
		}
		input.close();
	}

}
