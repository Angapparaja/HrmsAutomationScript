package com.hrms.pageactions.masters;

import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.Utils.JavaScriptUtil;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;

public class MastersEducation extends Driverfactory{
	
	public  WebDriver driver;
	public static ElementUtils eleUtil;
	public static JavaScriptUtil js;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersEducation(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
		js=new JavaScriptUtil(driver);

	}

	/*
	 * Masters-Education-Qualification action class
	 */
	
	public boolean QualificationCheck(String QualificationName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.Qualification);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.qualificationName, QualificationName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.qualificationName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter qualification Name");
		logger.info("Negative data check  : " + toasterMessage);
		
		eleUtil.doSendKeys(mas.qualificationName, QualificationName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();

		logger.info(" TABLE DATA VALIDATION  CHECK ");
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, QualificationName);
		String Qualification = QualificationName;
		Min_wait();
		if(Qualification.equals(eleUtil.getElements(CL.Tabledata3).get(0).getAttribute("innerText").trim())) {
			logger.info("Qualification name is Approved");
		}
		else {
			logger.info("Qualification name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void QualificationEdit(String SearchQualification ,String Qualificationedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.Qualification);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Qualification Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchQualification);
		logger.info("Search Qualification Name  is : " + SearchQualification );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.qualificationName,Qualificationedit);
		logger.info("Edit Qualification Name  is : " + Qualificationedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Education-Degree action class
	 */
	
	public boolean DegreeCheck(String qulificationName, String DegreeName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.degree);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.qualificationselect, qulificationName);
		Min_wait();
		eleUtil.doSendKeys(mas.degreeName, DegreeName);
		Min_wait();
		eleUtil.doClick(CL.saveButton);
		Min_wait();
		logger.info(" DATA CHECK ");
		Min_wait();
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.qualificationselect, qulificationName);
		Min_wait();
		eleUtil.doSendKeys(mas.degreeName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter degree Name");
		logger.info("Negative data check  : " + toasterMessage);
		Min_wait();
		eleUtil.doSendKeys(mas.degreeName, DegreeName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();

		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, DegreeName);
		String Degree = DegreeName;
		
		if(Degree.equals(eleUtil.getElements(CL.Tabledata3).get(1).getAttribute("innerText").trim())) {
			logger.info("Degree name is Approved");
		}
		else {
			logger.info("Degree name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void DegreeEdit(String Searchdegree ,String degreeedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.degree);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the degree Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, Searchdegree);
		logger.info("Search degree Name  is : " + Searchdegree );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.degreeName,degreeedit);
		logger.info("Edit degree Name  is : " + degreeedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	

	
	/*
	 * Masters-Education-Course action class
	 */
	
	public boolean CourseCheck( String DegreeName,String CourseName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		Max_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.course);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.degreeSelect, DegreeName);
		Min_wait();
		eleUtil.doSendKeys(mas.courseName, CourseName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(mas.degreeSelect, DegreeName);
		Min_wait();
		eleUtil.doSendKeys(mas.courseName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter course Name");
		logger.info("Negative data check  : " + toasterMessage);
		Min_wait();
		eleUtil.doSendKeys(mas.courseName, CourseName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();

		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, CourseName);
		String Course = CourseName;
		if(Course.equals(eleUtil.getElements(CL.Tabledata3).get(1).getAttribute("innerText").trim())) {
			logger.info("Course name is Approved");
		}
		else {
			logger.info("Course name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void CourseEdit(String SearchCourse ,String Courseedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.education);
		Min_wait();
		eleUtil.doClick(mas.course);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Course Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchCourse);
		logger.info("Search Course Name  is : " + SearchCourse );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.courseName,Courseedit);
		logger.info("Edit course Name  is : " + Courseedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
}
