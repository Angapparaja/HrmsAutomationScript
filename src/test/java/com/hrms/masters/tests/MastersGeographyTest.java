package com.hrms.masters.tests;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



@Test(groups = {"Regression"})
public class MastersGeographyTest extends BaseTest{
<<<<<<< HEAD
=======
	
	

<<<<<<< HEAD
	@Test()
	public void LoginTest() throws InterruptedException {
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Test()
//	public void LoginTest() throws InterruptedException {
//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
//	}


	@Test(dependsOnMethods = { "LoginTest" })
=======
>>>>>>> 0f1f3fdc07b073332b0ca5a6b2d3ab9394efad46


	@BeforeClass
	public void login() throws InterruptedException {
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
<<<<<<< HEAD
	@Test(priority=0 )
=======
	@Test(priority=0)
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5
>>>>>>> 0f1f3fdc07b073332b0ca5a6b2d3ab9394efad46
	public void CountryTest() throws InterruptedException {
		
		Assert.assertTrue(Mg.CountryCheck(prop.getProperty("countryname")));
	}
	
	@Test(priority=1)
	public void CountryEditTest() throws InterruptedException {
		Mg.CountryEdit(prop.getProperty("searchCountry"),prop.getProperty("countryedits"));
	}
	
	@Test(priority=2)
	public void StateTest() throws InterruptedException {
		Assert.assertTrue(Mg.StateCheck(prop.getProperty("state-countryname"),prop.getProperty("statename")));
	}
	
	
	@Test(priority=3)
	public void StateEditTest() throws InterruptedException {
		Mg.StateEdit(prop.getProperty("state-searchCountry"),prop.getProperty("state-stateEdits"));
	}
	
	
	@Test(priority=4)
	public void CityTest() throws InterruptedException {
		Mg.CityCheck(prop.getProperty("City-countryname"),prop.getProperty("City-statename"),prop.getProperty("CityName")
				,prop.getProperty("City-Population"),prop.getProperty("City-staus"));
	}
	
	
	@Test(priority=5)
	public void CityEditTest() throws InterruptedException {
		Mg.CityEdit(prop.getProperty("City-searchCountry"),prop.getProperty("City-stateEdits"));
	}
	
	
	@Test(priority=6)
	public void AreaTest() throws InterruptedException {
		Mg.AreaCheck(prop.getProperty("Area-countryname"),prop.getProperty("Area-statename"),prop.getProperty("Area-CityName")
				,prop.getProperty("AreaName"),prop.getProperty("Area-zipcode"),prop.getProperty("Area-staus"));
	}
	
	
	@Test(priority=7)
	public void AreaEditTest() throws InterruptedException {
		Mg.AreaEdit(prop.getProperty("Area-searchCountry"),prop.getProperty("Area-stateEdits"));
	}
	
	@Test(priority=8)
	public void WorklocationTest() throws InterruptedException {
		Mg.WorklocationCheck(prop.getProperty("Work-countryname"),prop.getProperty("Work-statename"),prop.getProperty("Work-CityName")
				,prop.getProperty("Work-AreaName"),prop.getProperty("Work-locationcode"),prop.getProperty("Work-locationname"),prop.getProperty("Work-staus"));
	}
	
	
	@Test(priority=9)
	public void WorklocationEditTest() throws InterruptedException {
		Mg.WorklocationEdit(prop.getProperty("Work-searchCountry"),prop.getProperty("Work-stateEdits"));
	}
	
<<<<<<< HEAD
		
=======

>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5

}



