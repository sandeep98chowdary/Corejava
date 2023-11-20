package oopsdemo2;

public class Accountant extends Employee {
	
	String tech,task;
	public Accountant(int empId, String name, String t1, String t2) {
		super(empId, name);
		this.task=t1;
		this.tech=t2;
		// TODO Auto-generated constructor stub
	}
	
	void print() {
		System.out.println("Accountant Tasks:"+this.task);
		System.out.println("Accountant Tasks:"+this.tech);
	}

}
