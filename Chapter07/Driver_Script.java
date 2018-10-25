public class Driver_Script {
	List<HashMap> input_data;
	private static String actionKeyword;
	private WebDriver driver;
	AActionKeyword actKeyword;
	ACommand command;
	BrowserInvoker invoker;
	private static String testcaseID;
	private static String inputData;

	@Test
	@Parameters({ "browserName" })
	public void Run_Framework(String browserName) throws IOException,
			FilloException {
		List<String> browsers = new ArrayList<String>();
		browsers.add(browserName);
		input_data = ExtractAllData.extractData(browserName);
		System.out.println("kya ha ?" + input_data.size());
		for (int i = 0; i < input_data.size(); i++) {
			String timestamp = new SimpleDateFormat("yyyyMMMddHHmmss")
					.format(new java.util.Date());

			System.out.println("Starting " + browserName + timestamp);
			actionKeyword = input_data.get(i).get("Keyword").toString();
			inputData = input_data.get(i).get("Data").toString();
			testcaseID = input_data.get(i).get("TestCaseID").toString();
			System.out.println("Action Keyword: " + actionKeyword);
			System.out.println("Action Data: " + inputData);

			switch (actionKeyword) {
			case "openbrowser":
				try {
					actKeyword = new OpenBrowser();
				} catch (IOException e) {
					throw new IOException();
				} catch (FilloException e) {
					throw new FilloException("Error has been found"
							+ e.getMessage());
				}
				command = new NewBrowser(actKeyword);
				invoker = new BrowserInvoker(command);
				driver = invoker.open(browsers);
				break;
			case "navigate":
				try {
					actKeyword = new OpenURL();
				} catch (IOException e) {
					throw new IOException();
				} catch (FilloException e) {
					throw new FilloException("Error has been found"
							+ e.getMessage());
				}
				command = new OpenURLCommand(actKeyword);
				NavigatorInvoker invoker1 = new NavigatorInvoker(command);
				driver = invoker1.navigate(driver, inputData);
				break;
			}
		}
	}
}
