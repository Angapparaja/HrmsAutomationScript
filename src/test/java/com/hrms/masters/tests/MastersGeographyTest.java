package com.hrms.masters.tests;
import org.junit.Assert;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test(groups = {"GeoCountry","Regression"})
public class MastersGeographyTest extends BaseTest{

	@Test()
	public void CountryTest() throws InterruptedException {
		Assert.assertTrue(geography.CountryCheck(prop.getProperty("countryname")));
	}
	
	@Test()
	public void CountryEditTest() throws InterruptedException {
		Assert.assertTrue(geography.CountryEdit(prop.getProperty("countryedits")));
	}
	
	

}
