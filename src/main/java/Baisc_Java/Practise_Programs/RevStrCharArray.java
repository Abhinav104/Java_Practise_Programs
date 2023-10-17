package Baisc_Java.Practise_Programs;

public class RevStrCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCD";
		String rev_str = "";
		//Converting string to array
		char str_array[] = str.toCharArray();
		
		//Getting array length
		int str_array_len =str_array.length;
		
		//indexing is from 0 so using lenght-1
		
		for(int i=str_array_len-1; i>=0; i--)
		{
			rev_str = rev_str+str_array[i];
		}
		
		System.out.println("Reversed string is : "+rev_str);
		
	}

}
