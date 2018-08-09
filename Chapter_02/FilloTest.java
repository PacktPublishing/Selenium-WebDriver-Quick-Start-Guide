public class FilloTest {

  public static void main(String[] args) {
    Fillo fillo = new Fillo();
    Connection conn = null;
    try {
      conn = fillo
          .getConnection("C:\\SeleniumWD\\src\\main\\resources\\Framework.xlsx");
    } catch (FilloException e) {
      e.printStackTrace();
    }
    String query = "Select * from TestConfig where Execute_Flag='Y'";
    Recordset rcrdset = null;
    try {
      rcrdset = conn.executeQuery(query);
    } catch (FilloException e) {
      e.printStackTrace();
    }
    try {
      while (rcrdset.next()) {
        System.out.println(rcrdset.getField("TestCaseID"));
      }
    } catch (FilloException e) {
      e.printStackTrace();
    }
    rcrdset.close();
    conn.close();
  }
}
