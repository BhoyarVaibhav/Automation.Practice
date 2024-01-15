package Array;

public class Multidimensional_Array {

	public static void main(String[] args) {
	
		 /*2 3 4  (3*3)
		   4 5 7
		   6 7 5*/

		int [][] Matrix = new int [3][3];
		//add value
		Matrix[0][0]=2;
		Matrix[0][1]=3;
		Matrix[0][2]=4;
		
	    Matrix[1][0]=4;
	    Matrix[1][1]=5;
	    Matrix[1][2]=7;
	    
	    Matrix[2][0]=6;
	    Matrix[2][1]=7;
	    Matrix[2][2]=5;	
	    
	    //To print 1 value
	   // System.out.println(Matrix[1][0]);
	    
	    //To print all value--Nested loop
	    for(int i = 0;i<3;i++) {
	    	for(int y = 0;y<0;y++) {
	    		System.out.println(Matrix[i][y]+" ");
	    	}
	    	System.out.println();
	    	
      }
	}
	}
