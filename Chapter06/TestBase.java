public class TestBase {
	public static WebDriver driver = null;
	protected static Logger log = null;
	protected static Utilities util = null;
	protected static Actions actions = null;
	protected static JavascriptExecutor js = null;
	protected static WebDriverWait wdWait = null;
	static String reportFileName = null;
	protected static Map<String, String> resultMap = new HashMap<String, String>();
	protected static Fillo fillo = null;
	protected static Recordset recordSet = null;
	protected static Connection connection = null;
	protected static ExtentReports extentReport;
	protected static ExtentTest extentTest;
	private static Object tempElement;
	private static String firstXPath = "//*[text()='";
	private static String lastXPath = "']";
	private static Boolean ajaxIsComplete;
	private static JavascriptExecutor jse;

	public TestBase() throws IOException, FilloException {
	}

	public static void sendKeys(WebElement element, String text) {
    try {
            wdWait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(text);
    } catch (NoSuchElementException e){
        throw new NoSuchElementException();
    }
	}


	public static void sendKeysTAB(WebElement element, Keys text) {
		element.sendKeys(text);
	}

	public static void clickElement(WebElement element) {
		wdWait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static void selectDrpdwnData(WebElement element, String drpdwnData) {
		new Select(element).selectByVisibleText(drpdwnData);
	}

	public static void selectDrpdwnDataByText(WebElement element,
			String drpdwnData) {
		List<WebElement> optionList = new Select(element).getOptions();
		for (WebElement options : optionList) {
			if (options.getText().equalsIgnoreCase(drpdwnData)) {
				options.click();
			}
		}
	}

	public static void selectDrpdwnDataByText2(WebElement element,
			String drpdwnData) {
		List<WebElement> optionList = new Select(element).getOptions();
		for (WebElement options : optionList) {
			if (options.getText().equalsIgnoreCase(drpdwnData)) {
				options.click();
			}
		}
	}

	public static void selectDrpdwnDataByIndex(WebElement element,
			String drpdwnData) {
		List<WebElement> optionList = new Select(element).getOptions();
		actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		for (WebElement options : optionList) {
			options.click();
		}
		actions.keyUp(Keys.CONTROL);
	}

	public static void doubleClickElement(WebDriver driver, WebElement element)
			throws InterruptedException {
		scrollintoviewJS(element);
		System.out.println(element.getText());
		Actions action1 = new Actions(driver).doubleClick(element);
		action1.build().perform();
	}

	public static void rightClickElement(WebDriver driver, WebElement element) {
		actions = new Actions(driver);
		actions.contextClick(element).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
				.perform();
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		actions = new Actions(driver).moveToElement(element);
		actions.build().perform();
	}

	public static void setValueJS(String element, String text) {
		String jsscript1 = "document.getElementsByName('" + element
				+ "')[0].value='" + text + "';";
		js.executeScript(jsscript1);
	}

	public static void enableTextBoxJS(String element) {
		String jsscript1 = "document.getElementsByClassName('" + element
				+ "')[0].enabled='true';";
		System.out.println(jsscript1);
		js.executeScript(jsscript1);
	}

	public static void enterTextBoxValueJS(String element, String value) {
		String jsscript1 = "document.getElementsByClassName('" + element
				+ "')[0].value='" + value + "';";
		System.out.println(jsscript1);
		js.executeScript(jsscript1);
	}

	public static void clickElementJS(WebElement element) {
		String jsscript1 = "arguments[0].click();";
		js.executeScript(jsscript1, element);
	}

	public static void scrollintoviewJS(WebElement element) {
		String jsscript1 = "arguments[0].scrollIntoView(false);";
		js.executeScript(jsscript1, element);
	}

	public static List<WebElement> createWebElement(String textFill)
			throws IOException {
		tempElement = driver.findElements(By.xpath(firstXPath + textFill
				+ lastXPath));
		return (List<WebElement>) tempElement;
	}

	public static boolean docState() {
		boolean docReady = ((JavascriptExecutor) driver)
				.executeScript("return document.readyState").toString()
				.equals("complete");
		return docReady;
	}

	public static boolean ajaxState() {
		int counter = 0;
		while (counter < 10) {
			ajaxIsComplete = (Boolean) ((JavascriptExecutor) driver)
					.executeScript("return jQuery.active == 0");
			if (ajaxIsComplete) {
				break;
			} else {
				counter = counter + 1;
			}
		}
		return ajaxIsComplete;
	}

	public static void executeFocus(String elementID) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('" + elementID
				+ "').focus();");
	}

	public static void setStyleVisibility(String id) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('" + id
				+ "').style.visibility = 'visible';");

	}

	public static void setStyleVisibilityByidBlock(String id) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('" + id
				+ "').style.display='block';");
	}

	public static void setStyleVisibilityBynameBlock(String name) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByName('" + name
				+ "')[0].style.display='block';");
	}
