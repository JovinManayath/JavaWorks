package Demo;

import java.util.Scanner;

public class AssignmentLoops2E5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines");
		int noOfLines = input.nextInt();
		int ctr, i, j = 0;
		int temp = noOfLines;
		while (noOfLines > 0) {
			for (ctr = 1; ctr < noOfLines; ctr++) {
				System.out.print(" ");

			}

			for (j = 0; j <= temp - noOfLines; j++) {
				System.out.print("*");
				if (j != 0) {
					System.out.print("*");

				}
			}

			System.out.println();
			noOfLines--;

		}

		ctr = 0;
		while (ctr++ < 3) {
			for (i = 2 * temp - 1; i > 0; i--) {
				if ((i == temp - 1) || (i == temp) || (i == temp + 1)) {
					System.out.print("*");

				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		input.close();
	}

}
