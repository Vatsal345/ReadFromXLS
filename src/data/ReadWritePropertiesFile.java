package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("/Users/vatsalpatel/Desktop/Testing/prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		System.out.println(prop.getProperty("incorrectemail"));
		
		String correctemail =prop. getProperty("correctemail");
		System.out.println(correctemail);
		
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("testing", "Automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("bug", "jira");
		System.out.println(prop.getProperty("bug"));
		
		FileOutputStream fo = new FileOutputStream("/Users/vatsalpatel/Desktop/Testing/prop.properties");
		prop.store(fo, "Adding to properties file");
		

	}

}
