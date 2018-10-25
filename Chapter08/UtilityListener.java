public class UtilityListener implements ITestListener, ISuiteListener,
 IInvokedMethodListener {
    // This will execute before the Suite start
    @Override
    public void onStart(ISuite arg0) {
        Reporter.log("About to start Suite execution" + arg0.getName(), true);
    }
    // This will execute when suite has finished
    @Override
    public void onFinish(ISuite arg0) {
        Reporter.log("About to exit executing Suite " + arg0.getName(), true);
    }
    // This will execute before start of Test
    public void onStart(ITestContext arg0) {
        Reporter.log("About to begin executing Test " + arg0.getName(), true);
    }
    // This will execute, once the Test is finished
    public void onFinish(ITestContext arg0) {
        Reporter.log("Completed executing test " + arg0.getName(), true);
    }
    // This will execute once the test passes
    public void onTestSuccess(ITestResult arg0) {
    // This calls the printTestResults method
        printTestResults(arg0);
    }
    // This will execute only on the event of fail
    public void onTestFailure(ITestResult arg0) {
        printTestResults(arg0);
    }
    public void onTestStart(ITestResult arg0) {
        System.out.println("The execution of the main test starts");
    }
    // This will execute only if any of the main test skipped
    public void onTestSkipped(ITestResult arg0) {
        printTestResults(arg0);
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }
