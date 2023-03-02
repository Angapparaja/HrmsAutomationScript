package com.hrms.masters.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = {"Regression"})
public class MastersRecruitmentTest extends BaseTest{
	
	@BeforeClass
	public void login() throws InterruptedException {
		
		Lp.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void ConsultantTest() throws InterruptedException {
		Assert.assertTrue(Mr.ConsultantCheck(prop.getProperty("CONS-CONSULTANTNAME"),prop.getProperty("CONS-PERSON"),prop.getProperty("CONS-CONTACTNO")
				,prop.getProperty("CONS-EMAIL"),prop.getProperty("CONS-ADDRESS"),prop.getProperty("CONS-COUNTRY"),prop.getProperty("CONS-STATE")
				,prop.getProperty("CONS-CITY"),prop.getProperty("CONS-LOCATION"),prop.getProperty("CONS-USERNAME")));
	}
	
	@Test(priority=1)
	public void ConsultantEditTest() throws InterruptedException {
		Mr.ConsultantEdit(prop.getProperty("CONS-searchCONSNAME"),prop.getProperty("CONS-CONSNAMEEdits"));
	}
	
	
	@Test(priority=2)
	public void CompetenciesTest() throws InterruptedException {
		Assert.assertTrue(Mr.CompetenciesCheck(prop.getProperty("COMPENTENCIESNAME"),prop.getProperty("COMPENTENCIES-GROUP"),prop.getProperty("COMPENTENCIES-DESCRIP")
				,prop.getProperty("COMPENTENCIES-POSITIVE"),prop.getProperty("COMPENTENCIES-NEGATIVE"),prop.getProperty("COMPENTENCIES-STATUS")));
	}
	
	@Test(priority=3)
	public void CompetenciesEditTest() throws InterruptedException {
		Mr.CompetenciesEdit(prop.getProperty("COMPENTENCIES-searchCompName"),prop.getProperty("COMPENTENCIES-EditCOMPNAME"));
	}

	
	@Test(priority=4)
	public void EvalutionFormTest() throws InterruptedException {
		Assert.assertTrue(Mr.EvaluationFormCheck(prop.getProperty("EVALUATIONFORM-Title"),prop.getProperty("EVALUATIONFORM-TOPICQUESTION")));
	}
	
	@Test(priority=5)
	public void EvalutionFormEditTest() throws InterruptedException {
		Mr.EvaluationFormEdit(prop.getProperty("SEARCH_EVALTitle"),prop.getProperty("EVALTitleEDIT"));
	}
	
	
	@Test(priority=6)
	public void SkillTest() throws InterruptedException {
		Assert.assertTrue(Mr.SkillCheck(prop.getProperty("SKILLNAME")));
	}
	
	@Test(priority=7)
	public void SkillEditTest() throws InterruptedException {
		Mr.SkillEdit(prop.getProperty("SEARCH_SKILLNAME"),prop.getProperty("SKILLNAMEEDIT"));
	}


	
}
