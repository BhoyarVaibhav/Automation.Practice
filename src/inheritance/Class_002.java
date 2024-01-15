package inheritance;

public class Class_002 extends Class_001{
	
	String k = "roshni from child ";
	//instance method
	public void get() {
		System.out.println("I am get method from child");
		}
	
	
	public static void main(String[] args) {
		Class_002 s = new Class_002();
		s.varify();//parent
		s.print();//parent
		System.out.println(s.d);//parent
		s.get();//child
		System.out.println(s.k);//child class
	}

}
