package loop_Examples;

public class Class_002 {

	public static void main(String[] args) {
		
		//While Loop
		
		double d = 0.0;
		while(d<10) {
      System.out.println(d);
      d++;}
		
		//print 10 to 0
		int  g = 10;
		while(g>=0) {
      System.out.println("the value of g is:-" + g);
      g--;}
		
		//print even no from 0-100
		int i = 0;
		while (i<=100) {
			if (i % 2 == 0) {
				System.out.println(i);
		}
			i++;
		}
		
	}

}
