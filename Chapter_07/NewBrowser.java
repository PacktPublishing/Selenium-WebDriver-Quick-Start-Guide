public class NewBrowser extends ACommand {
        private IActionKeyword actionKeyword = null;
        static WebDriver driver;
        public NewBrowser(IActionKeyword actionKeyword) {
                this.actionKeyword = actionKeyword;
        }
        public WebDriver execute() {
                driver = actionKeyword.openBrowser();
                return driver;
        }
}
