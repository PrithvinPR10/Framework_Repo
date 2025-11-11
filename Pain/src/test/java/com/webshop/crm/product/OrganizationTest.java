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
public void DeleteOrgTest() {
	System.out.println("OrganizationTest is deleted");
}
}
