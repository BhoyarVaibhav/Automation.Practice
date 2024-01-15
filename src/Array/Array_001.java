package Array;

public class Array_001 {

	public static void main(String[] args) {
		
		
	    //single dimensional array
		int marks[] = new int [5];
		
		// To add value
		marks[0] =40;
		marks[1] =41;
		marks[2] =42;
		marks[3] =43;
		marks[4] =44;
		
		//to print one value
		System.out.println(marks[4]);
		
		//to define the length of array
		System.out.println("the length of array:-"+marks.length);
		
		//to print all values of array
		//for(int i=0;i<6;i++) {
		//	System.out.println(marks[i]);
		
	
	    //for print all the values for the loop
		for(int u :marks) {
			System.out.println(u);
			
		
	}

}}
