public class ExceptionHandling{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
	  int a[]=new int[5]; 
      a[10]=100/0;  //though a[10] should through arrayindex exception, the first arithmetic exception catch block gets executed and then rest of the code gets printed
      String s=null;  //wont get executed since there is exception in previous statement
      System.out.println(s.length());//wont get executed
      }
   catch(ArrayIndexOutOfBoundsException e) {System.out.println("Array out of Bounds exception");}
   catch(ArithmeticException e) {System.out.println("arithmetic class exception");}
   catch(Exception e){System.out.println("Parent class exception");}
  // catch(ArithmeticException e) {System.out.println("arithmetic class exception");}  Here if this is defined after parent exception,error occurs
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  