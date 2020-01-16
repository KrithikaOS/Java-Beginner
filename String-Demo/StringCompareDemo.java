
public class StringCompareDemo {
	public static void main(String args[])
	{
		String s1= "Hello";
		String s2= "Hello";
		String s3= new String("Hello");
		String s4= new String("Hello");
		String s5= "H";
		 System.out.println("using equals");
		 System.out.println(s1.equals(s2));//true  
		 System.out.println(s1.equals(s3));//true  
		 System.out.println(s3.equals(s4));//true
		 System.out.println("using = =");
		 System.out.println(s1==(s2));//true  
		 System.out.println(s1==(s3));//false  
		 System.out.println(s3==(s4));//false
		 System.out.println("using compareTo");
		 System.out.println(s1.compareTo(s2));//0  
		 System.out.println(s1.compareTo(s5));//4(because s1>s5)  
		 System.out.println(s5.compareTo(s1));//-4(because s5 < s1 ) 
		 System.out.println(s1.compareTo(s3));//0  
		 System.out.println(s3.compareTo(s4));//0  
		  
	}

}
