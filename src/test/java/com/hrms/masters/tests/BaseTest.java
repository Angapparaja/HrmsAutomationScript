package com.hrms.masters.tests;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;



import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageactions.masters.HrmsHomePage;
import com.hrms.pageactions.masters.LoginPage;
import com.hrms.pageactions.masters.MastersGeography;
import com.hrms.pageactions.masters.MastersPersonal;







public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	Driverfactory df;
	SoftAssert softAssert;
	
	LoginPage Lp;
	HrmsHomePage Hp;
	
	MastersGeography Mg;
	MastersPersonal Mp;
	
	 

	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException {
		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		driver = df.initDriver(prop);
		Lp = new LoginPage(driver);
		Mg = new MastersGeography(driver);
		Mp = new MastersPersonal(driver);
		

//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));

	
		
//		TestUtil.WaitTill_PageLoads(10);
	}
	

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();

	}
	

}