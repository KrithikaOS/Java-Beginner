
public class NestedTryDemo {
	 public static void main(String args[]){  
		  try{  
		      try{  
		         System.out.println("Division");  
		         int data =39/0;  
		         }catch(ArithmeticException e){System.out.println(e);}  
		   
		      try{  
		         int a[]=new int[5];  
		         a[5]=4;  
		         }catch(ArrayIndexOutOfBoundsException e){
		        	 System.out.println("Arrayindex");
		        	 System.out.println(e);}  
		     
		          System.out.println("other statement");  
		       }catch(Exception e){System.out.println("Parent exception");}  
		  
		  System.out.println("normal flow..");  
		 }  

}
