package non_primitive_data;

import inheritance.Class_001;

public class Class_002 extends Class_001{
	
	
	public void az() {
		System.out.println("Method az");
	}

	public static void main(String[] args) {
		//to access property from Class_001
		Class_002 tf = new Class_002();
        tf.print();
        tf.varify();
        tf.az();
	}

}
