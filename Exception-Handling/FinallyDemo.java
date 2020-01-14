
public class FinallyDemo {
	public static void main(String args[])
	{
		try{
			int a[]=new int[5]; 
		      a[10]=100/0; 
		    }catch(Exception e) {System.out.println("inside catch");}
		finally{System.out.println("finally block is always executed");}  
		System.out.println("Rest of the code");
	}

}
