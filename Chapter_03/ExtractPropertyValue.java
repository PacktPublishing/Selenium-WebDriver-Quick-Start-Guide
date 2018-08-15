 Properties prop = new Properties();
 InputStream input = null;
 try {
 input = new FileInputStream(
 "C:\\SeleniumWD\\src\\main\\resources\\Login.properties");
 prop.load(input);
 System.out.println("Username: " + prop.getProperty("USERNAME"));
 System.out.println("Password: " + prop.getProperty("PASSWORD"));
 } catch (Exception e) {
e.printStackTrace();
 }
