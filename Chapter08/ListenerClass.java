@Listeners(org.packt.listeners.SampleListener.class)
public class ListenerClass {
 @Test
 public void checkListeners() {
     System.setProperty(
         "webdriver.chrome.driver",
     System.setProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.freecrm.com");
     System.out.println("Title is : " + driver.getTitle());
 }
}
