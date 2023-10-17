package Baisc_Java.Practise_Programs;

public class RemoveSpChInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "!@#$%My name is !@#*& Abhinav *&^@#$%";
		str = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str);
		

	}

}
