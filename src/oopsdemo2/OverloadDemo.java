package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add();
		a1.add(2.2, 4.2);
		a1.add(4, 2);
		a1.add("hello", "hello");
		a1.add(12, 31, 43);

	}

}
