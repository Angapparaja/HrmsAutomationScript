package com.hrms.masters.tests;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;



import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageactions.HrmsHomePage;
import com.hrms.pageactions.LoginPage;
import com.hrms.pageactions.MastersGeography;






public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	Driverfactory df;
	SoftAssert softAssert;
	
	LoginPage Lp;
	HrmsHomePage Hp;
	
	MastersGeography Mg;
	
	 
<<<<<<< HEAD
	@BeforeTest(alwaysRun = true)
=======
	@BeforeMethod(alwaysRun = true)
>>>>>>> 7232133e012b2f5eb58ec1ff5dd44fe53c3d9012
	public void setup() throws InterruptedException {
		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		driver = df.initDriver(prop);
		Lp = new LoginPage(driver);
		Mg = new MastersGeography(driver);
		
<<<<<<< HEAD
//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
=======
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
>>>>>>> 7232133e012b2f5eb58ec1ff5dd44fe53c3d9012
	//	loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	
		
//		TestUtil.WaitTill_PageLoads(10);
	}
	
<<<<<<< HEAD
	@AfterClass(alwaysRun = true)
=======
	@AfterMethod(alwaysRun = true)
>>>>>>> 7232133e012b2f5eb58ec1ff5dd44fe53c3d9012
	public void tearDown() {
		driver.quit();
		
	}
	

}