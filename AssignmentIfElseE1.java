package Demo;

import java.util.Scanner;

public class AssignmentIfElseE1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the item price");
		double price = input.nextDouble();
		System.out.println("Discount is " + price * .05);
		
		input.close();
	}

}
