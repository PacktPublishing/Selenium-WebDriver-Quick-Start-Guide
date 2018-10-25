public class ReadFillo {
  static Object[][] objectArray = {};
  static Object[][] noRecords = {};
  private static String tempParam;
  static Map<String, String> tempMap = new HashMap<String, String>();
  static List<HashMap> tempList = new ArrayList<HashMap>();
  private static List<HashMap> input_data;
  private static String browserName;
  static IActionKeyword actKeyword;
  private static Object actionKeyword;
  private static Object inputData;
  private static Object testcaseID;
  static ICommand command;
  static BrowserInvoker invoker;
  private static WebDriver driver;

  @Test()
  @Parameters("browserName")
  public static void fetchValues(String param) {
    tempParam = param;
  }

  @AfterTest
  public static void quitBrowser() {
    System.out.println("Quit Browser");
  }

  @Test(dataProvider = "Data1", dependsOnMethods = "fetchValues")
  public static void getValues(String testCaseID, String teststepID,
      String action, String data, String keyword) {
    System.out.println("First Extract: " + testCaseID + ": " + teststepID
        + ": " + action + ": " + data + ": " + keyword);
    List<String> browsers = new ArrayList<String>();

    browsers.add(tempParam);
    // input_data = ExtractAllData.extractData(browserName);
    // input_data = ReadFillo.fetchValues(browserName);
    System.out.println("kya ha ?");
    // for (int i = 0; i < input_data.size(); i++) {
    String timestamp = new SimpleDateFormat("yyyyMMMddHHmmss")
        .format(new java.util.Date());

    System.out.println("Starting " + browserName + timestamp);
    actionKeyword = keyword;
    inputData = data;
    testcaseID = testCaseID;
    System.out.println("Action Keyword: " + testCaseID);
    System.out.println("Action Data: " + data);

    switch (keyword) {
    case "openbrowser":
      try {
        actKeyword = new OpenBrowser();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (FilloException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      command = new NewBrowser(actKeyword);
      invoker = new BrowserInvoker(command);
      driver = invoker.open(browsers);
      break;
    case "navigate":
      try {
        actKeyword = new OpenURL();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (FilloException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      command = new OpenURLCommand(actKeyword);
      NavigatorInvoker invoker1 = new NavigatorInvoker(command);
      driver = invoker1.navigate(driver, data);
      break;
    }
    // }
  }

  @DataProvider(name = "Data1")
  public static Object[][] exec() {
    String timestamp = new SimpleDateFormat("yyyyMMMddHHmmss")
        .format(new java.util.Date());
    System.out.println("Starting " + tempParam + timestamp);
    Connection conn = null;
    Fillo fillo = new Fillo();
    Recordset rs = null, rs1 = null;
    try {
      conn = fillo.getConnection(System.getProperty("user.dir")
          + "\\src\\main\\resources\\Framework.xlsx");
    } catch (FilloException e) {
      e.printStackTrace();
    }
    String strQuery = "select * from TestConfig where Browser='"
        + tempParam + "'";
    System.out.println(strQuery);
    String strQuery3 = "select * from TestCases";
    try {
      rs = conn.executeQuery(strQuery3);
    } catch (FilloException e1) {
      e1.printStackTrace();
    }
    String strQuery2 = "select * from TestCases where TestCaseID='";
    try {
      rs = conn.executeQuery(strQuery);
    } catch (FilloException e) {
      System.out.println("No records have been found");
    }
    try {
      // tempList = new ArrayList<HashMap>();
      for (int i = 0; i < rs.getCount(); i++) {
        rs.next();
        System.out.println("Ala: " + rs.getField("TestCaseID"));
        System.out.println(rs.getField("Browser"));
        System.out.println(rs.getField("Execute_Flag"));
        if (rs.getField("Execute_Flag").equalsIgnoreCase("y")) {
          rs1 = conn.executeQuery(strQuery2
              + rs.getField("TestCaseID") + "'");

          System.out.println("Rs1 count: " + rs1.getCount());
          for (int j = 0; j < rs1.getCount(); j++) {
            rs1.next();
            tempMap = new HashMap<String, String>();
            tempMap.put("TestCaseID", rs1.getField("TestCaseID"));
            tempMap.put("TestStepID", rs1.getField("TestStepID"));
            tempMap.put("Object", rs1.getField("Object"));
            tempMap.put("Data", rs1.getField("Data"));
            tempMap.put("Keyword", rs1.getField("Keyword"));
            tempList.add((HashMap) tempMap);
          }
        }
      }
      objectArray = noRecords;
      objectArray = new Object[tempList.size()][5];
      for (int i = 0; i < tempList.size(); i++) {
        objectArray[i][0] = tempList.get(i).get("TestCaseID");
        objectArray[i][1] = tempList.get(i).get("TestStepID");
        objectArray[i][2] = tempList.get(i).get("Object");
        objectArray[i][3] = tempList.get(i).get("Data");
        objectArray[i][4] = tempList.get(i).get("Keyword");
      }
    } catch (FilloException e) {
      return noRecords;
    }
    String timestamp1 = new SimpleDateFormat("yyyyMMMddHHmmss")
        .format(new java.util.Date());
    System.out.println("Ending " + tempParam + timestamp1);
    return objectArray;
  }
}
