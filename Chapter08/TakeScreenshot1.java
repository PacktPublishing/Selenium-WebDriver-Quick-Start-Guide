public class TakeScreenShot {

  public static void main(String[] args) {

    // Open Firefox
    System.setProperty("webdriver.chrome.driver",
        System.getProperty("user.dir")
            + "\\src\\main\\resources\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    // Maximize the window
    driver.manage().window().maximize();

    // Pass the url
    driver.get("http://www.freecrm.com");

    Screenshot screenshot = new AShot().shootingStrategy(
        ShootingStrategies.viewportPasting(1000))
        .takeScreenshot(driver);
    try {
      ImageIO.write(screenshot.getImage(), "PNG",
          new File(System.getProperty("user.dir") + "//test.png"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
