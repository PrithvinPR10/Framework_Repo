package com.webshop.crm.product;

import org.testng.annotations.Test;

public class OrganizationTest {
@Test(groups = "SmokeTest")
public void createOrgTest() {
	System.out.println("OrganizationTest is generated");
}
@Test(groups = "RegressionTest")
public void modifyOrgTest() {
	System.out.println("OrganizationTest is modified");
}
@Test(groups = "SmokeTest")
public void deleteOrgTest() {
	System.out.println("OrganizationTest is deleted");
}
@Test(groups = "SmokeTest")
public void restoreOrgTest() {
	System.out.println("OrganizationTest is restored");
}
}
