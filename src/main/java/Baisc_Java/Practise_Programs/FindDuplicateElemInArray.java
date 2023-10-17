package Baisc_Java.Practise_Programs;

import java.util.HashSet;

public class FindDuplicateElemInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","python","c++","java"};
		HashSet <String> hs = new HashSet<String>();
		
		for(String a:arr) {
			if(hs.add(a)==false) {
				System.out.println("Foud duplicate element in an array : "+a);
			}
		}
	}

}
