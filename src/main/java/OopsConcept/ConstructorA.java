package OopsConcept;

public class ConstructorA{
	
	//Constructor are special type of methods which have same name as a class
	//It is used when we want to initialize the instances(propertie) at the time of object creation 
	//With const. we don't need getDetail methods, example below
	//Const does not have return type
	
	String name = "";
	int marks = 0;
	
	//creating constructor and initializing name and marks
	
	public ConstructorA(String n, int m) {
		name = n;
		marks = m;
		
	}
	
	public void showDetails() {
		System.out.println("My name is "+name);
		System.out.println("My marks is "+marks);
	}
	
	public void showDetailstwo() {
		System.out.println("My name is "+name);
		System.out.println("My marks is "+marks);
	}
	
	

}
