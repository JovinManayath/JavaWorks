package Demo;

import java.util.Scanner;

public class AssignmentIfElseE2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the item price");
		double price = input.nextDouble();
		
		if (price > 10) {
			System.out.println("Discount is " + price * .05);
		}
		else {
			System.out.println("No discount");
		}
		input.close();
	}

}
