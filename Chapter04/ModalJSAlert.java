System.setProperty("webdriver.chrome.driver",
 "D:\\workspace\\hdfc1\\src\\test\\testAutomation\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to(
 "C:\\modalalert.html");
 Thread.sleep(5000);
 driver.findElement(By.id("dispalert")).click();
 Thread.sleep(5000);
 Alert alert = driver.switchTo().alert();
 alert.accept();
 driver.findElement(By.id("text1")).sendKeys("Ok clicked");
 Thread.sleep(5000);
 driver.findElement(By.id("dispalert")).click();
 Thread.sleep(5000);
 driver.switchTo().alert();
 alert.dismiss();
 driver.findElement(By.id("text1")).clear();
 driver.findElement(By.id("text1")).sendKeys("Cancel clicked");
