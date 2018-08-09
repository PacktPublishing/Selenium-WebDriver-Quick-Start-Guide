public class URLTest {
 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver",
         "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.freecrm.com");
     List<WebElement> inputBoxes = driver.findElements(By.tagName("input"));
     System.out.println("No of inputBoxes: " + inputBoxes.size());
 }
}
