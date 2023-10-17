package Baisc_Java.Practise_Programs;

public class TotalCharcInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Sen = "Hello World";
		int count = 0;
		
		for(int i=0; i<=Sen.length()-1; i++) { 
			char c = Sen.charAt(i);
			
			if(c != ' ') {
				count ++;
			}	
		}
		System.out.println("Character count excluding space "+count);

	}

}
