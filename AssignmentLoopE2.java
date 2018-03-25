package Demo;

import java.util.Scanner;

public class AssignmentLoopE2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two values");
		int startVal = input.nextInt();
		int endVal = input.nextInt();

		for (; startVal <= endVal; startVal++) {
			System.out.println(startVal + "\t" + startVal * startVal);
		}
		input.close();
	}

}
