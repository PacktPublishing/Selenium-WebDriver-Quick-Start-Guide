public interface IActionKeyword {
        WebDriver driver = null;
        public void clickElement(String x);
        public WebDriver navigate(WebDriver driver2, String url);
        public WebDriver openBrowser();
        public void sendKeys(WebElement elem, String textFill);
        public void selectValue();
}
