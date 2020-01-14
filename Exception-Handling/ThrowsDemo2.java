//causes run time error
import java.io.*;  
class ThrowsDemo2{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }   
   public static void main(String args[])throws IOException{//if throws hadn't been declared here, compile error occurs  
     ThrowsDemo2 m=new ThrowsDemo2();  
     m.method();  
    System.out.println("normal flow.");  
  }  
} 