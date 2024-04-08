package chapter4;

import java.util.Scanner; // import scanner for user input

public class Analysis {

	public static void main(String[] args) {
		// create Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		
		// initialize variables
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		
		// process 10 students with a counter-controlled while loop
		while (studentCounter <= 10) {
			// prompt user for input, obtain value
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			
			// if-else nested in the while statement
			if (result == 1) {
				++passes;
				// passes += 1;
				// passes++;
				// passes = passes + 1;
			}
			else {
				++failures;
				// failures += 1;
				// failures++;
				// failures = failures + 1;
			}
			
			
			// increment studentCounter to terminate the loop
			++studentCounter;
			// studentCounter += 1;
			// studentCounter++;
			//studentCounter = studentCounter + 1;
		}
		
		
		// termination phase; prepare and display the results
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		
		// determine whether 8 or more students passed
		if (passes > 8) {
			System.out.println("Bonus to instructor!");
		}

	}

}
