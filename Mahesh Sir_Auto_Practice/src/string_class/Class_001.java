package string_class;

public class Class_001 {
   

	public static void main(String[] args) {
		
	       String p = "abf";//by literal
	       String f = new String("Douctor");//by using new keyword
         
	       //Check for empty 
	       System.out.println(p.isEmpty());
	    
	       //Check for empty	   
	       String m = "";
	       System.out.println(m.isEmpty());
	       
	      // Check for length of the character
	       String a = "Sujal";
	       System.out.println(a.length());
	       
	      // to replace some character
	       String k = "Raju";
	       System.out.println(k.replace("R", "G"));
	       
	      // to get index/position of the character 
	       String o = "piyush";
	       System.out.println(o.indexOf("y"));
	       
	       //To get sub string  index with respect index
	       String e = "Characters";
	       System.out.println(e.substring(4));
	       System.out.println(e.substring(2, 7));
	       
	       //To get the character with respect to index
	       String d = "Nagpur";
	       System.out.println(d.charAt(3));
	       
	       //add another string in given string 
	       String l = "piyush";
	       System.out.println(l.concat(" Master"));
	       
	       //gets string in lower case
	       String t = "Raju";
	       System.out.println(t.toLowerCase());
	       
	       // gets string in upper case
	       String q = "sujatpur";
	       System.out.println(q.toUpperCase());
	       
	       //remove bigining and ending spaces
	       String w = "  solo_dance  ";
	       System.out.println(w.trim());
	       
	       //to check character which is present in given string 
	       String b = "Raju is a good boy";
	       System.out.println(b.contains("good"));
	       
	       //to check actual & expected result
	       String actual = "Amazon";
	       String expected = "Amazon";
	       System.out.println(actual.equals(expected));
	       
	       // to ignore case
	       String actual_1 = "Ajay Testing";
	       String expected_1 = "ajay testing";
	       System.out.println(actual_1.equalsIgnoreCase(expected_1));
	       
	       
	}

}
