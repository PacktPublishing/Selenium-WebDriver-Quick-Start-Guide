public class ReportGenerator {
 public static void main(String[] args) throws ParserConfigurationException,
 SAXException, IOException {
     String destFile = "ReportGen.xls";
     String path = ReportGenerator.class.getClassLoader().getResource("./")
                     .getPath();
     path = path.replaceAll("target/classes", "test-output");
     File file = new File(path + "testng-results.xml");
     DocumentBuilderFactory docFactory = DocumentBuilderFactory
                                             .newInstance();
     DocumentBuilder docbuilder = docFactory.newDocumentBuilder();
     Document dcmt = docbuilder.parse(file);
     dcmt.getDocumentElement().normalize();
     XSSFWorkbook book = new XSSFWorkbook();
     NodeList tlist = dcmt.getElementsByTagName("test");
     for (int i = 0; i < tlist.getLength(); i++) {
         int rw = 0;
         Node tnode = tlist.item(i);
         String tname = ((Element) tnode).getAttribute("name");
         XSSFSheet sheet = book.createSheet(tname);
         NodeList classlist = ((Element) tnode)
                                 .getElementsByTagName("class");
         for (int j = 0; j < classlist.getLength(); j++) {
             Node cnode = classlist.item(j);
             String cname = ((Element) cnode).getAttribute("name");
             NodeList tmethodList = ((Element) cnode)
                                     .getElementsByTagName("test-method");
             for (int k = 0; k < tmethodList.getLength(); k++) {
                 Node tmethodNode = tmethodList.item(k);
                 String tmethodname = ((Element) tmethodNode)
                                             .getAttribute("name");
                 String tmethodstatus = ((Element) tmethodNode)
                                             .getAttribute("status");
                 XSSFRow row1 = sheet.createRow(rw++);
                 XSSFCell cel1 = row1.createCell(0);
                 cel1.setCellValue(cname + "." + tmethodname);
                 XSSFCell cel2 = row1.createCell(1);
                 cel2.setCellValue(tmethodstatus);
             }
         }
     }
     FileOutputStream fstream = new FileOutputStream(path + "report/"
                                                         + destFile);
     book.write(fstream);
     fstream.close();
     System.out.println("Report Generated");
    }
}
