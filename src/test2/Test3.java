package test2;

public class Test3 {
	
	
	// static varaibales
	
	 static int a = m1();
	 
	 //static block
	 
	 static
	 {
		 System.out.println("Inside static block");
		 
	 }
	 
	 //static method
	 
	 static int m1()
	 {
		 System.out.println("from m1");
return 30;
		 
	 }
	
	//static method
	 
	

	public static void main(String[] args) {

		System.out.println("Value of a : " + a);
		System.out.println("from main");
		

	}

}
