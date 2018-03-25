package Demo;

import java.util.Scanner;
public class ArithmeticOperationsE2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		int valX = input.nextInt();
		double result = 3 * Math.pow(valX , 2) - 8 * valX + 4;
		
		System.out.println("Result of the quatratic equation is " + result );

		
		input.close();
		
	}

}
