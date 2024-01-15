package dicision_making_statement;

public class Class_004 {
	
	// Disicion making nested_if----example 1

	public static void main(String[] args) {
		
		float f = 400.56f;
		
		if (f < 500) {
			System.out.println("f is less than 800");
			if(f > 400) {
				System.out.println("f is greater than 500");
				if (f > 700) {
					System.out.println("f is greater than 700");
				}
			}
		} else {
			System.out.println("Your all condition is false");
		}

	}

}
