public class DynamicText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String variableData = "Google";
		String dynamicXpath = "//*[text()='" + variableData + "']";
		List<WebElement> elem = driver.findElements(By.xpath(dynamicXpath));
		System.out.println("no of elements: " + elem.size());

	}
}
