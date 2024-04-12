package chapter6;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// The right hand side creates an object of type SecureRandom
		// The left hand side is, randomNumbers is the name of this object.
		// More professionally, the reference to the object.
		SecureRandom randomNumbers = new SecureRandom();
		
		// loop 20 times
		for(int counter = 1; counter <= 20; counter++) {
			
			// it is the reference (object name) that calls a method
			int face = 1 + randomNumbers.nextInt(6);
			
			// display the face number
			System.out.printf("%d", face);
			
			// if counter is divisible by 5, start a new line
			if(counter % 5 == 0) {
				System.out.print(" ");
			}
		}

	}

}
