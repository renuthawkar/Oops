package com.newdemo;

public class BankAccount {

	private double balance; // Private variable

	public void deposit(double amount) { // Public method
		if (amount > 0) {
			balance += amount;
		}
	}

	public double getBalance() { // Public method to access balance
		return balance;
	}

}

  abstract class Animal1 {
	abstract void makeSound(); // Abstract method, no implementation

	public void sleep() { // Concrete method
		System.out.println("The animal is sleeping.");
	}
}

  class Dog extends Animal1 {
	void makeSound() {
		System.out.println("Woof! Woof!");
	}
}
  
  class Animal {
	    public void makeSound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Meow");
	    }
	}

	 class TestPolymorphism {
	    public static void main(String[] args) {
	        Animal myAnimal = new Cat(); // Runtime polymorphism
	        myAnimal.makeSound(); // Output: Meow
	    }
	}
