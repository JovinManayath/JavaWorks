package Demo;

import java.util.Scanner;

public class AssignmentLoops2E2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		do {
			System.out.println("Enter any value");
			sum += input.nextDouble();
			System.out.println("Sum is " + sum);

		} while (sum < 20);

		input.close();
	}

}
