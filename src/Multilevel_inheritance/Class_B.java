package Multilevel_inheritance;

public class Class_B extends Class_A {
	
	public void display() {
		String r = "sd from Class_B";
		System.out.println(r);
	}

	public static void main(String[] args) {
		Class_B k1 = new Class_B();
        System.out.println(k1.b);//from parent 
        k1.getdata();//from parent
        k1.display();//from current 
	}

}
