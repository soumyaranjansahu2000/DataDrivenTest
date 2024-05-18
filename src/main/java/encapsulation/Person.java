package encapsulation;

public class Person {
	
	
//	1. Write a Java program to create a class called Person 
//	with private instance variables name, age. and country.
//	 Provide public getter and setter methods 
//	 to access and modify these variables.(PersonTest)
	
	private String name = "Soumya";
	private int age = 25;
	private String country = "India";
			
	//Getters and setters 
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
public void disply() {
	System.out.println("The name is " + name);
	System.out.println("The age is " + age);
	System.out.println("The country is " + country);
}
public static void main(String[] args) {
	Person p1 = new Person();
	p1.disply();
}
}
