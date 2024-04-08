package chapter2;


import java.util.Scanner;


import java.lang.Math;


public class ArithmeticOperations {

	
	public static void main(String[] args) {
		// get user input of a double
		// eight primitive types: byte, short, int, long, float, double, boolean, char
		
		Scanner input = new Scanner(System.in); // create a Scanner object
		
		// prompt the user for a double with a message
		System.out.println("Enter a double number: ");
		
		double d1 = input.nextDouble();
		
		
		System.out.println("Enter a double number: ");
		
		double d2 = input.nextDouble();
		
		// now practice Math class
		double sumD = d1 + d2;
		// output the sum
		System.out.println("The sum of \n" + d1 + " and " + d2 + " is: \n" + sumD);
		
		// calculate the power d1^d2
		double p = Math.pow(d1, d2);
		
		System.out.println("The power of \n" + d1 + "^" + d2 + " is: \n" + p);
		
		// now, there is the following code
		double p1 = 2 * Math.PI * d1; // the perimeter of the circle with radius d1
		System.out.println("The perimeter of the circle is " +p1);
		
		// display the area of the circle with radius d2: pi * d2^2
		double area = Math.PI * Math.pow(d2, 2);
		System.out.println("The area of the circle is " + area);
		

	}

}
