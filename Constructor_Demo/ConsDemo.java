class ConsDemo{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    ConsDemo(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display()
    {System.out.println(id+" "+name);}  
   
    public static void main(String args[])
    {  
    //creating objects and passing values  
    ConsDemo s1 = new ConsDemo(1,"Krith");  
    ConsDemo s2 = new ConsDemo(2,"Org");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  