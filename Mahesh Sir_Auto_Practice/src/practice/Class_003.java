package practice;

public class Class_003 {
	   //instant Variable
	   //int i = 6;
	   //byte b = 7;
	   
	   //Static Variable
	   static double d = 23.5;
	   
	   
	  //Static Method
	public static void getdata() {
		
		System.out.println("I am static method");
		System.out.println(d);
		System.out.println(Class_003.d);
		
		Class_003 h = new Class_003();
		//Access instant varible in static method
		//System.out.println(h.i);
		//System.out.println(h.b);
		
		
	} 

	public static void main(String[] args) {
		Class_003 j = new Class_003();
		//Access by class referance variable instant variable
		//System.out.println(j.i);
		
		System.out.println(d);
		System.out.println(Class_003.d);
		
		getdata();//Access by directly
		Class_003.getdata();//Access by class name
		
	}

}
