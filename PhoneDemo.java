package org.packt.selenium;

interface Phone {
	int x = 0;

	void changeRingtone();

	static void text() {
		System.out.println("Texting");
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone.text();
	}
}