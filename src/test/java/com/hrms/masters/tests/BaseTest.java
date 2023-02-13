package com.hrms.masters.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
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
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	
	MastersGeography geography;
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);
		geography = new MastersGeography(driver);
		
		
		loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	
		
//		TestUtil.WaitTill_PageLoads(10);
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
		driver.close();
	}
	

}
