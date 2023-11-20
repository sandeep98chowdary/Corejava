package oopsdemo2;

public class Developer extends Employee {
	
	private String technology;
	public Developer(int empId, String name, String tech) {
		super(empId, name);
		this.technology=tech;
	}
    
	void print() {
		System.out.println("Tech stack:"+this.technology);
	}
	
}
