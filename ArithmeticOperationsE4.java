package Demo;

import java.util.Scanner;

public class ArithmeticOperationsE4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the marks of six subjects");
		int sub1 = input.nextInt();
		int sub2 = input.nextInt();
		int sub3 = input.nextInt();
		int sub4 = input.nextInt();
		int sub5 = input.nextInt();
		int sub6 = input.nextInt();
		
		float  total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		float average = total / 6;
		System.out.println("Total is " + total + " and average is " + average);
		
		input.close();

	}

}
