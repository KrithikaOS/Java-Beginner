
public class RectangleInterface implements Drawable,Drawable2{
	public void draw(){System.out.println("drawing rectangle");}  
	public void msg(){System.out.println("default method inside class");} //overrides the vmsg() method in java
	static int cube(int x){return x*x;}  
}

