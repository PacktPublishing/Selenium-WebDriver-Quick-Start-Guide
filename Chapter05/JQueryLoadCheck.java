 System.setProperty("webdriver.chrome.driver",
 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://localhost:8080/spinnerDemo.html");
 driver.findElement(By.xpath("//*[@id='changecontent']")).click();
 Boolean isJqueryCallDone = false;
 int counter = 0;
 while (counter < 10) {
     isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver)
                     .executeScript("return jQuery.active==0");
                 System.out.println("JQuery call in loop: " + isJqueryCallDone);
     if (isJqueryCallDone == true) {
         break;
     } else {
        counter++;
     }
  }
 System.out.println("JQuery call done: " + isJqueryCallDone);
