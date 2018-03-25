package Demo;

import java.util.Scanner;

public class InstanceV {

	public static void main(String[] args) {

		Scanner kbip = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = kbip.nextLine();
		
		Name nameObj = new Name();
		//System.out.println(nameObj.name);
		nameObj.setName(name);
		nameObj.disName();
		Name nameObj1 = new Name(name);
		nameObj1.disName();
		
	}

}

class Name {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Name(String name) {
		this.name = name;
	}

	public Name() {
		// TODO Auto-generated constructor stub
	}

	public String getName(){
		return this.name;
	}
	
	public void disName() {
		
		System.out.printf("Name is %s \n" , getName());
	}
	
}
