package chapter4;

// This class will calculate powers of 3 to find the smallest power 
// equal to or greater than 100.
public class PowerOfThree {

	public static void main(String[] args) {
		
		int counter = 1;
		int product = 1; // variable to hold the power of 3
		while(product <= 100) { // as long as product is <= 100
			product = 3 * product; // update product to be 3 times the current product
			
			// show how the body of the loop works
			// System.out.println("Counter is: " + counter);
			System.out.println("counter = " + counter);
			System.out.println("The " + counter + "-th time in the body of the while loop.");
			System.out.println("The current product is " + product + ".\n");
			counter = counter + 1; // update counter
		}

		System.out.println("The smallest power of 3 greater than 100 is " + product + ".");
		
		
	}

}
