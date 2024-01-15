package return_statement;

public class Class_001 {
	// Instant Method
	public int add(int b , int s ) {
		
		//it returned addition of 2 numbers
		return b+s;
	}
	public double subtract(double t , double f) { 
	
		return t-f;
	}
	public int g (int g) { 
		return g ;
	}

	public static void main(String[] args) {
		Class_001 h = new Class_001 ();
        System.out.println(h.add(65, 8));
        System.out.println(h.subtract(65, 23));
        System.out.println(h.g(7));
	}

}
