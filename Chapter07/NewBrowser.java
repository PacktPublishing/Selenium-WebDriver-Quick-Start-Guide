public class NewBrowser extends ACommand {
	private AActionKeyword actionKeyword = null;
	static WebDriver driver;

	public NewBrowser(AActionKeyword actKeyword) {
		this.actionKeyword = actKeyword;
	}

	public WebDriver execute(List<String> browsers)
			throws MalformedURLException {
		driver = actionKeyword.openBrowser(browsers);
		return driver;
	}

}
