package Collection_Ex;

import java.util.ArrayList;

public class Arraylist_001 {

	public static void main(String[] args) {
		ArrayList<Integer> rn = new ArrayList<Integer>();
		
		//Add the values
		rn.add(1);
		rn.add(2);
		rn.add(3);
		rn.add(4);
		rn.add(5);
		rn.add(7);
		
		// w.r.t index
		rn.add(5, 6);
		rn.add(null);
		
		
		//to print all values
		System.out.println("Values of Arraylist is:-"+rn);
		
		//to get value w.r.t index
		System.out.println(rn.get(3));
		System.out.println(rn.get(6));
		

		//remove one value
		rn.remove(4);
		System.out.println("Values of Arraylist is:-"+rn);
		
		//to search any value
		System.out.println(rn.contains(2));
		System.out.println(rn.contains(20));
		
		//check for list empty or not 
		System.out.println(rn.isEmpty());
		
		//create copy for list
		System.out.println(rn.clone());
		
		System.out.println("Values of Arraylist is:-"+rn);
		
		
		
		
		
	}

}
