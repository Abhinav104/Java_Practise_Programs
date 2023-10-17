package polymorphism;

//Poly means many and Morphism means form - Many forms
//2 Types- func overloading (compile time polymor) and func overriding(runtime polymor)
// func overloading (compile time polymor) - Same name but works differently.
// Rule 1- Every function should have some differentiating facetor like returntype, parameter
// If one function returntype is void then other function return type should not be void if parameters are same.
//If any of the condition does not match then it will give error while writing the code that why it is call runtime poly
//Always prefer to compile time polymor instead of runtime

class Student{
	
	public void printInfo(String name) {
		System.out.println("The name of student is "+name);
	}
	
	public void printInfo(int age) {
		System.out.println("The age of student is "+age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println("Student and age is "+name+ " " +age);
	}
}


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.printInfo(29);
		s1.printInfo("Abhinav");
		s1.printInfo("Ruchi", 20);

		
	}

}
