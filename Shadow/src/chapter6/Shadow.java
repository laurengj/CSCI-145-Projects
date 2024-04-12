package chapter6;

public class Shadow {
	
	double length = 100.0;  // length is a field, i.e., instance variable
	String color = "";  // color is a field, i.e., instance variable
	
	public void shadowMethod(double length, String color) {
		// the parameter length in the parenthesis shadows the field length
		// the parameter color in the parenthesis shadows the field color
		
		length = 10.5;
		color = "Black";
		
		System.out.println("The value of parameter length is: " + length);
		System.out.println("The value of parameter color is: " + color);
		
	}

	// now, we want to use the field: length
	public void useField() {
		
		System.out.println("The value of field length is: " + length);
		
	}

}
