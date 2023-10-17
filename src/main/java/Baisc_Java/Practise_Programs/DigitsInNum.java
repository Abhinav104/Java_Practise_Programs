package Baisc_Java.Practise_Programs;

import java.util.Scanner;

public class DigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = 0;
		
		
		while (num>0) {
			num=num/10;
			counter++;
		}
		
		System.out.println("The counter is "+counter);

	}

}
