package method_argument;

public class Class_003 {
	  int X;
	//Static variable
	 static int Y;
	 static String u;
	 static boolean l;
	// instant method 
	public void function (int p ,float k) {
		X = p ;
		System.out.println("I am instant variable is-"+ X);
	}
	//static method 
	public static void print (String f ){
		u = f ;
		System.out.println("i am static variable is - "+ u);
	} 
	public static void varify (boolean a ){
		l = a ;
		System.out.println("i am static variable is - "+ l);
	} 


	public static void main(String[] args) {
		Class_003 n  = new 	Class_003();
        n.function(76, 90.87f);   //Call instant mehod 
        print("abc");         //call static method 
        varify(false);
    	} 
	
}

