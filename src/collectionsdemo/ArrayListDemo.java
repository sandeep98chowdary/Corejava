package collectionsdemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("sandeep");
		names.add("sandy")	;
		names.add("sandeep");
		names.add("sandeep");
		
		System.out.println(names);
		names.set(1, "chowdary");
		System.out.println(names);
		for(String i:names) {
			System.out.println(i);
		}
		
		ArrayList<double> marks= new ArrayList<double>();
		marks.add(22.11);
		marks.add(34.11);
		marks.add(533.11);
		marks.add(226.151);
		marks.add(232.1);
		System.out.println(marks);
		Collections.sort(marks);
	}

}
