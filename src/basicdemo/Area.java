package basicdemo;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		float a,r;
		final float PI=3.14f;
		System.out.println("Enter radius of a circle:");
		r=s.nextFloat();
		a=PI*r*r;
		System.out.print("Area of the circle= ");
		System.out.format("%.2f",a);
		s.close();
	}

}
