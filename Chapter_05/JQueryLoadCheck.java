 System.setProperty("webdriver.chrome.driver",
 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://localhost:8080/spinnerDemo.html");
 driver.findElement(By.xpath("//*[@id='changecontent']")).click();
 Boolean isJqueryCallDone = false;
 while (true) {
     isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver)
                     .executeScript("return jQuery.active==0");
                 System.out.println("JQuery call in loop: " + isJqueryCallDone);
     if (isJqueryCallDone == true) {
         break;
     }
  }
 System.out.println("JQuery call done: " + isJqueryCallDone);
