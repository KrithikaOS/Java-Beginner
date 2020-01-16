
 abstract class AbstBike { //only abstract/final and public is prohibited //both final and abstract can't be together
	//clas should be declared as abstract if it contains abstract methods inside 
	AbstBike()
	 {System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  

}
