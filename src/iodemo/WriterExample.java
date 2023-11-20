package iodemo;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		String content="She was more like a  beauty queen";
		try {
			Writer w=new FileWriter("c:/Demo/data.txt");
			w.write(content);
			System.out.println("Data written to file");
			w.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
