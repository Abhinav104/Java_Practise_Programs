package OopsConcept;

interface InterfaceClass {
	
	public void abstractMethod();
	
	//creating method with keyword default
//	default void defaultMethods() { 
//		System.out.println("This is a default method");
//	}
	//need to update jre version for above code
	

}

class MyClass implements InterfaceClass{
	
	public void abstractMethod() {
		System.out.println("This is the abstract method");
	}
	
	// You can choose to override the defaultMethod if needed
	public void defaultMethod() {
		System.out.println("Overridden defaultMethod in MyClass.");
	}
}

class InterfaceWithNonAbstractMethod{
	
	public static void main(String args[]) {
		MyClass obj = new MyClass();
		obj.abstractMethod();
		obj.defaultMethod();
	}
}
