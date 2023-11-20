package oopsdemo3;

public class Rectangle implements Shape {
	
	private double width,length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
		
	}

	@Override
	public double getArea() {
		return this.length*this.width;
	}

}
