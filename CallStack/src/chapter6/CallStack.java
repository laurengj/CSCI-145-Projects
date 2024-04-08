package chapter6;

// Call stack is a stack structure for handling method calls in
// Java Program. It is operating systems related

public class CallStack {

	public static void main(String[] args) {
		// the main method is the first method to execute
		int a = 0;
		int b = 0;
		
		// inside this main method, call another method
		presidentWantsDeanToWork();
		System.out.println(" - End of the first method. - ");

	}
	
	static void presidentWantsDeanToWork() {
		
		double c = 90.5;
		double d = 5.6;
		double e = 1.2;
		
		System.out.println("President said, 'Dr. Dean, can you do this?'");
		System.out.println("'Yes, sir.'");
		
		// then the Dean let a Chairman of CS Department to do the job
		deanLetsChairmanDoTheWork();
		
		System.out.println(" - End of the second method. - ");
		
	}
	
	static void deanLetsChairmanDoTheWork() {
		
		double x = 3.14;
		double y = 2.71828;
		
		System.out.println("'Sure, I may need more information about what to do.'");
		System.out.println(" - End of the third method. - ");
	}

}
