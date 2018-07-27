package org.packt.selenium;

interface Phone {
	void dial();

	default void text() {
		System.out.println("Texting a message");
	}
}
