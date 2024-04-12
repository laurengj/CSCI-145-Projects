package chapter6;

public class StaticDemo {

	public static void main(String[] args) {
		// create an account object
		Account myCheckingAccount = new Account("Lauren Jackson", 1000);
		
		// show the balance 
		System.out.println(myCheckingAccount.toString());
		
		System.out.println("It is the end of the year. The bank gives me a bonus!");
		
		double finalMoney = myCheckingAccount.getBalance() + Account.bonus;
		

	}

}
