package chapter9;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		// play with objects of type Shape and Circle
		Shape myShape = new Shape();
		System.out.println("The area of myShape is: " + myShape.calculateArea());
		
		
		System.out.println();
		System.out.println();
		// update myShape
		myShape = new Circle();
		System.out.println("Now, the area of myShape is: " + myShape.calculateArea());
	}

}
