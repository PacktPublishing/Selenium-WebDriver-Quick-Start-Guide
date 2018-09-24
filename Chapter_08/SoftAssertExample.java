public class SoftAssertExample {
     @Test
     public void checkListeners() {
         SoftAssert assertNew = new SoftAssert();
         System.setProperty("webdriver.chrome.driver",
         System.getProperty("user.dir")
             + "\\src\\main\\resources\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.freecrm.com");
         System.out.println("Title is : " + driver.getTitle());
             assertNew.assertEquals(driver.getTitle(),
                 "# Free CRM software in the cloud for sales and service");
         System.out.println("Assert has been executed");
    }
}
