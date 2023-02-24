package com.hrms.masters.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = {"Regression"})
public class MastersPositionTest extends BaseTest{
	
	@BeforeClass
	public void login() throws InterruptedException {
		
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void JobLevelTest() throws InterruptedException {
		Assert.assertTrue(MPO.JoblevelCheck(prop.getProperty("JOBLEVELName"),prop.getProperty("JOBLEVEL-Hierachy")));
	}
	
	@Test(priority=1)
	public void JobLevelEditTest() throws InterruptedException {
		MPO.JoblevelEdit(prop.getProperty("JOBLEVEL-searchJOBLEVELname"),prop.getProperty("JOBLEVEL-JOBLEVELEdits"));
	}
	
	
	@Test(priority=2)
	public void DesignationTest() throws InterruptedException {
		Assert.assertTrue(MPO.DesignationCheck(prop.getProperty("DESIGNATION-JOBLEVELName"),prop.getProperty("DESIGNATIONName")));
	}
	
	@Test(priority=3)
	public void DesignationEditTest() throws InterruptedException {
		MPO.DesignationEdit(prop.getProperty("DESIGNATION-searchDESIGNATION"),prop.getProperty("DESIGNATION-DESIGNATIONEdits"));
	}
	
	@Test(priority=4)
	public void BusinessUnitTest() throws InterruptedException {
		Assert.assertTrue(MPO.BusinessUnitCheck(prop.getProperty("BUSINESSUNITName")));
	}
	
	@Test(priority=5)
	public void BusinessUnitEditTest() throws InterruptedException {
		MPO.BusinessUnitEdit(prop.getProperty("BUSINESSUNIT-searchBUSINESSUNIT"),prop.getProperty("BUSINESSUNIT-BUSINESSUNITEdits"));
	}
	
	
	@Test(priority=6)
	public void DepartmentTest() throws InterruptedException {
		Assert.assertTrue(MPO.DepartmentCheck(prop.getProperty("DEPARTMENTName"),prop.getProperty("DEPARTMENTCODE")));
	}
	
	@Test(priority=7)
	public void DepartmentEditTest() throws InterruptedException {
		MPO.DepartmentEdit(prop.getProperty("DEPARTMENT-searchDEPARTMENT"),prop.getProperty("DEPARTMENT-DEPARTMENTEdits"));
	}
	
	@Test(priority=8)
	public void SubDepartmentTest() throws InterruptedException {
		Assert.assertTrue(MPO.SubDepartmentCheck(prop.getProperty("SUBDEPARTMENT-DEPARTMENTName"),prop.getProperty("SUBDEPARTMENTName")));
	}
	
	@Test(priority=9)
	public void SubDepartmentEditTest() throws InterruptedException {
		MPO.SubDepartmentEdit(prop.getProperty("SUBDEPARTMENT-searchSUBDEPARTMENT"),prop.getProperty("SUBDEPARTMENT-SUBDEPARTMENTEdits"));
	}

	
	@Test(priority=10)
	public void CostCenterTest() throws InterruptedException {
		Assert.assertTrue(MPO.CostCenterCheck(prop.getProperty("COSTCENTERName")));
	}
	
	@Test(priority=11)
	public void CostCenterEditTest() throws InterruptedException {
		MPO.CostCenterEdit(prop.getProperty("COSTCENTER-searchCOSTCENTER"),prop.getProperty("COSTCENTER-COSTCENTEREdits"));
	}
	
	
	@Test(priority=12)
	public void CenterTest() throws InterruptedException {
		Assert.assertTrue(MPO.CenterCheck(prop.getProperty("CENTER-Costcenter"),prop.getProperty("CENTERName")));
	}
	
	@Test(priority=13)
	public void CenterEditTest() throws InterruptedException {
		MPO.CenterEdit(prop.getProperty("CENTER-searchCENTER"),prop.getProperty("CENTER-CENTEREdits"));
	}
	
	@Test(priority=14)
	public void PositionCategoryTest() throws InterruptedException {
		Assert.assertTrue(MPO.PositionCategoryCheck(prop.getProperty("POSITIONCATEGORYName")));
	}
	
	@Test(priority=15)
	public void PositionCategoryEditTest() throws InterruptedException {
		MPO.PositionCategoryEdit(prop.getProperty("POSITIONCATEGORY-searchPOSITIONCATEGORY"),prop.getProperty("POSITIONCATEGORY-POSITIONCATEGORYEdits"));
	}

	
	@Test(priority=16)
	public void MarketDesignationTest() throws InterruptedException {
		Assert.assertTrue(MPO.MarketDesignationCheck(prop.getProperty("MARKETDESIGNATIONName")));
	}
	
	@Test(priority=17)
	public void MarketDesignationEditTest() throws InterruptedException {
		MPO.MarketDesignationEdit(prop.getProperty("MARKETDESIGNATION-searchMARKETDESIGNATION"),prop.getProperty("MARKETDESIGNATION-MARKETDESIGNATIONEdits"));
	}

}
