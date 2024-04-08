package chapter5;

public class ForLoopPractice {

	public static void main(String[] args) {
		
	
		
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%,20.2s", "*");
			}
			System.out.println();
		}

	}

}
