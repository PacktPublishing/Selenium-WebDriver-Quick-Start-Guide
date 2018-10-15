public class ReadProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(
					"C:\\SeleniumWD\\src\\main\\resources\\Login.properties");
			prop.load(input);
			System.out.println("Username: " + prop.getProperty("USERNAME"));
			System.out.println("Password: " + prop.getProperty("PASSWORD"));
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		} finally {
			input.close();
		}

	}
}
