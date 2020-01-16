
public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		s=" Hello ";
		String s2=s.intern(); //A pool of strings, initially empty, is maintained privately by the class String.
//When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned. 
		System.out.println(s2);
		String replaceString=s.replace("Hello","Hithere");
		System.out.println(replaceString); 
		System.out.println(s.toUpperCase());//HELLO
		System.out.println(s.toLowerCase());//hello
		System.out.println(s);
		System.out.println(s.trim());//removes spaces at the beginning and the end
		System.out.println(s.startsWith("Sa"));//false
		System.out.println(s.endsWith("o "));//true
		System.out.println(s.charAt(3));// l
		System.out.println(s.length());//7 including spaces
		int a=10;  
		String s1=String.valueOf(a);  //The string valueOf() method converts given type such as int, long, float, double, boolean, char and char array into string.
		System.out.println(s1+20);  

	}

}
