package org.packt.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
