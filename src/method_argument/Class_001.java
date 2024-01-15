package method_argument;

public class Class_001 {
	
	int y ;
	
	//instance variable 
	public void varify (int sd) {
		y = sd;
		System.out.println(y);
	}
	public void kl() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Class_001 g = new Class_001();
		g.varify(57);
		g.kl();
	}

}
