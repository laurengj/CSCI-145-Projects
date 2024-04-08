package chapter3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		int a = 0; // default value of int is 0
		double b = 0; // default value of double is 0.0
		System.out.println("Default value of int is: " + a);
		System.out.println("Default value of double is: " + b);
		
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		
		
		// create an Account object and assign it to myAccount
		Account myAccount = new Account();
		
		
		// create an Account object with name Stinkly
		Account Stinkly = new Account("Stinkly Name", 1000000);
		
		
		
		// display initial value of name (null)
		System.out.printf("Default name: %s%n%n", myAccount.getName());
		
		// display the default balance
		System.out.printf("Default balance: %s%n%n", myAccount.getBalance());
		
		
		System.out.printf("The name of Stinkly account: " + "%s%n%n", Stinkly.getName());
		

		
		
		
		//prompt for and read name
		System.out.println("Please enter the name:");
		
		String theName = input.nextLine(); // read a line of text
		
		myAccount.setName(theName); // put theName in myAccount
		
		System.out.printf("Now the name is: %s%n%n", myAccount.getName()); // outputs a blank line
		
		
		
		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is: %n%s%n",  myAccount.getName());

	}

}
