package Ploymorphism_Ex;

public class Child_class extends Parent_Class{
	
	//instance method
	public void print(int y){
		System.out.println("print method from child class");
	}

	//static method
		public static void login(float g){
			System.out.println("login method from child class");
		}
	
	public static void main(String[] args) {
		Child_class b1 = new Child_class();
        //b1.print(6);
		b1.login(12.09f);
		
        
        Parent_Class f = new Child_class();
        //f.print(2);
        f.login(0);
        
        
        //has- a- relationship
        Parent_Class y = new Parent_Class();
        //y.print(9);
        
	}

}
