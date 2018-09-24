@Listeners(org.packt.listeners.SampleListener1.class)
public class ListenerClass {
 @Test
 public void checkListeners() {
     System.setProperty("webdriver.chrome.driver",
     System.getProperty("user.dir")
         + "\\src\\main\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.freecrm.com");
     System.out.println("Title is : " + driver.getTitle());
     Assert.assertEquals(driver.getTitle(),
         "#1 Free CRM software in the cloud for sales and service");
 }
}
