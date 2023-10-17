package Baisc_Java.Practise_Programs;

public class test {

	public static void main(String[] args) {

		String s = "My name is Abhinav";
		String str_array[] = s.split(" ");
		String rev_sen = "";		
		
		for (String word : str_array) {
			
			String rev_word = "";
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				rev_word = rev_word + word.charAt(i);

			}
			
			rev_sen = rev_sen + rev_word+" ";
		}
		System.out.println(rev_sen);

		

	}
}