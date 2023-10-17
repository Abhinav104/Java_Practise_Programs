package Baisc_Java.Practise_Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rev = "";
		System.out.println("Enter the string : ");
		String str = sc.next();
		String org_str = str;
		int str_len=str.length();
		for(int i=str_len-1; i>=0; i--) {
				rev = rev+str.charAt(i);
		}
		
		System.out.println("The reversed string is "+rev);
		
		if (org_str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}			

	}

}
