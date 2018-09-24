public class ByChainedDemo {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        System.getProperty("user.dir")
            + "\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("C:\\Users\\Bhagyashree\\Desktop\\Documents\\myHTML.html");
    driver.findElement(
        new ByChained(By.className("div1"), By.id("spn1"), By
            .name("testname"))).sendKeys("FirstTest");
  }
}
