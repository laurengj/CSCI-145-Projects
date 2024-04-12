package chapter9;

public class Shape {
	
	// two attributes
	
	protected String color;
	protected double weight;
	
	// default constructor
	
	public Shape() {
		color = "white";
		weight = 1.0;
	}

	// another constructor
	
	public Shape(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	
	// getters and setters
	
	protected String getColor() {
		return color;
	}
	
	protected void setColor(String color) {
		this.color = color;
	}
	
	protected double getWeight() {
		return weight;
	}
	
	protected void setWeight(double weight) {
		this.weight = weight;
	}
	
	// two methods to be overridden in subclasses of Shape
	
	public double calculateArea() {
		System.out.println("Calculate Area in Shape class");
		System.out.println("-=-~~~***~~~--=-");
		return 0.0;
	};
	
	public double calculatePerimeter() {
		System.out.println("Calculate Perimeter in Shape class");
		return 0.0;
	};

}
