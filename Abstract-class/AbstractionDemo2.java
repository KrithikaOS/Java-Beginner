public class AbstractionDemo2 {
	public static void main(String args[]){  
		  AbstBike obj = new AbstHonda();  //cannot instantiate the type AbstBike 
		  obj.run();  
		  obj.changeGear();  
		 }  
}