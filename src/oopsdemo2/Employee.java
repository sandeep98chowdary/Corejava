package oopsdemo2;

public class Employee {

	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	void display() {
		System.out.println("************Employee details**************");
		System.out.println("Employee ID:"+this.empId);
		System.out.println("Employee Name:"+this.name);
	}
	
}
