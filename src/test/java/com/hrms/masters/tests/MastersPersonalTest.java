package com.hrms.masters.tests;

import org.junit.Assert;
import org.testng.annotations.*;
@Test(groups = {"Regression"})
public class MastersPersonalTest extends BaseTest{
	
//	@Test(priority=0)
//	public void LoginTest() throws InterruptedException {
//		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
//	}

	@BeforeClass
	public void login() throws InterruptedException {
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=0 )
	public void ReligionTest() throws InterruptedException {
		
		Assert.assertTrue(Mp.ReligionCheck(prop.getProperty("PERSONAL-Religion")));
	}
	
	@Test(priority=1 )
	public void ReligionEditTest() throws InterruptedException {
		Mp.ReligionEdit(prop.getProperty("PERSONAL-searchReligion"),prop.getProperty("PERSONAL-ReligionEdits"));
	}
	
	
	@Test(priority=2 )
	public void NationalityTest() throws InterruptedException {
		Assert.assertTrue(Mp.NationalityCheck(prop.getProperty("NationalityName")));
	}
	
	
	@Test(priority=3 )
	public void NationalityEditTest() throws InterruptedException {
		Mp.NationalityEdit(prop.getProperty("Nationality-searchNationality"),prop.getProperty("Nationality-NationalityEdits"));
	}
	
	@Test(priority=4 )
	public void LanguageTest() throws InterruptedException {
		Assert.assertTrue(Mp.LanguageCheck(prop.getProperty("LangugageName")));
	}
	
	
	@Test(priority=5 )
	public void LanguageEditTest() throws InterruptedException {
		Mp.LanguaugeEdit(prop.getProperty("Langugage-searchLangugage"),prop.getProperty("Langugage-LangugageEdits"));
	}
	
	@Test(priority=6 )
	public void RelationShipTest() throws InterruptedException {
		Assert.assertTrue(Mp.RelationShipCheck(prop.getProperty("RelationshipName")));
	}
	
	
	@Test(priority=7 )
	public void RelationshipEditTest() throws InterruptedException {
		Mp.relationshipEdit(prop.getProperty("Relationship-searchRelationship"),prop.getProperty("Relationship-RelationshipEdits"));
	}
	
	
	@Test(priority=8 )
	public void BloodGroupTest() throws InterruptedException {
		Assert.assertTrue(Mp.BloodGroupCheck(prop.getProperty("BLOODGROUPName")));
	}
	
	
	@Test(priority=9 )
	public void BloodGroupEditTest() throws InterruptedException {
		Mp.BloodGroupEdit(prop.getProperty("BLOODGROUP-searchBLOODGROUP"),prop.getProperty("BLOODGROUP-BLOODGROUPEdits"));
	}
	
	
	@Test(priority=10 )
	public void IdentificationProofTest() throws InterruptedException {
		Assert.assertTrue(Mp.IdentificationProofCheck(prop.getProperty("IDENTIFICATIONName")));
	}
	
	
	@Test(priority=11 )
	public void IdentificationProofEditTest() throws InterruptedException {
		Mp.IdentificationProofEdit(prop.getProperty("IDENTIFICATION-searchIDENTIFICATION"),prop.getProperty("IDENTIFICATION-IDENTIFICATIONEdits"));
	}
	

	
}
