package inheritance;

public class Child_Class {
	
	public void cd() {
		System.out.println("cd method from child class");
	}

	public static void main(String[] args) {
		
		//Has-a-relationship
		Parent_class p = new Parent_class();
       p.display();//parent
       p.city();   //parent
       
       
	}

}
