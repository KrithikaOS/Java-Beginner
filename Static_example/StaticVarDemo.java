
public class StaticVarDemo {
	
	//Java Program to demonstrate the use of an instance variable  
	//which get memory each time when we create an object of the class.   
	int count=0;//will get memory each time when the instance is created  
	static int count1 = 0;// memory 
	StaticVarDemo()
	{ 
	count1++;
	count++;//incrementing value  
	System.out.println(count+" "+count1);  
	}  

}
