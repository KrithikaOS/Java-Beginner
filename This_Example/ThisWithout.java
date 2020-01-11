class ThisWithout{  
int rollno;  
String name;  
float fee;  
ThisWithout(int rollno,String name,float fee){  
rollno=rollno;  //the assignment to variable has no effect
name=name;  // there will be ambiguity since the reference variables and param passed have the same name
fee=fee;  
}  
void display(){
	System.out.println("Example of without using this");
	System.out.println(rollno+" "+name+" "+fee);}  
}  