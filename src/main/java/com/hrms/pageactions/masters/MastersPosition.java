package com.hrms.pageactions.masters;

import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;

public class MastersPosition extends Driverfactory {
	
	public static WebDriver driver;
	public static ElementUtils eleUtil;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersPosition(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
		
		
		 
	}

	/*
	 * Masters-Position-JobLevel action class
	 */
	
	public boolean ReligionCheck(String jobName,String Hierarchy) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.Position);
		Min_wait();
		eleUtil.doClick(mas.jobLevel);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.jobLevelName,jobName);
		
		eleUtil.doSelectByVisibleText(mas.hierarchySelect, Hierarchy);
		Min_wait();
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.jobLevelName, "");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter Job level Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.jobLevelName, jobName);
		eleUtil.doSelectByVisibleText(mas.hierarchySelect, Hierarchy);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, jobName);
		String Job = jobName;
		
		if(Job.equals(eleUtil.getElements(CL.Tabledata).get(0).getAttribute("innerText").trim())) {
			logger.info("JobLevel name is Approved");
		}
		else {
			logger.info("JobLevel name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void ReligionEdit(String SearchReligion ,String Religionedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Religion Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchReligion);
		logger.info("Search Religion Name  is : " + SearchReligion );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.countryName, Religionedit);
		logger.info("Edit Religion Name  is : " + Religionedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}

}
