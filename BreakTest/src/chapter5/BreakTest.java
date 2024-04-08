package chapter5;

public class BreakTest {

	public static void main(String[] args) {
		int count; // control variable also used after loop terminates
		
		for (count = 1; count <= 10; count++) {
			if (count == 5) {
				continue; // terminates loop if count is 5
			}
			
			System.out.printf("%d ", count);
			System.out.println("I like fishing :-)");
		}
		
		System.out.printf("%nBroke out of loop at count = %d%n", count);
	}

}
