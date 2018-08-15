Fillo fillo = new Fillo();
 Map<String, String> testcaseData = new HashMap<String, String>();
 List<Map> teststepList = new ArrayList<Map>();
 Connection conn = null;
 try {
       conn = fillo
          .getConnection("C:\\SeleniumWD\\src\\main\\resources\\Framework.xlsx");
     } catch (FilloException e) {
         e.printStackTrace();
       }
 String query = "Select * from TestCases where TestCaseID in (select TestCaseID   
                 from TestConfig where Execute_Flag='Y')";
 Recordset rcrdset = null;
 try {
        rcrdset = conn.executeQuery(query);
     } catch (FilloException e) {
        e.printStackTrace();
       }
 try {
       while (rcrdset.next()) {
             testcaseData = new HashMap<String, String>();
             testcaseData.put("TestCaseID", rcrdset.getField("TestCaseID"));
             testcaseData.put("Keyword", rcrdset.getField("Keyword"));
             testcaseData.put("Object", rcrdset.getField("Object"));
             testcaseData.put("Data", rcrdset.getField("Data"));
             teststepList.add(testcaseData);
       }
     System.out.println("List Content size: " + teststepList);
     } catch (FilloException e) {
           e.printStackTrace();
       }
 rcrdset.close();
 conn.close();
