System.setProperty("webdriver.chrome.driver",
"C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("C:\\FramesDemo.html");
 Thread.sleep(5000);
 driver.switchTo().frame(0);
 System.out.println(driver.findElement(By.tagName("body")).getText());
 driver.findElement(By.id("radio1")).click();
 driver.switchTo().defaultContent();
 driver.switchTo().frame("frame2");
 driver.findElement(By.id("input1")).sendKeys("input box");
 driver.switchTo().defaultContent();
 driver.switchTo().frame("frame3");
 driver.findElement(By.id("chk1")).click();
