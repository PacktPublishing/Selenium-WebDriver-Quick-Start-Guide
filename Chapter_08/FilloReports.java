public class FilloReports {

  private Formatter x;

  public void createFile() {
    String timestamp1 = new SimpleDateFormat("yyyyMMMddHHmmss")
        .format(new java.util.Date());
    try {
      x = new Formatter("Results.xls" + timestamp1);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void insertRecord(String testcaseID, String result) {
    String query = "insert into report (TestcaseID, Result) values ('"
        + testcaseID + "','" + result + "')";
  }

  public void updateRecord(String testcaseID, String result) {
    String query = "update report set result='" + result
        + "' where TestCaseID='" + testcaseID + "')";
  }

}
