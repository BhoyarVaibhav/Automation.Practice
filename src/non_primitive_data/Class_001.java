package non_primitive_data;

public class Class_001 {
	//Non primitive data_type--String Concatination ;
	String a = "SF";
	String b = " BX";
	
	String P = "SF "+"BX";
	//Combine two other string
	String p = a.concat(b);
	

	public static void main(String[] args) {
		Class_001 j = new Class_001();
        System.out.println(j.p);//1 st way
        System.out.println(j.a+" "+j.b);//2nd way
        System.out.println(j.P);//3rd way
	}

}
