package Baisc_Java.Practise_Programs;

public class FreqofCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java Programming";
		int frequency = 0;
		char character = 'm';
		
		for(int i=0;i<str.length();i++) {
			
			if(character == str.charAt(i)) {
				frequency++;
			}
			
		}
		System.out.println("The ferency of character"+character+" ="+frequency);

	}

}
