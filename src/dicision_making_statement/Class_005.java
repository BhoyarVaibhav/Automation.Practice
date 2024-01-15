package dicision_making_statement;

public class Class_005 {
	
     //Disition making statement --nested if example 2
	
	public static void main(String[] args) {
		String g = "Bhuj";
		
		if(g == "Bhuj") {
			System.out.println("your City is Nagpur");
			if (g == "Wardha") {
				System.out.println("Your city is wardha");
				if (g == "Bhuj") {
					System.out.println("Your City is Bhuj");
				}
			}
		}else {
			System.out.println("none of city");
		}
		

	}

}
