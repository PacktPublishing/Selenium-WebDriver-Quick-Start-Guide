public class GetHiddenText {
    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
             userDirectory+"\\src\\main\\resources\\chromedriver.exe");
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(
             "C:\\Users\\Bhagyashree\\Documents\\DoubleClick.html");
        driver.manage().window().maximize();
        String txtPara = driver.findElement(By.id("txtPara"))
             .getAttribute("id");
        driver.executeScript("document.getElementById('" + txtPara
             + "').style.display='block';");
 }
}
