package Baisc_Java.Practise_Programs;

import java.util.Arrays;

public class RevSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org_str= "My name is Abhinav";
		String str_arry[] = org_str.split(" "); // splitting string into words and save to array
		System.out.println(Arrays.toString(str_arry)); // printing array content
		String rev_str ="";
//		String rev_word="";
		
		for(String word :str_arry)		
		{
//			System.out.println(word);
			String rev_word ="";
			
			for(int i=word.length()-1;i>=0;i--) 
			{
				
				rev_word = rev_word+word.charAt(i); // Adding each character of a word in a revword variable
//				System.out.println(rev_word);
			}
			rev_str = rev_str+rev_word+" ";	// putting space after each word
		}
		System.out.println(rev_str);

	}
	

}
