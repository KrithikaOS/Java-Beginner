
public class ToStringDemo {
	 
		 int rollno;  
		 String name;  
		 String city;  
		  
		 ToStringDemo(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
		   ToStringDemo s1=new ToStringDemo(101,"Raj","lucknow");  
		   ToStringDemo s2=new ToStringDemo(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
	  

}
