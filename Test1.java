package day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "temp1.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(filename);
			
			BufferedWriter bw = new BufferedWriter(fileWriter);
			
			bw.write("Hello there,");
			bw.write(" here is some text.");
			bw.newLine();
			bw.write("We are writing");
			bw.write(" the text to the file.");
			
			bw.close();
		}
		catch(IOException ex) {
			
			System.out.println("Error writing to the file '" + filename + "'");
		}
	}

}
