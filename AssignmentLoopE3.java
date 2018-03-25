package Demo;

import java.util.Scanner;

public class AssignmentLoopE3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalLeftSideWeight = 0, totalRightSideWeight = 0;
		do {
			System.out.println("Enter the left side weight");
			totalLeftSideWeight += input.nextInt();
			System.out.println("Enter the right side weight");
			totalRightSideWeight += input.nextInt();
			
			if (totalLeftSideWeight == totalRightSideWeight) {
				System.out.println("Weights are equal");
			}
			else System.out.println("Weights are not equal");
			
		} while (totalLeftSideWeight != totalRightSideWeight);

		input.close();
	}

}
