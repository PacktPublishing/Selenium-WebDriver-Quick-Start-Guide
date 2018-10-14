	public WebDriver openBrowser(List<String> browserName)
			throws MalformedURLException {
		if (browserName.get(0).equalsIgnoreCase("chrome")) {
			log.info("Executing openBrowser");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\src\\main\\resources\\chromedriver.exe");

			// driver = new ChromeDriver();
			// capabilities.setBrowserName("chrome");
			try {
				driver = new RemoteWebDriver(new URL(
						"http://localhost:4444/wd/hub"),
						DesiredCapabilities.chrome());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (browserName.get(0).equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")
							+ "\\src\\main\\resources\\IEDriverServer.exe");

			// driver = new InternetExplorerDriver();
			capabilities.setBrowserName("IE");
			try {
				driver = new RemoteWebDriver(new URL(
						"http://localhost:4444/wd/hub"),
						DesiredCapabilities.internetExplorer());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (browserName.get(0).equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ "\\src\\main\\resources\\geckodriver.exe");
			// driver = new FirefoxDriver();
			driver = new RemoteWebDriver(
					new URL("http://localhost:4444/wd/hub"),
					DesiredCapabilities.firefox());
		}

		return driver;
	}

}
