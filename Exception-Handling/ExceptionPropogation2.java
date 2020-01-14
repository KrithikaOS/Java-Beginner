//throws ct error if comments are removed for throws
public class ExceptionPropogation2 {
	  void m(){
		  try {
		    throw new java.io.IOException("device error");//checked exception
		  }catch(Exception e){System.out.println("exception handeled in m");}//exception caught
	  }
		  void n(){
		    m();
		   // throw new java.io.IOException("device error");
		    System.out.println("inside n");
		  }
		  void p(){
		   try{
		    n();
		   }catch(Exception e){System.out.println("exception handeled");}
		  }
		  public static void main(String args[]){
		 // throw new java.io.IOException("device error");
		   ExceptionPropogation2 obj=new ExceptionPropogation2();
		   obj.p();
		   System.out.println("normal flow");
		  }

}
