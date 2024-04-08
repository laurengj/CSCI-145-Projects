package chapter3;

public class Account {
	
	private String name; // instance variable
	private double balance; // instance variable

	// Account constructor that receives two parameters
	public Account(String name) {
		this.name = name; // assign name to instance variable name
	}
		
		
	public double getBalance() {
		return balance;
	}
	
		// validate that the balance is greater than 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) { // if the balance is valid
			this.balance = balance; // assign it to instance variable balance
		}
	
		
	
	// define a constructor that initializes the
	// instance variable: name with parameter name

	
	public Account(String name) {
		this.name = name;
	}
	
	
	// method to retrieve the name from the object
	public String getName() {
		return name; // return the value of name to caller
	}
		
	// method to set the name in the object
	public void setName(String name) {
		this.name = name; // store the name
	}
}
