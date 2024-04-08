package chapter5;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// 
		System.out.println("Welcome to the ATM!");
		System.out.println();
		System.out.println("Please Select An Option:");
		System.out.println();
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");

		
		// take user input for options
		Scanner input = new Scanner(System.in);
		
	
		int balance = 100;
		int choice = input.nextInt();
		while (choice < 1 || choice > 2) {
			System.out.println();
			System.out.println("Error: Invalid input. Please choose a number from the options list.");
			choice = input.nextInt();
		} 
		
		switch (choice) {
		case 1:
			System.out.println();
			System.out.println("Enter the amount to deposit:");
			double amtD = input.nextDouble();
			System.out.println();
			System.out.println("Your deposit amount of $" + amtD +  " was successful.\n" + "Your balance is now: $" + (balance + amtD));
			break;
		case 2:
			System.out.println();
			System.out.println("Enter the amount to withdraw:");
			double amtW = input.nextDouble();
			System.out.println();
			System.out.println("Your withdraw amount of $" + amtW + " was successful.\n" + "Your balance is now: $" + (balance - amtW));
			break;
		default:
			System.out.println();
			System.out.println("Error: Invalid input. Please choose a number from the options list.");
		
		}
	}

}
