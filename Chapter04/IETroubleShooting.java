System.setProperty("webdriver.ie.driver",
 "C:\\IEDriverServer_Win32_2.35.3\\IEDriverServer.exe");
 DesiredCapabilities ieCapabilities =
 DesiredCapabilities.internetExplorer();
 ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_
 FLAKINE
 SS_BY_IGNORING_SECURITY_DOMAINS,
 true);
 WebDriver driver = new InternetExplorerDriver(ieCapabilities);
 driver.get("http://www.google.com");
