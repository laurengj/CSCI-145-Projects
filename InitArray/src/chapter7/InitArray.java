package chapter7;

public class InitArray {
	public static void main(String[] args) {
		
		// define an Array hat can hold 10 integers
		// the [] is the indicator of an Array
		// the name of the following is myIntegers
		int [] myIntegers = new int[10];
		
		// define an Array that can hold 7 doubles
		double [] myDoubles = new double[7];
		
		// every Array has a length/capacity - now show
		// the lengths of the two Arrays above
		System.out.println("The length of myIntegers is: " + myIntegers.length + ".");
		System.out.println("The length of myDoubles is: " + myDoubles.length + ".");
		System.out.println();
		
		// how to access numbers inside an Array
		System.out.println("The first number in an Array has index 0, then 1, then 2, etc...");
		System.out.println("The first integer in myIntegers is: " + myIntegers[0] + ".");
		System.out.println("The first double in myDoubles is: " + myDoubles[0] + ".");
		System.out.println();
		
		// next, initialize myIntegers
		
		/* - not so efficient, but works
		myIntegers [0] = 95;
		myIntegers [1] = 55;
		myIntegers [2] = 15;
		*/
		
		// second way to initialize an Array
		int [] myIntegers1 = {195, 155, 115};
		//double [] myDoubles1 = {90.5, 52.6, 79.1};
		
		// the third way to initialize an Array
		for(int index = 0; index < myDoubles.length; index++) {
			myDoubles[index] = 3.14;
		}
		
		// display the numbers in myIntegers1
		System.out.println("The numbers in myIntegers 1 are: ");
		for(int index = 0; index < myIntegers1.length; index++) {
			System.out.println(myIntegers1[index]);
			
		}
		
		// display the numbers in myDoubles
		System.out.println("The numbers in myDoubles are: ");
		for(int index = 0; index < myDoubles.length; index++) {
			System.out.println(myDoubles[index]);
			
		}
		
	}

}
