Fillo fillo = new Fillo();
 Connection conn = null;
 try {
     conn =   
     fillo.getConnection("C:\\SeleniumWD\\src\\main\\resources\\Framework.xlsx");
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
             System.out.println(rcrdset.getField("TestCaseID") + ":::"
             + rcrdset.getField("Keyword") + ":::"
             + rcrdset.getField("Object") + ":::"
             + rcrdset.getField("Data"));
         }
     } catch (FilloException e) {
         e.printStackTrace();
       }
 rcrdset.close();
 conn.close();
