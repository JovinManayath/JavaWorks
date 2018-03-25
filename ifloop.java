package Demo;

public class ifloop {
	public static void main(String args[]) {
		int num = 4;
		if (num < 3) {
			System.out.println("Smaller");
				
		}
		else if (num == 3) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Greater");
		}
		
		//Conditional operators..
		System.out.println(num > 5 ? "Num > 5" : "Num < 5");
	}
	

}
