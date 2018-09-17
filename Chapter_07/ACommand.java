public class ACommand implements ICommand {
        @Override
        public void execute(String x) {
        }
        @Override
        public WebDriver execute() {
                return driver;
        }
        @Override
        public void execute(WebDriver driver, String x) {
        }
        @Override
        public void execute(WebElement element, String x) {
        }
}
