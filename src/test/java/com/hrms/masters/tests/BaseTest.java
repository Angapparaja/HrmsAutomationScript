package com.hrms.masters.tests;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import org.testng.asserts.SoftAssert;



import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageactions.masters.HrmsHomePage;
import com.hrms.pageactions.masters.LoginPage;
import com.hrms.pageactions.masters.MastersEducation;
import com.hrms.pageactions.masters.MastersGeography;
import com.hrms.pageactions.masters.MastersPersonal;
import com.hrms.pageactions.masters.MastersPosition;


public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	Driverfactory df;
	SoftAssert softAssert;
	
	
	LoginPage Lp;
	HrmsHomePage Hp;
	
	MastersGeography Mg;
	MastersPersonal Mp;
	MastersEducation ME;
	MastersPosition MPO;
	Logger logger; 
	
	
	
	 

	@BeforeClass(alwaysRun=true)
	public void setup() throws InterruptedException  {
		
		logger = Logger.getLogger("HRMS");
		PropertyConfigurator.configure("Log4j.properties");
		
		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		
		driver = df.initDriver(prop);
		 df.Max_wait();
		df.Min_wait();
		Lp = new LoginPage(driver);
		Mg = new MastersGeography(driver);
		Mp = new MastersPersonal(driver);
	    ME   = new MastersEducation(driver);
	    MPO   = new MastersPosition(driver);

	   // Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
//		TestUtil.WaitTill_PageLoads(10);
	}
	


	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();

	}

	

}