
public interface Drawable {
	void draw();  
	default void msg(){System.out.println("default method inside drawable");}  
	static int cube(int x){return x*x*x;}  
}
