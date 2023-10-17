package Baisc_Java.Practise_Programs;

import java.util.Scanner;

public class RevNumStrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev_num = sb.reverse();
		System.out.println("Reversed number is:"+rev_num);

	}

}
