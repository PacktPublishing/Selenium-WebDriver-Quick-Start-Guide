public class DynamicText1 {
 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver",
     "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("http://www.freecrm.com");
     String dynamicXpath = "//*[@id='loginForm']";
     List<WebElement> elem = driver.findElements(By.xpath(dynamicXpath));
     List<WebElement> elem1 = elem.get(0).findElements(By.tagName("input"));
     System.out.println("no of elements: " + elem1.size());
    }
}
