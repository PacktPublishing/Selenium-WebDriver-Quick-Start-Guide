package org.packt.selenium;

public class J81Demo {
	public static void main(String[] args) {
		LambdaTest blockofCodeA = () -> {
			System.out.println("Hello World");
		};
		blockofCodeA.demo();
	}
}

@FunctionalInterface
interface LambdaTest {
	void demo();

}
