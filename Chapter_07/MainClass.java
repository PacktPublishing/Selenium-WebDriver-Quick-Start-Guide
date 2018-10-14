public class MainClass {
	public static void main(String[] args) throws IOException, FilloException {
		WebDriver driver = null;
		List<String> browsers = new ArrayList<String>();
		browsers.add("chrome");
		System.setProperty("webdriver.chrome.driver",
				"src/main/resources/chromedriver.exe");
		AActionKeyword actKeyword = new OpenBrowser();
		ACommand command = new NewBrowser(actKeyword);
		BrowserInvoker invoker = new BrowserInvoker(command);
		driver = invoker.open(browsers);

	}

}
