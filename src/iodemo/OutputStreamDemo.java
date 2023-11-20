package iodemo;
import java.io.*;
public class OutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/Demo/data1.txt"); 
			String text="its a sunny day";
			byte[] myBytes=text.getBytes();
			fos.write(myBytes);
			System.out.println("successfull written!");
			fos.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
