package Demo;

import java.util.Scanner;

public class ArithmeticOperationsE5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sub1, sub2, sub3, sub4, sub5, sub6;
		float total, average;
		
		for ( int i = 1; i<=3; i++) {
			System.out.println("Enter the marks of six subjects for student " + i);
			sub1 = input.nextInt();
			sub2 = input.nextInt();
			sub3 = input.nextInt();
			sub4 = input.nextInt();
			sub5 = input.nextInt();
			sub6 = input.nextInt();
			total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
			average = total / 6;
			System.out.println("Total is " + total + " and average is " + average);
		}
		
		input.close();


	}

}
