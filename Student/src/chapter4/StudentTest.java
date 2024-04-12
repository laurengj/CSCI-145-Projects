package chapter4;

import chapter4.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student account1 = new Student("Sir Pickles", 85.4);
		Student account2 = new Student("Hotdog Man", 99.8);
		
		System.out.printf("%s's letter grade is: %s%n",
			account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
			account2.getName(), account2.getLetterGrade());
		
	}

}
