package OopsConcept;


public class CallNonStaticVariableInStaticMethod {
	
	int nonStaticVariable = 5;
	
	public static void staticMethod() {
        // Attempting to access nonStaticVar directly from a static method will result in a compilation error
        // Uncommenting the line below would cause an error.
//		System.out.println(nonStaticVariable);
		System.out.println("I am in static method");
	}
	
	public static void main(String args[]) {
        // Now, you can access the non-static variable through the instance
		CallNonStaticVariableInStaticMethod obj =new CallNonStaticVariableInStaticMethod();
		System.out.println(obj.nonStaticVariable);
		// You can also call the static method
		staticMethod();
		

	}

}
