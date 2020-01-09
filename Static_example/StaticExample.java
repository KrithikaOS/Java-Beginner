public class StaticExample {
	//usage of static block - this will be printed first
	static
	 {
		System.out.println("static block is invoked");
	 }  
	public static void main(String[] args)
	{   System.out.println("Main method inside");
		StaticVarDemo sv= new StaticVarDemo();
		StaticVarDemo sv1= new StaticVarDemo();
		StaticVarDemo sv2= new StaticVarDemo();
		StaticMethodDemo sm=new StaticMethodDemo(1,"Krith");
		StaticMethodDemo sm1= new StaticMethodDemo(2,"Os");
		StaticMethodDemo.change(); // calling a static method through class
		 //calling display method  
	    sm.display();  
	    sm1.display();    
		
	}

}
