package chapter5;

public class AutoPolicyTest {

	public static void main(String[] args) {
		// create two AutoPolicy objects
		AutoPolicy policy1 = new AutoPolicy(11111111, "Jeep Renegade", "SC");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "NY");
		
		// display whether each policy is in a no-fault state
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	// method that displays whether an AutoPolicy is in a state with no-fault insurance
	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("Auto Policy: ");
		System.out.printf("Account #: %d%nCar: %s%nState %s %s a no-fault state.%n%n",
		policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}

}
