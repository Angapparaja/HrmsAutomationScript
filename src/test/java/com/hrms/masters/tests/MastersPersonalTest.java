package com.hrms.masters.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MastersPersonalTest extends BaseTest{
	
	@Test()
	public void LoginTest() throws InterruptedException {
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}


	@Test(dependsOnMethods = { "LoginTest" })
	public void ReligionTest() throws InterruptedException {
		Assert.assertTrue(Mp.ReligionCheck(prop.getProperty("PERSONAL-Religion")));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void ReligionEditTest() throws InterruptedException {
		Mp.ReligionEdit(prop.getProperty("PERSONAL-searchReligion"),prop.getProperty("PERSONAL-ReligionEdits"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void NationalityTest() throws InterruptedException {
		Assert.assertTrue(Mp.NationalityCheck(prop.getProperty("NationalityName")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void NationalityEditTest() throws InterruptedException {
		Mp.NationalityEdit(prop.getProperty("Nationality-searchNationality"),prop.getProperty("Nationality-NationalityEdits"));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void LanguageTest() throws InterruptedException {
		Assert.assertTrue(Mp.LanguageCheck(prop.getProperty("LangugageName")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void LanguageEditTest() throws InterruptedException {
		Mp.LanguaugeEdit(prop.getProperty("Langugage-searchLangugage"),prop.getProperty("Langugage-LangugageEdits"));
	}
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void RelationShipTest() throws InterruptedException {
		Assert.assertTrue(Mp.RelationShipCheck(prop.getProperty("RelationshipName")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void RelationshipEditTest() throws InterruptedException {
		Mp.relationshipEdit(prop.getProperty("Relationship-searchRelationship"),prop.getProperty("Relationship-RelationshipEdits"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void BloodGroupTest() throws InterruptedException {
		Assert.assertTrue(Mp.BloodGroupCheck(prop.getProperty("BLOODGROUPName")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void BloodGroupEditTest() throws InterruptedException {
		Mp.BloodGroupEdit(prop.getProperty("BLOODGROUP-searchBLOODGROUP"),prop.getProperty("BLOODGROUP-BLOODGROUPEdits"));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void IdentificationProofTest() throws InterruptedException {
		Assert.assertTrue(Mp.IdentificationProofCheck(prop.getProperty("IDENTIFICATIONName")));
	}
	
	
	@Test(dependsOnMethods = { "LoginTest" })
	public void IdentificationProofEditTest() throws InterruptedException {
		Mp.IdentificationProofEdit(prop.getProperty("IDENTIFICATION-searchIDENTIFICATION"),prop.getProperty("IDENTIFICATION-IDENTIFICATIONEdits"));
	}
	
}
