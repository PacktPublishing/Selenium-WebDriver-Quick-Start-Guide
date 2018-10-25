public abstract class ACommand {

	public void execute(String x) {
	}

	public void execute(WebDriver driver, String x) {
	}

	public void execute(WebElement element, String x) {
	}

	public WebDriver execute(List<String> x) throws MalformedURLException {
		return null;
	}

	public WebDriver execute() {
		return null;
	}

}
