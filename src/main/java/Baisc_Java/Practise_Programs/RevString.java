package Baisc_Java.Practise_Programs;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name";
		String rev="";
		
		//Getting string length
		int str_len = str.length();
		
		System.out.println(str_len);
		
		for (int i=str_len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
			
		}
		
		System.out.println("The reverse String is: "+rev);
		

	}

}
