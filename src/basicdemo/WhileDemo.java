package basicdemo;

public class WhileDemo {

	public static void main(String[] args) {
		int n=1;
		System.out.println("odd   even");
		System.out.println("---   ----");
		while(n<=10)
		{ 	if(n%2!=0)
				System.out.print(n+"   ");
		    else
		    	System.out.println(n);
			n++;
		}
	}

}
