package Demo;

import java.util.Scanner;

public class AssignmentLoops2E4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines");
		int noOfLines = input.nextInt();
		int ctr = 0;
		while (noOfLines >= 0) {
			for (ctr = 1 ;ctr <= noOfLines; ctr++) {
				System.out.print("*");
				
			}
			System.out.println();
			noOfLines--;
		}
		
		
		input.close();
	}

}
