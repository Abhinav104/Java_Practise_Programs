package Baisc_Java.Practise_Programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org_num=num;
		
		//16461
		int rev = 0;
		while(num!=0) 
		{
			rev = rev*10 + num%10;
			num = num/10;
			System.out.println("The reversed number is :"+rev);
		}
		
		System.out.println("The reversed number is :"+rev);
		
		if(org_num==rev) {
			System.out.println("Palindrome Number");
		}
		
		else {
			System.out.println("Not Palindrome Number");
		}
	}
	
	
	
	

}
