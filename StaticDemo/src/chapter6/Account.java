package chapter6;

public class Account {

	String name = "";
	double balance = 0.0;
	
	double bonus = 0.0;
	
	
	public Account(String n, double b) {
		name = n;
		balance = b;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public String toString() {
		return "name is " + name + "\nbalance is: " + balance;
	}
	

}
