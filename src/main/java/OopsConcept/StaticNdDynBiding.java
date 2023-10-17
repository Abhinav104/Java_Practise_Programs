package OopsConcept;


class A{

	public void details() {
		System.out.println("This is the detail method in class A");
	}
}

class B extends A{
	
	public void details() {
		System.out.println("This is the detail method in class B");
	}
}

public class StaticNdDynBiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating obj for class B
		//Left side of = is read by compiler and Right side is read by JVM
		//Below is the ex of Static binding[Compile time]
		B objB = new B();
		objB.details();
		
		//Ex of Dynamic Binding
		A objA = new B(); // Upcasting
		// Compiler will go to class A but created object of Class B then JVM at run time go to class B
		//Then calls details method.
		
		

	}

}
