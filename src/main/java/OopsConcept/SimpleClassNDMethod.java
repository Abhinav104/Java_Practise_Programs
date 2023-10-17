package OopsConcept;

import java.util.Scanner;

public class SimpleClassNDMethod {
	
	String name ="";
	int marks = 0;
	
	// creating object of scanner class to take input from user
	Scanner sc = new Scanner(System.in);
	
	public void getDetails() {
		System.out.println("Enter student name ");
		name =sc.nextLine(); //For taking string input
		
		System.out.println("Enter marks ");
		marks = sc.nextInt(); //For taking integer input
		
	}
	
	public void showDetails() {
		System.out.println("My name is "+name);
		System.out.println("My marks is "+marks);
	}

}
