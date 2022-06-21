package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a new text file
		File f = new File("/Users/vatsalpatel/Desktop/Testing/Temp");
		f.createNewFile();
		
		//Write into text file
		FileWriter fw = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fw);
		out.write("This is 1st line");
		out.newLine();
		out.write("This is 2nd line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4th line");
		out.newLine();
		out.write("This is 5th line");
		out.newLine();
		out.flush();
		
		//Read from the text file
		FileReader fr = new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
        String x;
		int i = 0;
		
		while ((x = rd.readLine()) !=null) {
			System.out.println(x);
			i++;
		}
		
		System.out.println("Total number of lines: " + i);

	}

}
