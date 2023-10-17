package Baisc_Java.Practise_Programs;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		System.out.println("Numbers before swapping "+a+" and"+b);
		
		//Logic 1st using 3rd variable
//		int temp = a;
//		a=b;
//		b=temp;
		
		//Logic 2nd: without using 3rd variable
//		a = a+b;
//		b= a-b;
//		a = a-b;
		
		//Logic 3rd: Using * and /
		a= a*b;
		b = a/b;
		a= a/b;
		
		
		System.out.println("Numbers after swapping "+a+" and"+b);
		
		
		

	}

}
