public class OpenBrowser extends AActionKeyword {
	static RemoteWebDriver driver;
	static DesiredCapabilities capabilities;

	public WebDriver openBrowser(List<String> browserName) {
		if (browserName.get(0).equalsIgnoreCase("chrome")) {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * System.getProperty("user.dir") +
			 * "\\src\\main\\resources\\chromedriver.exe");
			 */
			capabilities = DesiredCapabilities.chrome();
			try {
				driver = new RemoteWebDriver(new URL(
						"http://localhost:4444/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (browserName.get(0).equalsIgnoreCase("ie")) {
			/*
			 * System.setProperty("webdriver.ie.driver",
			 * System.getProperty("user.dir") +
			 * "\\src\\main\\resources\\IEDriverServer.exe");
			 */capabilities = DesiredCapabilities.internetExplorer();
			try {
				driver = new RemoteWebDriver(new URL(
						"http://localhost:4444/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (browserName.get(0).equalsIgnoreCase("firefox")) {
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * System.getProperty("user.dir") +
			 * "\\src\\main\\resources\\geckodriver.exe");
			 */
			capabilities = DesiredCapabilities.firefox();
			try {
				driver = new RemoteWebDriver(new URL(
						"http://localhost:4444/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return driver;
	}

}
