package date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_001 {

	public static void main(String[] args) {
 
		Date k = new Date();
		System.out.println(k.toString());
		
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(s.format(k));
		
		SimpleDateFormat p = new SimpleDateFormat("dd-yyyy");
		System.out.println(p.format(k));
	}
	}


