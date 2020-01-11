public class ThisWith {
	int rollno;  
	String name;  
	float fee;  
	ThisWith(int rollno,String name)
	{this.rollno=rollno;  // variable points to obj of the current class
	this.name=name;  }
	ThisWith(int rollno,String name,float fee){  
	this(rollno,name);// provides reusability of constructor
	this.fee=fee;  
	}  
	 void dis(ThisWith obj)
	 {System.out.println("Example of using this");}
	void display(){
		this.dis(this);// calling the method using this - reusability of methods and passing this as an object
		System.out.println(this.rollno+" "+name+" "+fee); 
	    }  
}
