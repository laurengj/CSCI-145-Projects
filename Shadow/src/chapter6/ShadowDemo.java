package chapter6;

// The purpose of this class is to create an object of type Shadow
// then, use it to call the only method in the Shadow class

public class ShadowDemo {

	public static void main(String[] args) {
		// create an object of type Shadow
		Shadow myShadow = new Shadow();
		
		// use it to call the only method in the Shadow class
		myShadow.shadowMethod(5.9, "Pink");
		
		System.out.println();
		// use the same object to call the other method
		myShadow.useField();
	}
	
}
