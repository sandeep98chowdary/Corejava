package basicdemo;

import java.util.Scanner;

public class GreatestOf2 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 2 NUmbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		if (a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
		
		scan.close();
	}

}
