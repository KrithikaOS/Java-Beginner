
public class StringDemo {
	public String toString()
	{return "hii";}
	public static void main(String args[])
	{   
		StringDemo s= new StringDemo();
		String s1= "HI World"; ///creating string by java string literal  
	    char[] ch = {'s','t','r','i','n','g','s'}; 
	    String s2=new String(ch);//converting char array to string  
	    String s3=new String("example");//creating java string by new keyword  
	     s1.concat("everyone");// wont get concatenated
	     s2= s2.concat("everyone");
	     System.out.println(s); //prints class@objid/hash code if toString method is not defined explicitly
	    System.out.println(s1);  
	    System.out.println(s2);  
	    System.out.println(s3);  
		
	}

}
