public class BrowserInvoker {
        private ICommand iCommand = null;
        public BrowserInvoker(ICommand iCommand) {
                this.iCommand = iCommand;
        }
        public WebDriver open() {
                WebDriver driver = iCommand.execute();
                return driver;
        }
}
