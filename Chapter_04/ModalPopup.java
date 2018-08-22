System.setProperty("webdriver.chrome.driver",
 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 // driver.manage().window().maximize();
 driver.navigate().to(
 "C:\\Users\\pinakin.chaubal\\Desktop\\ModalPopup.html");
 Thread.sleep(5000);
driver.findElement(By.id("myBtn")).click();
Thread.sleep(5000);
System.out.println(driver.findElement(By.tagName("body")).getText());
driver.findElement(By.id("userid")).sendKeys("testuser");
driver.findElement(By.id("password")).sendKeys("testpass");
