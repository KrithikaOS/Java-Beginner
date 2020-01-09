public class StaticMethodDemo {
	//Java Program to demonstrate the use of a static method.  
	     int id;  
	     String name;  
	     static String college = "REC";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "CER";  
	     }  
	     //constructor to initialize the variable  
	     StaticMethodDemo(int r, String n)
	     {  
	     id = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display()
	       {
	    	 System.out.println(id+" "+name+" "+college);
	    	 }  
	}  


