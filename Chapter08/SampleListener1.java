public class SampleListener1 extends TestListenerAdapter {
     public void onTestSuccess(ITestResult testResult) {
         System.out.println(testResult.getName() + " was a success");
     }
     public void onTestFailure(ITestResult testResult) {
         System.out.println(testResult.getName() + " was a failure");
     }
     public void onTestSkipped(ITestResult testResult) {
         System.out.println(testResult.getName() + " was skipped");
     }
}
