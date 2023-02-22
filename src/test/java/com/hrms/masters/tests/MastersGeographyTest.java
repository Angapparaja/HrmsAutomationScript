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
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Test()
//	public void LoginTest() throws InterruptedException {
//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
//	}


	@Test(dependsOnMethods = { "LoginTest" })
	public void CountryTest() throws InterruptedException {
	//	Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(Mg.CountryCheck(prop.getProperty("countryname")));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void CountryEditTest() throws InterruptedException {
		Mg.CountryEdit(prop.getProperty("searchCountry"),prop.getProperty("countryedits"));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void StateTest() throws InterruptedException {
		Assert.assertTrue(Mg.StateCheck(prop.getProperty("state-countryname"),prop.getProperty("statename")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void StateEditTest() throws InterruptedException {
		Mg.StateEdit(prop.getProperty("state-searchCountry"),prop.getProperty("state-stateEdits"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void CityTest() throws InterruptedException {
		Mg.CityCheck(prop.getProperty("City-countryname"),prop.getProperty("City-statename"),prop.getProperty("CityName")
				,prop.getProperty("City-Population"),prop.getProperty("City-staus"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void CityEditTest() throws InterruptedException {
		Mg.CityEdit(prop.getProperty("City-searchCountry"),prop.getProperty("City-stateEdits"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void AreaTest() throws InterruptedException {
		Mg.AreaCheck(prop.getProperty("Area-countryname"),prop.getProperty("Area-statename"),prop.getProperty("Area-CityName")
				,prop.getProperty("AreaName"),prop.getProperty("Area-zipcode"),prop.getProperty("Area-staus"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void AreaEditTest() throws InterruptedException {
		Mg.AreaEdit(prop.getProperty("Area-searchCountry"),prop.getProperty("Area-stateEdits"));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void WorklocationTest() throws InterruptedException {
		Mg.WorklocationCheck(prop.getProperty("Work-countryname"),prop.getProperty("Work-statename"),prop.getProperty("Work-CityName")
				,prop.getProperty("Work-AreaName"),prop.getProperty("Work-locationcode"),prop.getProperty("Work-locationname"),prop.getProperty("Work-staus"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void WorklocationEditTest() throws InterruptedException {
		Mg.WorklocationEdit(prop.getProperty("Work-searchCountry"),prop.getProperty("Work-stateEdits"));
	}
	
		

}



