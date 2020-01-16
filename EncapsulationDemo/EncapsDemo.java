
public class EncapsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj1=new Encapsulation();
		obj1.setName("Krith");
		obj1.setAge(20);
		obj1.setMobileNo("1234567890");
		Encapsulation obj2=new Encapsulation();
		obj2.setName("Org");
		obj2.setAge(25);
		obj2.setMobileNo("0987654321");
		System.out.println("Person 1 Name-"+obj1.getName()+" Age-"+obj1.getAge()+" MobileNo-"+obj1.getMobileNo());
		System.out.println("Person 2 Name-"+obj2.getName()+" Age-"+obj2.getAge()+" MobileNo-"+obj2.getMobileNo());
		

	}

}
