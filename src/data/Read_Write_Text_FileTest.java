package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Text_FileTest {

	public static void main(String[] args) throws IOException {
		
		//creating
		File f = new File("C:\\testing\\temp.txt");
		f.createNewFile();
		
		// Write into the text file (there is a inbuild class filewriter & bufferedwriter)
		
		FileWriter w  = new FileWriter("C:\\testing\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("hello we are writing in a file");
		out.newLine();
		out.write("This is a new line 1");
		out.newLine();
		out.write("This is a new line 2");
		out.newLine();
		out.write("This is a new line 3");
		out.newLine();
		out.write("This is a new line 4");
		out.flush();
		
		//Read from text file
		FileReader r = new FileReader("C:\\testing\\temp.txt");
		BufferedReader rd = new BufferedReader(r);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
		/*
		 * int i=1; while(i<6) { System.out.println(rd.readLine()); i++; }
		 */
		
		String x;
		int j=0;
		while((x=rd.readLine())!=null) {
			System.out.println(x);
			j++;
		}
		
		System.out.println("Total no of line:"+j);
		
	}

}
