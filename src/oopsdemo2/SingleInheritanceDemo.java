package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"sandeep","JDBC");
		Developer d2=new Developer(102,"John","spring");
		d1.display();
		d1.print();
		d2.display();
		d2.print();

	}

}
