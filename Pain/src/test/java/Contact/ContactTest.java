package Contact;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "SmokeTest")
public void createContactTest() {
	System.out.println("ContactTest is generated");
	String URL = System.getProperty("url","http://amazon.in");
	String BROWSER = System.getProperty("browser","Chrome");
	String USERNAME = System.getProperty("username","Admin");
	String PASSWORD = System.getProperty("password","Admin");
	
	
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}
@Test(groups = "RegressionTest")
public void modifyContactTest() {
	System.out.println("ContactTest is modified");
}
@Test(groups = "SmokeTest")
public void DeleteContactTest() {
	System.out.println("ContactTest is deleted");
}
}
