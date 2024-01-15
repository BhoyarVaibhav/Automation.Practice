package Constructor_Ex;

public class Constructor_001 {
	
	//User defined Constructor
	public Constructor_001(){
		System.out.println("User Defined Constructor");
		
		for(int g =0;g<5;g++) {
			System.out.println(g);
		}
	}
	
	//Parameterized constructor
	public Constructor_001(int s,int r) {
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		Constructor_001 nh = new Constructor_001();
		Constructor_001 nn = new Constructor_001(8, 9);
	}
	}


