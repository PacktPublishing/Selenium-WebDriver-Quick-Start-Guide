package org.packt.selenium;

interface Apps {
	void dial();

	default void text() {
		System.out.println("Texting a message");
	}

}

class PhoneImpl implements Apps {
	public void dial() {
		System.out.println("Dial a number");
	}
}

public class AppsDemo {
	public static void main(String[] args) {
		Apps phoneobj = new PhoneImpl();
		phoneobj.dial();
		phoneobj.text();

	}
}
