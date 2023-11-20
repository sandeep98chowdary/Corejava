package oopsdemo;

public class Trainee {
	
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		id=0;
		name=this.tech=null;
		stipend=0.00;	
		
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
	
	
}
