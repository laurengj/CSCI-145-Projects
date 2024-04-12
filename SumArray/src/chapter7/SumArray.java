package chapter7;

public class SumArray {

	public static void main(String[] args) {
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		int average = 0;
		
		// add each element's value to total
		for (int counter = 0; counter < array.length; counter++) {
			total += array[counter];
		
		}
		
		average = total/array.length;
		
		// System.out.printf("Total of array elements: %d%n", total);
		System.out.printf("The average of the array elements: %d%n", average);
	}

}
