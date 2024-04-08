package chapter5;


// 
public class ForCounter {
	public static void main(String[] args) {
		// for statement header includes initialization, loop-continuation condition and increment
		
		
		int counter = 1;
		int x = 2;
		int y = 10;
		
		for (int j = x; j <=4 * x * y; j += y / x) {
			System.out.println(counter + ". The body of the for loop");
		}
		
		System.out.println("When the loop stops, " + "the value of the counter is: " + counter);
	} // end of main()
} // end of class
