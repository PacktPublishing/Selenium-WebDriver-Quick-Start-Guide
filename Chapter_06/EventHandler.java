public class EventHandler implements WebDriverEventListener {
 public void afterChangeValueOf(WebElement elem, WebDriver driver) {
 System.out.println("afterChangeValueOf has been invoked for "
 + elem.toString());
 }

 public void afterClickOn(WebElement elem, WebDriver driver) {
 System.out.println("afterClickOn has been invoked for " + elem.toString());
 }

 public void afterFindBy(By elem, WebElement arg1, WebDriver driver) {
 System.out.println("FindBy has been triggered for " + elem.toString());
 }

 public void afterNavigateBack(WebDriver driver) {
 System.out.println("afterNavigateBack has been triggered to go back to "
 + driver.getCurrentUrl());
 }

 public void afterNavigateForward(WebDriver driver) {
 System.out.println("afterNavigateForward has been triggered to go to "
 + driver.getCurrentUrl());
 }

 public void afterNavigateTo(String str1, WebDriver driver) {
 System.out.println("afterNavigateTo has been triggered for " + str1);
 }

 public void afterScript(String str1, WebDriver driver) {
 System.out.println("afterScript has been triggered for " + str1);
 }

 public void beforeChangeValueOf(WebElement elem, WebDriver driver) {
 System.out.println("beforeChangeValueOf has been triggered for web element");
 }

 public void beforeClickOn(WebElement elem, WebDriver driver) {
 System.out.println("Going to click on " + elem.toString());
 }

 public void beforeNavigateBack(WebDriver driver) {
 System.out.println("beforeNavigateBack has been triggered to go back to "
 + driver.getCurrentUrl());
 }

 public void beforeNavigateForward(WebDriver driver) {
 System.out.println("About to trigger beforeNavigateForward "
 + driver.getCurrentUrl());
 }

 public void beforeNavigateTo(String str1, WebDriver driver) {
 System.out.println("About to trigger beforeNavigateTo " + str1);
 }

 public void beforeScript(String str1, WebDriver driver) {
 System.out.println("About to trigger beforeScript " + str1);
 }

 public void onException(Throwable throwable1, WebDriver driver) {
 System.out.println("Exception " + throwable1.getMessage() + " has occurred");
 }

 public void beforeFindBy(By by, WebElement elem, WebDriver driver) {
 System.out.println("About to find element " + by.toString());
 }
}
