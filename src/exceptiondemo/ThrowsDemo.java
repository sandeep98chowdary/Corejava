package exceptiondemo;

public class ThrowsDemo {
	private int num1,num2,result;
	
	public ThrowsDemo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void Div{
		result=num1/num2;
		System.out.println("the division is:"+result);
	}
	
	public static void main(String[] args) {
		
		ThrowsDemo t1=new ThrowsDemo(200,10);
		ThrowsDemo t2=new ThrowsDemo(200,0);
		t1.Div();
		t2.Div();
	}

}
