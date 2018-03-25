package Demo;

import java.util.Scanner;

public class AssignmentLoops2E1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		do {
			System.out.println("Enter an Integer");
			sum += input.nextInt();
			System.out.println("Sum is " + sum);

		} while (sum < 20);

		input.close();
	}

}
