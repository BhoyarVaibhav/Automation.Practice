package operator;

public class Logical_Operator {

	public static void main(String[] args) {
		int x = 30;
		int y = 20;
		//logical not
		boolean m = !(x > y);
		System.out.println(m);
		
		//LOgical or
		boolean h = (x > y || x < y);
		System.out.println(h);
		
		//Logical And
		boolean b = (x > y && y < x);
		System.out.println(b);
		
		// increment 
		int d = ++x;
		System.out.println(d);
		
		// decrement
		int f = --y;
		System.out.println(f);
		

	}

}
