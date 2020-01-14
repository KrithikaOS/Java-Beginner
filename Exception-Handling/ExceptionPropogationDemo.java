//An exception is first thrown from the top of the stack and if it is not caught,
//it drops down the call stack to the previous method,If not caught there, 
//the exception again drops down to the previous method, and so on until they are caught
//or until they reach the very bottom of the call stack.This is called exception propagation.
public class ExceptionPropogationDemo {
	void m()
	{   System.out.println("inside m before exception");
		int d=50/0;
		System.out.println("inside m after exception");
	}
	void n()
	{
		m();
	    System.out.println("inside n");
	}
	void p()
	{  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[]){ 
		ExceptionPropogationDemo e= new ExceptionPropogationDemo();
	     e.p();
		System.out.println("normal flow...");  
	}
}
