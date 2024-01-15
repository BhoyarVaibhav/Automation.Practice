package Collection_Ex;

import java.util.HashMap;

public class Hashmap_004 {

	public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    
    //to add values 
    map.put(1, "Suraj");
    map.put(2, "mayank");
    map.put(6, "piyu");
    map.put(5, "ram");
    map.put(7, "sujal");
    map.put(9, "harshal");
    
    //to print all values
    System.out.println(map);
    
    //to get size of hashmap
    System.out.println(map.size());
    
    //to removed any value
    map.remove(5);
    map.remove(2, "mayank");
    System.out.println(map);
    
    //to replace any value
    map.replace(9,"Ayushi");
    map.replace(5, "Roshni");
    System.out.println(map);
    
    
    
    
    
    
    
	}

}
