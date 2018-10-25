long startTime = 0L;
long endTime = 0L;
boolean status = false;
System.setProperty("webdriver.chrome.driver",  "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 WebDriverWait wdWait = new WebDriverWait(driver, 12);
 driver.manage().window().maximize();
 driver.navigate().to( "C:\\Users\\Bhagyashree\\Desktop\\Documents\\Timer.html");
 wdWait.until( ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Timer Start']"))).click();
 startTime = System.currentTimeMillis();
 try {
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By
         .xpath("//*[text()='Silk Test']")));
     status = driver.findElement(By.xpath("//*[text()='Silk Test']"))
         .isDisplayed();
 } catch (NoSuchElementException exception) {
     System.out.println(exception.getMessage());
 }
 if (status) {
     System.out.println("Element is displayed");
 } else {
     System.out.println("Element is not displayed");
 }
 endTime = System.currentTimeMillis();
 timeDiff = endTime - startTime;
 timeDiff = timeDiff / 1000;
 System.out.println("Start Time: " + startTime);
 System.out.println("End Time: " + endTime);
 System.out.println("Difference in Time: " + timeDiff);
