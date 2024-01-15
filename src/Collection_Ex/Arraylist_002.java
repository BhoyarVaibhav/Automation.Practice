package Collection_Ex;

import java.util.ArrayList;

public class Arraylist_002 {

	public static void main(String[] args) {
		ArrayList<String> st = new ArrayList<String>();
		
		st.add("Vaibhav");
		st.add("Radha");
		st.add("Pawan");
		st.add(3, "Savita");
		st.add("Mayesh");
		st.add(5, "koyal");
		
		System.out.println(st);
		
		System.out.println(st.get(2));
		System.out.println(st.contains("Radha"));
		

	}

}
