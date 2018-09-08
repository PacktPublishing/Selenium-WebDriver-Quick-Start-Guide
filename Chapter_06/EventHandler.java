public class EventHandler implements WebDriverEventListener {
	public void afterChangeValueOf(WebElement elem, WebDriver driver) {
		System.out.println("inside method afterChangeValueOf on "
				+ elem.toString());
	}

	public void afterClickOn(WebElement elem, WebDriver driver) {
		System.out.println("inside method afterClickOn on " + elem.toString());
	}

	public void afterFindBy(By elem, WebElement arg1, WebDriver driver) {
		System.out.println("Find happened on " + elem.toString());
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Inside the after navigateback to "
				+ driver.getCurrentUrl());
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Inside the afterNavigateForward to "
				+ driver.getCurrentUrl());
	}

	public void afterNavigateTo(String str1, WebDriver driver) {
		System.out.println("Inside the afterNavigateTo to " + str1);
	}

	public void afterScript(String str1, WebDriver driver) {
		System.out.println("Inside the afterScript to, Script is " + str1);
	}

	public void beforeChangeValueOf(WebElement elem, WebDriver driver) {
		System.out.println("Inside the beforeChangeValueOf method");
	}

	public void beforeClickOn(WebElement elem, WebDriver driver) {
		System.out.println("About to click on the " + elem.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Just before beforeNavigateBack "
				+ driver.getCurrentUrl());
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Just before beforeNavigateForward "
				+ driver.getCurrentUrl());
	}

	public void beforeNavigateTo(String str1, WebDriver driver) {
		System.out.println("Just before beforeNavigateTo " + str1);
	}

	public void beforeScript(String str1, WebDriver driver) {
		System.out.println("Just before beforeScript " + str1);
	}

	public void onException(Throwable throwable1, WebDriver driver) {
		System.out.println("Exception occurred at " + throwable1.getMessage());
	}

	public void beforeFindBy(By by, WebElement elem, WebDriver driver) {
		System.out.println("Just before finding element " + by.toString());
	}

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub

	}
}
