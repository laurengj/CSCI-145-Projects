package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
// import java.util.*; works as well, because Scanner is included in the util package.

public class GuessingGame {
	public static void main(String[] args) {
		// create a reference to a SecureRandom object
		SecureRandom randomNumberGenerator = new SecureRandom();
		
		// create a random number
		int number = randomNumberGenerator.nextInt(10000);
		
		// let the user guess a number until it is correct.
		// we need a Scanner object to allow users to input a guessing number -
		// then, we compare the guessing number to the randomly generated number.
		Scanner input = new Scanner(System.in);
		
		// collect the user input
		System.out.println("Enter a number (0-10,000):");
		int guessNumber = input.nextInt();
		
		while(true) { 
			if(guessNumber > number) {
				System.out.println("Your number is too high - try again.");
				guessNumber = input.nextInt();
			}
			
			else if (guessNumber < number) {
				System.out.println("Your number is too low - try again.");
				guessNumber = input.nextInt();
			}
			
			else {
				System.out.println("Correct! The number is " + number);
				break;
			}
		
		}
		

	}

}
