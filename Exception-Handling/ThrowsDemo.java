import java.io.IOException;
public class ThrowsDemo {
	void m()throws IOException{  
		//try{  
	    throw new IOException("device error");//checked exception  
		//}catch(Exception e){System.out.println("exception handled in m");}  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   ThrowsDemo obj=new ThrowsDemo();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
