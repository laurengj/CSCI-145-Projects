// Compare integers using if statements, relational operators, and equality operators

package chapter2;

import java.util.Scanner; // import Scanner for class

public class Comparison {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first integer: "); // prompt user for first integer input
		int number1 = input.nextInt(); // read first number
		
		System.out.println("Enter the second integer: "); // prompt user for second integer input
		int number2 = input.nextInt(); // read second number
		
		// compare integers using equality operators
		if (number1 == number2)	{
			System.out.printf("%d == %d%n", number1, number2);
			System.out.println("We are here inside the body of the == if");
		}

		if (number1 != number2)	{
			System.out.printf("%d != %d%n", number1, number2);
			System.out.println("We are here inside the body of the != if");
		}
		
		
		// compare integers using relational operators
		if (number1 < number2)	{
			System.out.printf("%d < %d%n", number1, number2);
			System.out.println("We are here inside the body of the < if");
		}
		
		if (number1 > number2)	{
			System.out.printf("%d > %d%n", number1, number2);
			System.out.println("We are here inside the body of the > if");
		}
		
		if (number1 <= number2)	{
			System.out.printf("%d <= %d%n", number1, number2);
			System.out.println("We are here inside the body of the <= if");
		}
		
		if (number1 >= number2)	{
			System.out.printf("%d >= %d%n", number1, number2);
			System.out.println("We are here inside the body of the >= if");
		}
	} // end method main
} // end class Comparison
