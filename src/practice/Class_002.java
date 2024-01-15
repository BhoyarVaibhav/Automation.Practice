package practice;

public class Class_002 {
	
	 //Instance Variable-Inside the class  outside the method.
	       int i = 6;
	       byte b = 7;
	       
	       //Static Variable
		   static double d = 23.5;
		   
	
	//Instance Method
	    public void varify() {
		System.out.println("Instant Mthod");
		
	//Access instant varible in instant method.
		System.out.println(i);
		
	//Access static varible in instant method.
		System.out.println(d);//directly
		System.out.println(Class_002.d);//Class name
	}

	public static void main(String[] args) {
		
		Class_002 b = new Class_002();
		Class_002 l = new Class_002();
		
		l.varify();
		b.varify();

	}

}
