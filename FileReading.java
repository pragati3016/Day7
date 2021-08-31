package day7;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileReader fileReader = new FileReader("output.txt");
			
			int character;
			
			while((character = fileReader.read()) != -1) {
				
				System.out.println((char) character);
			}
			fileReader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
