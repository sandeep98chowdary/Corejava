package iodemo;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("c:/Demo/names.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
			br.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
