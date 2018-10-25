public class ExtractData2 {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection conn = null;
		Recordset rcrdset = null;
		try {
			conn = fillo
					.getConnection("C:\\SeleniumWD\\src\\main\\resources\\Framework.xlsx");
			String query = "Select * from TestCases where TestCaseID in (select TestCaseID from TestConfig where Execute_Flag='Y')";

			rcrdset = conn.executeQuery(query);

			while (rcrdset.next()) {
				System.out.println(rcrdset.getField("TestCaseID") + ":::"
						+ rcrdset.getField("Keyword") + ":::"
						+ rcrdset.getField("Object") + ":::"
						+ rcrdset.getField("Data"));
			}
		} catch (FilloException e) {
			throw new FilloException("Error in query");
		} finally {
			rcrdset.close();
			conn.close();
		}
	}

}
