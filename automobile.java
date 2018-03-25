package Demo;

import java.util.Scanner;

public class automobile {

	public static void main(String[] args) {
		
		Scanner kbip = new Scanner(System.in);
		System.out.println("Enter the car name");
		
		String carName = kbip.nextLine();
		car car = new car();
		car.message();
		
		car.simpleMessage(carName);
	}

}
