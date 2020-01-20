import java.util.*;
public class ArrayListDemo{
	
	public static void main(String args[]){  
		ArrayList example=new ArrayList();//Creating array list  
		example.add("Ravi");//Adding object in array list  
		example.add("Vijay");  
		example.add("Ravi");  
		example.add(1);  
		//Traversing list through Iterator  
		//sArrayList<String> arr= example.iterator(); //compile error -cannot convert from ArrayList to iterator
		Iterator itr=example.iterator(); //iinterface
		while(itr.hasNext()){ 
			
		System.out.println(itr.next()); 
		itr.remove();
		System.out.println( " "+itr.next()); 
		
		}  
	
		Iterator<String> itr1=example.iterator(); 
		System.out.println( " "+itr1.next());
		}  

}
