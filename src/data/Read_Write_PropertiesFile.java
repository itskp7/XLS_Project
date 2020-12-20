package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Read Properties file
		FileInputStream fs = new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String s = prop.getProperty("browser");
		System.out.println(s);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("environment"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("wrongEmail"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("town", "brampton");
		System.out.println(prop.getProperty("town"));
		
		FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties"); // this will add the text to the prop file bcz its only stored in the memory with 
		prop.store(fo, "Adding to properties file");                                 // the previous line or code
		
		

	}

}
