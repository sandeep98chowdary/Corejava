package oopsdemo;
/*
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance of a given class is created. 
 */
public class ConstructorDemo {
	
	int id;
	String name;
	
	ConstructorDemo(){//implicit constructor 
		System.out.println("This is an implicit constructor");
	}
	
	ConstructorDemo(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name);
	}
	public static void main(String[] args) {
		ConstructorDemo c1=new ConstructorDemo(); 
		ConstructorDemo c2=new ConstructorDemo(202,"sandeep");
		c2.display();
	}

}
