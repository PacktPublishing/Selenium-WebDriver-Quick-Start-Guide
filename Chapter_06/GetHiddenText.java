public class GetHiddenText {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver",
                 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.navigate().to(
                 "C:\\Users\\Bhagyashree\\Documents\\DoubleClick.html");
         driver.manage().window().maximize();
         JavascriptExecutor js = (JavascriptExecutor) driver;
         String txtPara = driver.findElement(By.id("txtPara"))
                                             .getAttribute("id");
         js.executeScript("document.getElementById('" + txtPara
                                         + "').style.display='block';");
 }
}
