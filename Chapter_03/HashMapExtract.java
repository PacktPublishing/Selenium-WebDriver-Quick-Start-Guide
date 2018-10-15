 public static void main(String[] args) {
    Fillo fillo = new Fillo();
    Map<String, String> testcaseData = new HashMap<String, String>();
    Connection conn = null;
    Recordset rcrdset = null;
    try {
      conn = fillo
          .getConnection("C:\\SeleniumWD\\src\\main\\resources\\Framework.xlsx");
      String query = "Select * from TestCases where TestCaseID in (select                     TestCaseID from TestConfig where Execute_Flag='Y')";
      rcrdset = conn.executeQuery(query);
      while (rcrdset.next()) {
        testcaseData.put("TestCaseID", rcrdset.getField("TestCaseID"));
        testcaseData.put("Keyword", rcrdset.getField("Keyword"));
        testcaseData.put("Object", rcrdset.getField("Object"));
        testcaseData.put("Data", rcrdset.getField("Data"));
      }
      System.out.println(testcaseData);
    } catch (FilloException e) {
      throw new FilloException("Error in query processing");
    } finally {
      rcrdset.close();
      conn.close();
    }
  }
}
