
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello Java
		sb.replace(1,3,"Hi");  
		System.out.println(sb);//prints HHivaello Java 
		sb.delete(1,3);  
		System.out.println(sb);//prints Hvaello Java
		sb.reverse();  
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());//default 16  
		sb1.append("Hello");  
		System.out.println(sb1.capacity());//now 16  
		sb1.append("java is my favourite language");  
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 50
		

	}

}
