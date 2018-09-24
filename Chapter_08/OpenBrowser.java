public class OpenBrowser extends AActionKeyword {
    public OpenBrowser() throws IOException, FilloException {
         super();
         log = Logger.getLogger(OpenBrowser.class);
         PropertyConfigurator.configure("log4j.properties");
    }
    static RemoteWebDriver driver;
    static DesiredCapabilities capabilities;
    public WebDriver openBrowser(List<String> browserName) {
    if (browserName.get(0).equalsIgnoreCase("chrome")) {
         log.info("Executing openBrowser");
         System.setProperty("webdriver.chrome.driver",
         System.getProperty("user.dir")
             + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
     } else if (browserName.get(0).equalsIgnoreCase("ie")) {
         System.setProperty("webdriver.ie.driver",
             System.getProperty("user.dir")
                 + "\\src\\main\\resources\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
     } else if (browserName.get(0).equalsIgnoreCase("firefox")) {
         System.setProperty("webdriver.gecko.driver",
             System.getProperty("user.dir")
                 + "\\src\\main\\resources\\geckodriver.exe");
         driver = new FirefoxDriver();
     }
     return driver;
 }
}

