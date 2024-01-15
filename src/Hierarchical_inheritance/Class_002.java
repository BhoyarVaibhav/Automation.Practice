package Hierarchical_inheritance;

public class Class_002 extends Class_001 {
	
	public void display() {
		String r = "sd from Class_B";
		System.out.println(r);
	}

	public static void main(String[] args) {
		Class_002 th = new Class_002();
		
		System.out.println(th.b);
		th.display();
		

	}

}
