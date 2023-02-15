package com.hrms.masters.tests;
import org.junit.Assert;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test(groups = {"Geography","Regression"})
public class MastersGeographyTest extends BaseTest{
	
	
	@Test()
	public void LoginTest() throws InterruptedException {
		loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(dependsOnMethods = { "LoginTest" })
	public void CountryTest() throws InterruptedException {
		Assert.assertTrue(geography.CountryCheck(prop.getProperty("countryname")));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void CountryEditTest() throws InterruptedException {
		geography.CountryEdit(prop.getProperty("searchCountry"),prop.getProperty("countryedits"));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void StateTest() throws InterruptedException {
		Assert.assertTrue(geography.StateCheck(prop.getProperty("state-countryname"),prop.getProperty("statename")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void StateEditTest() throws InterruptedException {
		geography.StateEdit(prop.getProperty("state-searchCountry"),prop.getProperty("state-stateEdits"));
	}
	
	

}
