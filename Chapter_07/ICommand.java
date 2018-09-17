public interface ICommand {
        static WebDriver driver = null;
        public void execute(String x);
        public void execute(WebDriver driver, String x);
        public void execute(WebElement element, String x);
        public WebDriver execute();
}
