package chapter9;

public class Circle extends Shape {
	
	// since Circle is subclass of the Shape class, it
	// automatically has the two protected attributes
	// of the Shape class
	
	public double radius = 0.0;  // attribute uniquely belongs to the Circle class
	
	// the default constructor
	public Circle() {
		// calls the default constructor in Shape class
		super();  // i.e., color = "white"; weight = 1.0;
		
	}
	
	// constructor with specified radius, weight, and color
	public Circle (String color, double weight, double radius) {
		// calls the constructor in Shape class
		super(color, weight);  // i.e., this.color = color; this.weight = weight;
		this.radius = radius;  // this is routine
	}
	
	// two overriding methods
	
	public double calculateArea() {
		// this implementation overrides that in class Shape
		System.out.println("Calculate Area in Circle class");
		System.out.println("-=-~~~***~~~--=-");
		return Math.PI * radius * radius;
	}
	
	public double calculatePerimeter() {
		// this implementation overrides that in class Shape
		return 2 * Math.PI * radius;	
	}
	
	
}
