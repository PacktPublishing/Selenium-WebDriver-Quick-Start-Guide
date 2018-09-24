public class TakeScreenShot {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        System.getProperty("user.dir")
            + "\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      FileUtils.copyFile(src, new File("C:/selenium/error.png"));
    }
    catch (IOException e) {
      System.out.println(e.getMessage());

    }
  }

}

