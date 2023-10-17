package Serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.studentName = "Abhinav Pandey";
		s1.rollNo = 1312;
		
		String Fileloc = "C:\\Users\\hp\\Downloads\\serialization.txt";
		
		FileOutputStream fos = new FileOutputStream(Fileloc);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Object saved in a file");
		
		
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//			
//		}
//		
//		catch(IOException e) {
//			e.printStackTrace();
//			
//		}

	}

}
