package Demo;

import java.util.Scanner;

public class AssignmentLoops2E3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n");

		int valN = input.nextInt();
		int sum = valN * (valN + 1) * (2 * valN + 1) / 6;

		System.out.println("Sum of squares of n numbers is " + sum);

		input.close();
	}

}
