package Ploymorphism_Ex;

public class Class_001 {
	
	public void print() {
		System.out.println("method without argument");
	}
   // public void print(int x) {
   // 	System.out.println("method int argument");
   //}
    public void print(double d) {
    	System.out.println("method double argument");
	
    }
    public void print(String y,float o) {
    	System.out.println("method two argument");
		
	}
	public static void main(String[] args) {
		
		Class_001 h1 = new Class_001();
		h1.print();
		h1.print(2);
		h1.print(12.87);
		h1.print("sd", 34.09f);
	}

}
