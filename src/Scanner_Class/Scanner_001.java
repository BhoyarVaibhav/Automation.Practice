package Scanner_Class;
import java.util.Scanner;



public class Scanner_001 {

	public static void main(String[] args) {
	
		//Enter two no and perform the the addition operation on it.
		Scanner hg = new Scanner(System.in);
		System.out.println("Enter the 1st number:-");
		int a = hg.nextInt();
	
		//Enter the 2nt number
		System.out.println("Enter the 2nd number:-");
		int b = hg.nextInt();
		
		int c = a+b;
		System.out.println("The addition of two no is:-"+c);
		
		
		
		

	}

}
