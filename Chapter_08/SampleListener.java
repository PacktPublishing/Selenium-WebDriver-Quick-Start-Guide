public class SampleListener implements ITestListener {
     @Override
     public void onTestStart(ITestResult result) {
         System.out.println("The test that has started is: " + result.getName());
     }
     @Override
     public void onTestSuccess(ITestResult result) {
         System.out.println("The test that has passed is: " + result.getName());
     }
     @Override
     public void onTestFailure(ITestResult result) {
         System.out.println("The test that has failed is: " + result.getName());
     }
     @Override
     public void onTestSkipped(ITestResult result) {
         System.out.println("The test that has skipped is: " + result.getName());
     }
     @Override
     public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
     }
     @Override
     public void onStart(ITestContext context) {
     }
     @Override
     public void onFinish(ITestContext context) {
     }
}
