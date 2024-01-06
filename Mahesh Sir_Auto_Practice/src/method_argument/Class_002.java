package method_argument;

public class Class_002 {
	//Instance Variable
	  int X;
	//Static variable
	 static int Y;
	 
	// instant method 
	public void function (int p) {
		X = p ;
		System.out.println("I am instant variable is-"+ X);
	}
	//static method 
	public static void print (int f ){
		Y = f ;
		System.out.println("i am static variable is - "+ Y);
	} 

	public static void main(String[] args) {
		Class_002 n  = new 	Class_002();
        n.function(55);    //Call instant mehod 
        print(87);         //call static method 
	}

}
