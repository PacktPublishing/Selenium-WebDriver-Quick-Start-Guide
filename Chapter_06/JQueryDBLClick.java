public class JQueryDBLClick {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver",
             "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.navigate().to(
             "C:\\Users\\Bhagyashree\\Documents\\DoubleClick.html");
         Actions actions = new Actions(driver);
         actions.doubleClick(driver.findElement(By.tagName("h2"))).build()
                                                     .perform();
         System.out.println("Text in para: "
                             + driver.findElement(By.tagName("p")).getText());
    }
}
