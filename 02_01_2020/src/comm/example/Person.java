package comm.example;

public class Person {
private String name;
private Address address;
private int age;
public Person()
{
	this("John" , 40);
	System.out.println("default");
	
}
	
	public Person (String name)
	{
		this("abs", 250);
		
		
	}
	public Person (String name , int age)
	{
		
		System.out.println(name + age);
	}
	public Person (String name , int age , Address adress)
	{
		
		
	}
	
	
	public static void main(String[] args) {
		 
		Person p = new Person();
		
	}
}
