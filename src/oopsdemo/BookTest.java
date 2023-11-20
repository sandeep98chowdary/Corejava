package oopsdemo;

public class BookTest {
	public static void main(String args[]) {
		Book b1=new Book();
		b1.setBookId(201);
		b1.setBookName("sol");
		b1.setPublisher("Penguin");
		b1.setPrice(200);
		
		System.out.println(b1.getBookId()+b1.getBookName()+b1.getPrice()+b1.getPublisher());
		System.out.println(b1.toString());

	}
}
