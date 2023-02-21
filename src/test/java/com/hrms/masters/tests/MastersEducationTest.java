package com.hrms.masters.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = { "Education" })	
public class MastersEducationTest extends BaseTest{
	
	@BeforeClass
	public void login() throws InterruptedException {
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void QualificationTest() throws InterruptedException {

		Assert.assertTrue(ME.QualificationCheck(prop.getProperty("QUALIFICATIONName")));
	}
	
	@Test(priority=1)
	public void QualificationEditTest() throws InterruptedException {
		ME.QualificationEdit(prop.getProperty("QUALIFICATION-searchQUALIFICATION"),prop.getProperty("QUALIFICATION-QUALIFICATIONEdits"));
	}

	
	@Test(priority=2)
	public void DegreeTest() throws InterruptedException {

		Assert.assertTrue(ME.DegreeCheck(prop.getProperty("DEGREE-Qualification"),prop.getProperty("DEGREEName")));
	}
	
	@Test(priority=3)
	public void DegreeEditTest() throws InterruptedException {
		ME.DegreeEdit(prop.getProperty("DEGREE-searchDEGREE"),prop.getProperty("DEGREE-DEGREEEdits"));
	}
	
	
	@Test(priority=4)
	public void CourseTest() throws InterruptedException {

		Assert.assertTrue(ME.CourseCheck(prop.getProperty("COURSE-DEGREESELECT"),prop.getProperty("COURSEName")));
	}
	
	@Test(priority=5)
	public void CourseEditTest() throws InterruptedException {
		ME.CourseEdit(prop.getProperty("COURSE-searchCOURSE"),prop.getProperty("COURSE-COURSEEdits"));
	}
	

}
