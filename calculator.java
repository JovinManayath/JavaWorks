package Demo;

import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
	
		Scanner kbip = new Scanner(System.in);
		System.out.println("Enter first number");
		float fnum = kbip.nextFloat();
		System.out.println("Enter second number");
		float snum = kbip.nextFloat();
		float result = fnum + snum;
		System.out.println("Total is" + result);
		kbip.close();
	}

}
