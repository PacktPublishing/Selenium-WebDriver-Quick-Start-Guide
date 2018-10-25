public class BrowserFactory {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
