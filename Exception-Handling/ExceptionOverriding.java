//to test cases the Overriding and Exception handling
	import java.io.*;  
	class Parent{  
	  void wrongOne()throws ArithmeticException{System.out.println("parent wrong one");}
	  void correctOne()throws Exception{System.out.println("parent");}
	}  
	  
	class ExceptionOverriding extends Parent{  
	 // void wrongOne()throws Exception{System.out.println("child");} // compile time error since the same method in parent class has specific exception whereas here it throws parent exception
	  void correctOne()throws Exception{System.out.println("child correcttone");}
	  
	  public static void main(String args[]){  
	   Parent p=new ExceptionOverriding();  
	   try{  
	   p.wrongOne();  
	   p.correctOne();
	   }catch(Exception e){}  
	  }  
	}  

