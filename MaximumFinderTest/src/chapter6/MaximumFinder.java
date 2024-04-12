package chapter6;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args)  {
		// create Scanner for input from command window
		Scanner input = new Scanner(System.in);
		
		// prompt for and input three floating-point values
		System.out.print(
				"Enter three floating-point values separated by spaces:  ");
		double number1 = input.nextDouble(); // read first double
		double number2 = input.nextDouble(); // read second double
		double number3 = input.nextDouble(); // read third double
		
		// ^^ put these three numbers as the values of arguments
		// into the method maximum(x, y, z) to find the max.
		
		
		// determine the maximum value
		double result = maximum(number1, number2, number3);
		
		// display maximum value
		System.out.println("Maximum is:  " + result);
	}

	// returns the maximum of its three double parameters
	public static double maximum(double x, double y, double z)  {
		double maximumValue = x; // assume x is the largest to start
		
		/* 
		 
		return Math.max(x,  Math.max( y,  z ));
		
		*/
		
		
		// determine whether y is greater than maximumValue
		
		if (y > maximumValue) { // if the second double is bigger than the first...
			maximumValue = y;   // update the max to be the bigger one
		}
		
		
		// determine whether z is greater than maximumValue
		
		if (z > maximumValue) { // if the third double is bigger than the second...
			maximumValue = z;   // update the max to be the bigger one
		}
		
		return maximumValue;
		
		
	}
	
}
