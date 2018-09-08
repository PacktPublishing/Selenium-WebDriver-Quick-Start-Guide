public class HoverDemo {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver",
             "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.navigate().to("https://jqueryui.com/tooltip/");
         driver.manage().window().maximize();
         Actions actions = new Actions(driver);
         driver.switchTo().frame(0);
         actions.moveToElement(driver.findElement(By.id("age"))).build()
                                         .perform();
         System.out.println("Attribute is: "
                         + driver.findElement(By.id("age")).getAttribute(
                                                     "aria-describedby"));
   }
}
