package chapter4;

import java.util.Scanner;


// This class will collect 10 student grades with user input and find the sum and average of them.
public class ClassAverage {
	public static void main(String[] args) {
		// get user input
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		
		// find total sum of grades
		while (gradeCounter <= 10) {
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		// calculate the average
		int average = total / 10;
		
		// display sum and average of student grades
		System.out.printf("%nTotal of all 10 grades is: %d%n", total);
		System.out.printf("Class average is: %d%n", average);

	}

}
