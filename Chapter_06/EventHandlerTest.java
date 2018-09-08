public class EventHandlerTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		eventDriver.get("https://www.google.com");
		WebElement element = eventDriver.findElement(By.id("lst-ib"));
		element.sendKeys("Selenium");

	}

}
