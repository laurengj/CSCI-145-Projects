package chapter7;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 1. make sure that Date class is working
		
		// 2. create an ArrayList object and name it "dates" to hold Date objects
		ArrayList<Date> dates = new ArrayList<Date>(); // 10 empty slots by default
		
		// 3. in the main class, create 1 Date object and put it in the list
		Date d1 = new Date(2024, 4, 8);
		dates.add(d1);
		
		// 4. show the size of the list (it should be 1)
		// System.out.println("The size is: " + dates.size());
		
		// 5. create 10 more Date objects and put them into the list
		Date d2 = new Date(2003, 9, 8);
		dates.add(d2);
		Date d3 = new Date(1999, 3, 13);
		dates.add(d3);
		Date d4 = new Date(1973, 8, 20);
		dates.add(d4);
		Date d5 = new Date(1974, 4, 16);
		dates.add(d5);
		Date d6 = new Date(2003, 11, 17);
		dates.add(d6);
		Date d7 = new Date(2023, 10, 26);
		dates.add(d7);
		Date d8 = new Date(2000, 1, 1);
		dates.add(d8);
		Date d9 = new Date(1981, 9, 1);
		dates.add(d9);
		Date d10 = new Date(2016, 2, 22);
		dates.add(d10);
		Date d11 = new Date(2023, 6, 4);
		// dates.add(d11);
		System.out.println("The size is: " + dates.size());
		

	}

}
