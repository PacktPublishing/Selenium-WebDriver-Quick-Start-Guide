long startTime = 0L;
long endTime = 0L;
WebElement elem = null;
boolean status = false;
System.setProperty("webdriver.chrome.driver","C:\\SeleniumWD\\src\\main\\
    resources\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
Wait<WebDriver> wdWait = new FluentWait<WebDriver>(driver)
                             .withTimeout(30, TimeUnit.SECONDS)
                             .pollingEvery(1, TimeUnit.SECONDS)
                             .ignoring(NoSuchElementException.class);
driver.manage().window().maximize();
driver.navigate().to("C:\\Users\\Bhagyashree\\Desktop\\Documents\\Timer.html");
 wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//*[text()='Timer Start']"))).click();
 startTime = System.currentTimeMillis();
 try {
         elem = wdWait.until(new Function<WebDriver, WebElement>() {
             public WebElement apply(WebDriver driver) {
             WebElement text1 = driver.findElement(By
                             .xpath("//*[@id='demoText']"));
             String value = text1.getAttribute("innerHTML");
             if (value.equalsIgnoreCase("Silk Test")) {
                 return text1;
             } else {
                 System.out.println("Text on screen: " + value);
                 return null;
               }
           }
         });
 } catch (NoSuchElementException exception) {
         System.out.println(exception.getMessage());
   }
 if (elem.isDisplayed()) {
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
