package Demo;

import java.util.Scanner;

public class ArithmeticOperationsE3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of a, b and c");
		int valA = input.nextInt();
		int valB = input.nextInt();
		int valC = input.nextInt();
		
		Double root1 = new Double(-valB + Math.sqrt(valB^2 - 4*valA*valC) / 4* valA*valC);
		Double root2 = new Double(-valB - Math.sqrt(valB^2 - 4*valA*valC) / 4* valA*valC);
		
		if (root1.isNaN() || root1.isNaN()) {
			System.out.println("Roots are imaginary");
		}
		else {		
			System.out.println("The roots of the quatratic equation are " + root1 + " and "
				+ root2);
		}

		
		input.close();
		
	}

}