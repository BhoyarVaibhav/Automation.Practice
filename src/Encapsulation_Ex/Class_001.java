package Encapsulation_Ex;

public class Class_001 {
	
	private int a = 6000;
	private void hidemoney(int v) {
		a=v;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Class_001 r = new Class_001();
		r.hidemoney(8);

	}

}
