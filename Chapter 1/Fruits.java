package org.packt.selenium;

import java.util.Arrays;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apples", "Oranges", "Bananas",
				"Pears");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

	}

}
