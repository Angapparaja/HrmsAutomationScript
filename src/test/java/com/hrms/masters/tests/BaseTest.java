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
	
	 

<<<<<<< HEAD
	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException {
=======
	@BeforeClass(alwaysRun=true)
	public void setup()  {
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5
		softAssert = new SoftAssert();
		df =new Driverfactory(); 
		prop = df.initProperties();
		driver = df.initDriver(prop);
		Lp = new LoginPage(driver);
		Mg = new MastersGeography(driver);
<<<<<<< HEAD
		

//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));

	//	Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));

	//	loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	
		
=======
		Mp = new MastersPersonal(driver);
	    ME   = new MastersEducation(driver);

>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5
//		TestUtil.WaitTill_PageLoads(10);
	}
	

<<<<<<< HEAD
	@AfterClass(alwaysRun = true)
=======

	@AfterClass(alwaysRun=true)
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5
	public void tearDown() {
		driver.quit();

	}

	

}