 System.setProperty("webdriver.chrome.driver",
 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
 driver.manage().window().maximize();
 driver.navigate().to("http://www.freecrm.com");
