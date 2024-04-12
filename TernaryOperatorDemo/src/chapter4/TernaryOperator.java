package chapter4;

public class TernaryOperator {

	public static void main(String[] args) {
		//
		boolean b = true; // here, b is of type boolean
		
		// try infinite loop
		while (b)	{
			System.out.println("waaaah");
			
			b = false;
		}
		
		
		
		double studentGrade = 90;
		System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
		

		
	}

}
