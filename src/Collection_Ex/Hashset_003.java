package Collection_Ex;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_003 {

	public static void main(String[] args) {
		
		HashSet<Float> dr = new HashSet<Float>();
		
		//to add values
		//dr.add(40.78f);
		
		//100 to 120
		for(float f=100.00f;f<=120.00f;f++) {
			dr.add(f);
		}
         //System.out.println(dr);
         
         //to removed 1 value
         //dr.remove(102.00f);
        // System.out.println(dr);
         
         //to search any value
        //System.out.println(dr.contains(120.00f));
        
        //to create copy  of hashset
       // System.out.println(dr.clone());
        
        //to removed all value
       // dr.clear();
        //System.out.println(dr);
        
       //to print all values using iterator
           Iterator<Float> h = dr.iterator();
           while(h.hasNext()) {
        	   System.out.println(h.next());
           }
         
	}

}
