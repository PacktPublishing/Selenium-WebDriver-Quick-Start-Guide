System.setProperty("webdriver.chrome.driver",
 "C:\\SeleniumWD\\src\\main\\resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.navigate().to("http://popuptest.com/goodpopups.html");
 try {
 Thread.sleep(5000);
 } catch (InterruptedException e) {
 // TODO Auto-generated catch block
     e.printStackTrace();
 }
driver.findElement(By.xpath("//*[text()='Good PopUp #1']")).click();
try {
        Thread.sleep(5000);
} catch (InterruptedException e) {
 // TODO Auto-generated catch block
     e.printStackTrace();
 }
Set openWindows = driver.getWindowHandles();
System.out.println("No of open windows: " + openWindows.size());
Iterator<String> it = openWindows.iterator();
String parent = it.next();
System.out.println("Parent Window: " + parent + " title: " + driver.getTitle());
String child = it.next();
System.out.println("Child Window:" + child + " title: "
 + driver.getTitle());
