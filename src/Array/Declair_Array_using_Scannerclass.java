package Array;
import java.util.Scanner;
public class Declair_Array_using_Scannerclass {

	public static void main(String[] args) {
		
		//Declair the array from the user
		//Scanner class
		Scanner fd = new Scanner(System.in);
		System.out.println("Defined the size of array");
		int size = fd.nextInt();
		
		int[] vf = new int [size];
		
        //add value for input value
		System.out.println("Enter value of array");
		for(int h=0;h<size;h++) {
		vf [h]= fd.nextInt();
		}
		System.out.println("--------------");
		//To print value of array
		System.out.println("Your array values is :-");
		
		//for output
		for(int y=0;y<size;y++) {
			System.out.println(	vf[y]);
	}

}
	}
