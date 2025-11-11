package Contact;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "SmokeTest")
public void createContactTest() {
	System.out.println("ContactTest is generated");
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
