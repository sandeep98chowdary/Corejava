package iodemo;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try {
		FileWriter writer=new FileWriter("c:/Demo/names.txt",true);
		BufferedWriter bwr= new BufferedWriter(writer);
		bwr.write("\n james");
		bwr.write("\n goslin");
		bwr.write("\n john");
		System.out.println("Data written successfully");
		bwr.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
}	
	
