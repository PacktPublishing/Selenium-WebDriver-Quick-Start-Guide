public class MainClass {
        public static void main(String[] args) throws InterruptedException {
                WebDriver driver = null;
                IActionKeyword actKeyword = new OpenBrowser();
                ICommand command = new NewBrowser(actKeyword);
                BrowserInvoker invoker = new BrowserInvoker(command);
                driver = invoker.open();
        }
}
