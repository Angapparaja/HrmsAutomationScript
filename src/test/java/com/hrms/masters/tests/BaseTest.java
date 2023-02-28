package com.hrms.masters.tests;

import java.util.Properties;


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


	@BeforeClass(alwaysRun=true)

	public void setup()  {

		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		
		driver = df.initDriver(prop);
		
		Lp = new LoginPage(driver);
		Mg = new MastersGeography(driver);

		Mp = new MastersPersonal(driver);
	    ME   = new MastersEducation(driver);
	    MPO   = new MastersPosition(driver);


	}
	


	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();

	}

	

}