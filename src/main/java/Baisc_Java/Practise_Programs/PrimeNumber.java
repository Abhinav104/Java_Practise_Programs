package Baisc_Java.Practise_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				counter++;
			}}
		
	if(counter==2) {
		System.out.println(num+" Is a Prime Number");
		}
		
	else {
		System.out.println("Is not a prime number");
		}
		

	}

}
