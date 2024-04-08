package chapter5;

// This class practices the do...while loop.
public class DoWhileTest {

	public static void main(String[] args) {
		
		// Initialization of the counter.
		int counter = 1;
		
		do {  // Beginning of the do...while loop.
			System.out.printf("%d  ", counter);  // Print the value of the counter.
			++counter;  // Increment of the counter.
		} while (counter <= 10);
		
		System.out.println();
		
		

	}

}
