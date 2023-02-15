package com.hrms.pageactions;
import org.openqa.selenium.WebDriver;
import com.hrms.Utils.ElementUtils;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;



public class MastersGeography extends Driverfactory{
	public static WebDriver driver;
	public static ElementUtils elementUtil;
	Masters mas;
	
	
	public MastersGeography(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(driver);
		
		
		 
	}

	/*
	 * Masters-Geography-country action class
	 */
	
	public boolean CountryCheck(String CountryName) throws InterruptedException {
		
		elementUtil.doClick(mas.masterIcon);
		Max_wait();
		elementUtil.doClick(mas.AddBtn);
		
		Min_wait();
		elementUtil.doSendKeys(mas.countryName, CountryName);
		elementUtil.doClick(mas.saveButton);
		logger.info("************** DATA CHECK **************");
		if(elementUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + elementUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + elementUtil.toasterMessage);
		}
		
		elementUtil.doClick(mas.AddBtn);
		Min_wait();
		elementUtil.doSendKeys(mas.countryName, "#@$$$");  //negative check 
		elementUtil.doClick(mas.saveButton);

		logger.info("************** NEGATIVE DATA CHECK **************");
		elementUtil.toasterMessage("Please enter Country Name");
		logger.info("Negative data check  : " + elementUtil.toasterMessage);
		
		elementUtil.doSendKeys(mas.countryName, CountryName);

		logger.info("************** RESET BUTTON CHECK **************");
		if(elementUtil.doIsEnabled(mas.resetButton)) {
		elementUtil.doClick(mas.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		elementUtil.doSelectByVisibleText(mas.showentries, "100");
		Min_wait();
		logger.info("************** TABLE DATA VALIDATION  CHECK **************");
		elementUtil.doSendKeys(mas.searchBox, CountryName);
		String country = CountryName;
		
		if(country.equals(elementUtil.getElements(mas.Tabledata).get(0).getAttribute("innerText").trim())) {
			logger.info("country name is Approved");
		}
		else {
			logger.info("country name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void CountryEdit(String SearchCountry ,String countryedit) throws InterruptedException {
		try {
		elementUtil.doClick(mas.masterIcon);
		Min_wait();
		elementUtil.doClick(mas.AddBtn);
		logger.info("************** Search the Country Name **************");
		elementUtil.waitForElementPresence(mas.searchBox, 30);
		elementUtil.doSendKeys(mas.searchBox, SearchCountry);
		logger.info("**************Search Country Name  is : " + SearchCountry + "****************");
		elementUtil.doClick(mas.editBtn);
		Min_wait();
		elementUtil.doSendKeys(mas.countryName, countryedit);
		logger.info("**************Edit Country Name  is : " + countryedit + "****************");
		
		elementUtil.doClick(mas.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Geography-State action class
	 */
	
public boolean StateCheck(String CountryName,String StateName) throws InterruptedException {
		
		elementUtil.doClick(mas.masterIcon);
		Max_wait();
		elementUtil.doClick(mas.province);
		Min_wait();
		elementUtil.doClick(mas.AddBtn);
		
		Min_wait();
		elementUtil.doSelectByVisibleText(mas.countrySelect, CountryName);
		Min_wait();
		elementUtil.doSendKeys(mas.stateName, StateName);
		elementUtil.doClick(mas.saveButton);
		logger.info("************** DATA CHECK **************");
		if(elementUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + elementUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + elementUtil.toasterMessage);
		}
		
		elementUtil.doClick(mas.AddBtn);
		Min_wait();
		elementUtil.doSelectByVisibleText(mas.countrySelect, CountryName);
		elementUtil.doSendKeys(mas.stateName, "#@$$$");  //negative check 
		elementUtil.doClick(mas.saveButton);

		logger.info("************** NEGATIVE DATA CHECK **************");
		elementUtil.toasterMessage("Please enter state");
		logger.info("Negative data check  : " + elementUtil.toasterMessage);
		
		
		logger.info("************** RESET BUTTON CHECK **************");
		
		elementUtil.doSelectByVisibleText(mas.countrySelect, CountryName);
		elementUtil.doSendKeys(mas.stateName, StateName);
		if(elementUtil.doIsEnabled(mas.resetButton)) {
		elementUtil.doClick(mas.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		elementUtil.doSelectByVisibleText(mas.showentries, "100");
		Min_wait();
		logger.info("************** TABLE DATA VALIDATION  CHECK **************");
		elementUtil.doSendKeys(mas.searchBox, StateName);
		String state = StateName;
		Min_wait();
		if(state.equals(elementUtil.getElements(mas.Tabledata).get(1).getAttribute("innerText").trim())) {
			logger.info("state name is Approved");
		}
		else {
			logger.info("state name is not shown in the Table data");
		}

    return true;
		
	}


public void StateEdit(String SearchState ,String stateedit) throws InterruptedException {
	try {
	elementUtil.doClick(mas.masterIcon);
	Min_wait();
	elementUtil.doClick(mas.province);
	Min_wait();
	elementUtil.doClick(mas.AddBtn);
	logger.info("************** Search the State Name **************");
	elementUtil.waitForElementPresence(mas.searchBox, 30);
	elementUtil.doSendKeys(mas.searchBox, SearchState);
	logger.info("**************Search State Name  is : " + SearchState + "****************");
	elementUtil.doClick(mas.editBtn);
	Min_wait();
	elementUtil.doSendKeys(mas.stateName, stateedit);
	logger.info("**************Edit State Name  is : " + stateedit + "****************");
	
	elementUtil.doClick(mas.updateBtn);
	}catch(Exception e) {
		logger.info("Unable to edit the flow");
	}
	
		
	}


}



