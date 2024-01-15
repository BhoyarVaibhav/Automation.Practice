package Multilevel_inheritance;

public class Class_C extends Class_B {
	static String f = "ed from Class_C";
	
	public void print () {
		System.out.println("f");
	}

	public static void main(String[] args) {
		Class_C k2 = new Class_C();
		
		System.out.println(k2.b);//parent class
		k2.getdata();
		k2.display();
		k2.print();


	}

}
