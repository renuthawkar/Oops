package com.method.calling;

public class MethodCalling {

	// Public method
	public void publicMethod() {
		
		System.out.println("This is the public method.");

		// Calling the private method within the public method
		privateMethod();
	}

	// Private method
	private void privateMethod() {
		System.out.println("This is the private method.");
	}

	public static void main(String[] args) {
		// Create an instance of Example
		MethodCalling example = new MethodCalling();

		// Call the public method
		example.publicMethod();

		// Trying to call privateMethod directly would result in an error:
		// example.privateMethod(); // This would cause an error
	}
}
