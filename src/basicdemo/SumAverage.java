package basicdemo;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		int a,b,c,sum;
		float avg,marks;
		String name;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your name:");
		name=s.next();
		System.out.println("enter your marks:");
		marks=s.nextFloat();
		
		System.out.println("enter 3 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		sum=a+b+c;
		avg=(float)sum/3;
		
		System.out.println("Hello "+name+". you have scored "+marks+" marks.");
		System.out.println("sum of a, b, c ="+sum);
		System.out.println("the average of a,b,c="+avg);
		s.close();
	}

}
