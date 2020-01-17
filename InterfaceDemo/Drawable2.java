
public interface Drawable2 {
	void draw();  
	//default void msg(){System.out.println("default method inside drawable 2");}  //if a class implements 2 interfaces, therecant be duplicate default methods
	static int cube(int x){return x*x*x;}  
}
