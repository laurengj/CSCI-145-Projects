package chapter5;

import java.util.Scanner;


// This class will use the switch statement to count letter grades.
public class LetterGrades {
	public static void main(String[] args) {
		int total = 0;  // sum of grades
		int gradeCounter = 0;  // number of grades entered
		int aCount = 0;  // count of A grades
		int bCount = 0;  // count of B grades
		int cCount = 0;  // count of C grades
		int dCount = 0;  // count of D grades
		int fCount = 0;  // count of F grades
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input.",
				"On UNIX/Linux/macOS type <Ctrl> d, then press Enter.",
				"On Windows type <Ctrl> z, then press Enter.");
		
		
		// Loop until the user enters the end-of-file indicator.
		while (input.hasNext()) {
			int grade = input.nextInt();  // read the grade
			total += grade;  // add grade to the total
			++gradeCounter;  // increment the number of grades
			
			
		// Increment appropriate letter-grade counter.
		int choice = grade/10;
			switch (choice)  {
		case 9:  // grade between 90 and 100
		case 10:  // grade of 100
			++aCount;
			break;  // exits switch
		case 8:  // grade between 80 and 89
			++bCount;
			break;  // exits switch
		case 7:  // grade was between 70 and 79
			++cCount;
			break;  // exits switch
		case 6:  // grade between 60 and 69
			++dCount;
			break;  // exits switch
		default:  // grade less than 60
			++fCount;
			break;  // optional, exits switch anyway
			
			
	}
}

		// Display the grade report.
		System.out.printf("%nGrade Report:%n");
		input.close();
		
		// If user entered at least one grade...
		if (gradeCounter != 0) {
			// calculate average of all the entered grades
			double average = (double) total / gradeCounter;
			
			
			// Ouput summary of the results.
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Number of students who received each grade:",
					"A:  ", aCount,  // display number of A grades
					"B:  ", bCount,  // display number of B grades
					"C:  ", cCount,  // display number of C grades
					"D:  ", dCount,  // display number of D grades
					"F:  ", fCount);  // display number of F grades
		}
		
	}

}
