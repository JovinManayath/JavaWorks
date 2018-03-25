package Demo;

import java.util.Scanner;
public class kbinput {

	public static void main(String[] args) {
		System.out.println("What is your name");
		Scanner ipval = new Scanner(System.in);
		System.out.println("Hi " + ipval.nextLine());
		
		ipval.close();
	}

}
