package Multilevel_inheritance;

public class Class_D extends Class_C{
	
	String v = "zx from class_D";
	
	public void allow() {
		System.out.println(v);
	}

	public static void main(String[] args) {
		Class_D k3 = new Class_D();
		
		k3.allow();//current class
		System.out.println(k3.b);
		k3.display();//class_B
		k3.print();//class_c
	}

}
