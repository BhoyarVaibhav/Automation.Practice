package Scanner_Class;
import java.util.Scanner;

public class Scanner_002 {

	public static void main(String[] args) {
		
		//want the city name distric
        Scanner fd = new  Scanner(System.in);
        System.out.println("user to enter the distric name:-");
        String p = fd.next();
        
        //Enter the city name
        System.out.println("user to enter the city name:-");
        String g = fd.next();
        
        //Addition of distric and city 
        String d = p+g;
        System.out.println("The addition of distric and city is:- "+p+" "+g);
	}

}
