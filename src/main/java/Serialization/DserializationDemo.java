package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String Fileloc = "C:\\Users\\hp\\Downloads\\serialization.txt";
		FileInputStream fis = new FileInputStream(Fileloc);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student obj = (Student)ois.readObject();
		System.out.println(obj.rollNo);
		System.out.println(obj.studentName);
		ois.close();
		fis.close();
		
		
		

	}

}
