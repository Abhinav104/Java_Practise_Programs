package Baisc_Java.Practise_Programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// We need two classes FileWriter to create file and BufferedWriter to write the stuff on txt file.
		
		FileWriter fw = new FileWriter("C:\\Users\\hp\\eclipse-workspace\\Practise_Programs\\TestScript.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Writing the test script 2");
		bw.close();
		System.out.println("Test Script is written on text file");

	}

}
