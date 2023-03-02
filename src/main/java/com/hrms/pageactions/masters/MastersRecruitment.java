package com.hrms.pageactions.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;

public class MastersRecruitment  extends Driverfactory{
	
	public WebDriver driver;
	public static ElementUtils eleUtil;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersRecruitment(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver); 
	}
	
	
	/*
	 * Masters-Recruitment-Consultant action class
	 */
	
	public boolean ConsultantCheck(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.recruitment);
		Min_wait();
		eleUtil.doClick(mas.consultant);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);	
		Min_wait();
		eleUtil.doSendKeys(mas.consultantName,ConsultancyName);
		eleUtil.doSendKeys(mas.consultantPerson,ContactPerson);
		eleUtil.doSendKeys(mas.consContactNo,ContactNo);
		eleUtil.doSendKeys(mas.consEmail,Email);
		eleUtil.doSendKeys(mas.consAddress,Address);
		
		eleUtil.doSelectByVisibleText(mas.countrySelect, Country);
		Min_wait();
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.stateSelect, Province);
		Min_wait();
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.citySelect, City);
		Min_wait();
		eleUtil.doSendKeys(mas.conslocation,locations);
		eleUtil.doSendKeys(mas.consuserName,username);
		Min_wait();
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		try {
		if(eleUtil.doIsDisplayed(CL.BackButton)) {
			eleUtil.doClick(CL.BackButton);
			Min_wait();
			eleUtil.doClick(CL.AddBtn);
			Min_wait();
		logger.info("Back button is visible");
		}
		}catch(Exception e) {
			logger.info("Add button is visible");
			eleUtil.doClick(CL.AddBtn);
			Min_wait();
		
		}
		logger.info("NEGATIVE DATA CHECK");
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Consultancy Name");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.consultantName,ConsultancyName);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Contact Person");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.consultantPerson,ContactPerson);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Consultancy Contact No");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.consContactNo,ContactNo);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Consultancy Email");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.consEmail,Email);
		eleUtil.doSendKeys(mas.consAddress,Address);
		
		eleUtil.doSelectByVisibleText(mas.countrySelect, Country);
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.stateSelect, Province);
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.citySelect, City);
		Min_wait();
		eleUtil.doSendKeys(mas.conslocation,locations);
		eleUtil.doSendKeys(mas.consuserName,username);
		Min_wait();
		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
			Min_wait();
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doClick(CL.BackButton);
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, ConsultancyName);
		String Consultancy = ConsultancyName;
		By tablecheck =By.xpath("(//table)[2]//tr//td[text()= '"+ConsultancyName+"']");
		String value=eleUtil.doGetText(tablecheck).trim();
		if(Consultancy.equals(value.trim())) {
			logger.info("consultant name is Approved");
		}
		else {
			logger.info("consultant name is not shown in the Table data");
		}
		
    return true;
		
	}
	
	
	
	
	public void ConsultantEdit(String SearchRecruitment ,String Recruitmentedit) throws InterruptedException {
		try {
			Max_wait();
			eleUtil.doClick(mas.masterIcon);
			Min_wait();
			eleUtil.doClick(mas.recruitment);
			Min_wait();
			eleUtil.doClick(mas.consultant);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the consultant Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, SearchRecruitment);
		logger.info("Search Recruitment Name  is : " + SearchRecruitment );
		By TableCheck =By.xpath("(//table)[2]//tr//td[text()= '"+SearchRecruitment+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.consultantName,Recruitmentedit);
		
		logger.info("Edit consultantName  is : " + Recruitmentedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Recruitment-Competencies action class
	 */
	
	public boolean CompetenciesCheck(String CompName,String CompGroup,String Description,String positivein,String Negativein,String status) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.recruitment);
		Min_wait();
		eleUtil.doClick(mas.competencies);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);	
		Min_wait();
		eleUtil.doSendKeys(mas.compName,CompName);
		eleUtil.doSendKeys(mas.compGroup,CompGroup);
		eleUtil.doSendKeys(mas.compDescription,Description);
		boolean selectType =eleUtil.doIsSelected(mas.behaviouralRadio);
		//performing click operation only if element is not selected
		if(selectType == false) {
			eleUtil.doClick(mas.behaviouralRadio);
		}
		Thread.sleep(500);
		eleUtil.doSendKeys(mas.positiveIndicator,positivein);
		eleUtil.doSendKeys(mas.negativeIndicator,Negativein);
		Thread.sleep(500);
boolean selectType1 = eleUtil.doIsSelected(mas.interventionNo);

		//performing click operation only if element is not selected
		if(selectType1 == false) {
			eleUtil.doClick(mas.interventionNo);
		}
		
		
		eleUtil.doSelectByVisibleText(mas.compStatus, status);
		Min_wait();
		
		
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
//		try {
//		if(eleUtil.doIsDisplayed(CL.BackButton)) {
//			eleUtil.doClick(CL.BackButton);
//			Min_wait();
//			eleUtil.doClick(CL.AddBtn);
//			Min_wait();
//		logger.info("Back button is visible");
//		}
//		}catch(Exception e) {
//			logger.info("Add button is visible");
//			eleUtil.doClick(CL.AddBtn);
//			Min_wait();
//		
//		}
		logger.info("NEGATIVE DATA CHECK");
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Name");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.compName,CompName);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Group");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.compGroup,CompGroup);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Description");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.compDescription,Description);
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.compStatus, status);
		Min_wait();
		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
			Min_wait();
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doClick(CL.BackButton);
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, CompName);
		String Comp = CompName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+CompName+"']");
		String value=eleUtil.doGetText(tablecheck).trim();
		if(Comp.equals(value.trim())) {
			logger.info("Competencies name is Approved");
		}
		else {
			logger.info("Competencies name is not shown in the Table data");
		}
		
    return true;
		
	}
	
	public void CompetenciesEdit(String SearchCompetenciesName ,String CompetenciesNameedit) throws InterruptedException {
		try {
			Max_wait();
			eleUtil.doClick(mas.masterIcon);
			Min_wait();
			eleUtil.doClick(mas.recruitment);
			Min_wait();
			eleUtil.doClick(mas.competencies);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Competencies Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, SearchCompetenciesName);
		logger.info("Search Competencies Name  is : " + SearchCompetenciesName );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchCompetenciesName+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.compName,CompetenciesNameedit);
		
		logger.info("Edit CompetenciesName  is : " + CompetenciesNameedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Recruitment-EvaluationForm action class
	 */
	
	public boolean EvaluationFormCheck(String titles,String Topics) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.recruitment);
		Min_wait();
		eleUtil.doClick(mas.EvalutionForm);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);	
		Min_wait();
		eleUtil.doSendKeys(mas.EvatitleName,titles);
		eleUtil.doSendKeys(mas.Evaquestion,Topics);
		
		Min_wait();
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		logger.info("NEGATIVE DATA CHECK");
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter title");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.EvatitleName,titles);
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter Valid Topic / Questions");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.Evaquestion,Topics);
		
		Min_wait();
		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
			Min_wait();
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doClick(CL.BackButton);
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, titles);
		String title = titles;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+titles+"']");
		String value=eleUtil.doGetText(tablecheck).trim();
		if(title.equals(value.trim())) {
			logger.info("title name is Approved");
		}
		else {
			logger.info("title name is not shown in the Table data");
		}
		
    return true;
		
	}
	
	
	
	
	public void EvaluationFormEdit(String SearchTitle ,String TitleEdit) throws InterruptedException {
		try {
			Max_wait();
			eleUtil.doClick(mas.masterIcon);
			Min_wait();
			eleUtil.doClick(mas.recruitment);
			Min_wait();
			eleUtil.doClick(mas.EvalutionForm);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Title Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, SearchTitle);
		logger.info("Search Title Name  is : " + SearchTitle );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchTitle+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.EvatitleName,TitleEdit);
		
		logger.info("Edit TitleName  is : " + TitleEdit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Recruitment-EvaluationForm action class
	 */
	
	public boolean SkillCheck(String skillName) throws InterruptedException {
		
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.recruitment);
		Max_wait();
		
		eleUtil.doClick(mas.Skill);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);	
		Min_wait();
		eleUtil.doSendKeys(mas.SkillName,skillName);
	
		Min_wait();
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		logger.info("NEGATIVE DATA CHECK");
		eleUtil.doClick(CL.saveButton);
		toasterMessage("Please Enter skill Name");
		logger.info("Negative data check  : " + toasterMessage);
		eleUtil.doSendKeys(mas.SkillName,skillName);
	
		Min_wait();
		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
			Min_wait();
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doClick(CL.BackButton);
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, skillName);
		String skil = skillName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+skillName+"']");
		String value=eleUtil.doGetText(tablecheck).trim();
		if(skil.equals(value.trim())) {
			logger.info("skill name is Approved");
		}
		else {
			logger.info("skill name is not shown in the Table data");
		}
		
    return true;
		
	}
	
	
	
	
	public void SkillEdit(String SearchSkillName,String SkillEdit) throws InterruptedException {
		try {
			Max_wait();
			eleUtil.doClick(mas.masterIcon);
			Min_wait();
			eleUtil.doClick(mas.recruitment);
			Min_wait();
			eleUtil.doClick(mas.Skill);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Skill Name ");
		
		Min_wait();
	
		eleUtil.doSendKeys(CL.searchBox, SearchSkillName);
		logger.info("Search SkillName is : " + SearchSkillName );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchSkillName+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.SkillName,SkillEdit);
		
		logger.info("Edit SkillName  is : " + SkillEdit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}

}
