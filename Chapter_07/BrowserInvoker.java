public class BrowserInvoker {
	private ACommand aCommand = null;

	public BrowserInvoker(ACommand command) {
		this.aCommand = command;
	}

	public WebDriver open(List<String> browserName)
			throws MalformedURLException {
		WebDriver driver = aCommand.execute(browserName);
		return driver;
	}

}
