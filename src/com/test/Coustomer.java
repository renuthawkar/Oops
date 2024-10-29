package com.test;

interface Sim {  //here we caan achive abstraction

	public abstract void call();

	public abstract void sms();

}

class Airtel implements Sim { //inheritance ,interface,incapsu,polymorphism

	@Override
	public void call() {

		System.out.println("calling using airtel call");

	}

	@Override
	public void sms() {
		System.out.println("sending msg using airtel sms");

	}

}
class Mobile{ //loose coupling 
	
	void insertsim(Sim sim) {
		sim.call();
		sim.sms();
		
	}
	
	
}

public class Coustomer { //calling and exsicution of progrm

	public static void main(String[] args) {
		
		Mobile iphone = new Mobile();
		iphone.insertsim(new Airtel());
				

	}
}
