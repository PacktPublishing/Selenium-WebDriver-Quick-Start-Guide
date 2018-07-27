package org.packt.selenium;

import java.util.Arrays;
import java.util.List;

public class Fruits2 {
	public void test() {
		List<String> fruits = Arrays.asList("Apples", "Oranges", "Bananas",
				"Pears");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
	}
}
