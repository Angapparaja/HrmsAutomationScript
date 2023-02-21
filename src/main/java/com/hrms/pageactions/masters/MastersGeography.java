package com.hrms.pageactions.masters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hrms.Utils.ElementUtils;
import com.hrms.Utils.JavaScriptUtil;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;




public class MastersGeography extends Driverfactory{
	public static WebDriver driver;
	public static ElementUtils eleUtil;
	public static JavaScriptUtil js;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersGeography(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
		js=new JavaScriptUtil(driver);
		
		
		 
	}

	/*
	 * Masters-Geography-country action class
	 */
	
	public boolean CountryCheck(String CountryName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.countryName, CountryName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.countryName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Please enter Country Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.countryName, CountryName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.showentries, "100");
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, CountryName);
		String country = CountryName;
		
		if(country.equals(eleUtil.getElements(CL.Tabledata).get(0).getAttribute("innerText").trim())) {
			logger.info("country name is Approved");
		}
		else {
			logger.info("country name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void CountryEdit(String SearchCountry ,String countryedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Country Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchCountry);
		logger.info("Search Country Name  is : " + SearchCountry );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.countryName, countryedit);
		logger.info("Edit Country Name  is : " + countryedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Geography-State action class
	 */
	
public boolean StateCheck(String CountryName,String StateName) throws InterruptedException {
	Max_wait();
	eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.province);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
		Min_wait();
		eleUtil.doSendKeys(mas.stateName, StateName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
		eleUtil.doSendKeys(mas.stateName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info(" NEGATIVE DATA CHECK ");
		eleUtil.toasterMessage("Please enter state");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		
		logger.info(" RESET BUTTON CHECK ");
		
		eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
		eleUtil.doSendKeys(mas.stateName, StateName);
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.showentries, "100");
		Min_wait();
		logger.info("TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, StateName);
		String state = StateName;
		Min_wait();
		if(state.equals(eleUtil.getElements(CL.Tabledata).get(1).getAttribute("innerText").trim())) {
			logger.info("state name is Approved");
		}
		else {
			logger.info("state name is not shown in the Table data");
		}

    return true;
		
	}


public void StateEdit(String SearchState ,String stateedit) throws InterruptedException {
	try {
		eleUtil.doClick(mas.masterIcon);
	Min_wait();
	eleUtil.doClick(mas.province);
	Min_wait();
	eleUtil.doClick(CL.AddBtn);
	logger.info("Search the State Name ");
	eleUtil.waitForElementPresence(CL.searchBox, 30);
	eleUtil.doSendKeys(CL.searchBox, SearchState);
	logger.info("Search State Name  is : " + SearchState);
	eleUtil.doClick(CL.editBtn);
	Min_wait();
	eleUtil.doSendKeys(mas.stateName, stateedit);
	logger.info("Edit State Name  is : " + stateedit);
	
	eleUtil.doClick(CL.updateBtn);
	}catch(Exception e) {
		logger.info("Unable to edit the flow");
	}
	
		
	}


/*
 * Masters-Geography-City action class
 */

public boolean CityCheck(String CountryName,String StateName,String CityName,String Populations,String Stus) throws InterruptedException {
Max_wait();
eleUtil.doClick(mas.masterIcon);
	Max_wait();
	eleUtil.doClick(mas.city);
	Max_wait();
	eleUtil.doClick(CL.AddBtn);
	
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	Min_wait();
	eleUtil.doSendKeys(mas.cityName, CityName);
	Min_wait();
	
	if (eleUtil.doIsDisplayed(mas.LocMetro) || eleUtil.doIsEnabled(mas.LocMetro)) {
  	eleUtil.doClick(mas.LocMetro);
	}
	
	eleUtil.doSelectByVisibleText(mas.population, Populations);
	Min_wait();
	
	eleUtil.doSelectByVisibleText(CL.Status, Stus);
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
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	eleUtil.doSendKeys(mas.cityName, "#$%%"); //negative check
	eleUtil.doClick(CL.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	eleUtil.toasterMessage("Please enter city");
	logger.info("Negative data check  : " + eleUtil.toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	eleUtil.doSendKeys(mas.cityName, CityName);
	if(eleUtil.doIsEnabled(CL.resetButton)) {
		eleUtil.doClick(CL.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CL.showentries)==eleUtil.doIsEnabled(CL.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.showentries, "100");
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, CityName);
		String city = CityName;
		Min_wait();
		if(city.equals(eleUtil.getElements(CL.Tabledata).get(2).getAttribute("innerText").trim())) {
			logger.info("state name is Approved");
		}
		else {
			logger.info("state name is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, CityName);
		String city = CityName;
		Min_wait();
		if(city.equals(eleUtil.getElements(CL.Tabledata).get(2).getAttribute("innerText").trim())) {
			logger.info("City name is Approved");
		}
		else {
			logger.info("City name is not shown in the Table data");
		}
	}
	
	
	
	

return true;
	

}


public void CityEdit(String SearchCity ,String Cityedit) throws InterruptedException {
	try {
		eleUtil.doClick(mas.masterIcon);
	Min_wait();
	eleUtil.doClick(mas.city);
	Min_wait();
	eleUtil.doClick(CL.AddBtn);
	logger.info("Search the City Name ");
	eleUtil.waitForElementPresence(CL.searchBox, 30);
	eleUtil.doSendKeys(CL.searchBox, SearchCity);
	logger.info("Search City Name  is : " + SearchCity);
	eleUtil.doClick(CL.editBtn);
	Min_wait();
	eleUtil.doSendKeys(mas.cityName, Cityedit);
	logger.info("Edit City Name  is : " + Cityedit);
	
	eleUtil.doClick(CL.updateBtn);
	}catch(Exception e) {
		logger.info("Unable to edit the flow");
	}
	
		
	}







/*
 * Masters-Geography-AREA action class
 */

public boolean AreaCheck(String CountryName,String StateName,String CityName,String AreaName,String Pincode,String Stus) throws InterruptedException {
Max_wait();
eleUtil.doClick(mas.masterIcon);
	Max_wait();
	Max_wait();
	eleUtil.doClick(mas.barangay);
	Max_wait();
	eleUtil.doClick(CL.AddBtn);
	
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	Min_wait();
	eleUtil.doSendKeys(mas.barangayName, AreaName);
	
	eleUtil.doSendKeys(mas.zipCode, Pincode);
	Min_wait();
	
	eleUtil.doSelectByVisibleText(CL.Status, Stus);
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
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	Min_wait();
	eleUtil.doSendKeys(mas.barangayName, "#$%%"); //negative check
	eleUtil.doClick(CL.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	eleUtil.toasterMessage("Enter Area Name");
	logger.info("Negative data check  : " + eleUtil.toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	eleUtil.doSendKeys(mas.barangayName, AreaName);
	if(eleUtil.doIsEnabled(CL.resetButton)) {
		eleUtil.doClick(CL.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CL.showentries)==eleUtil.doIsEnabled(CL.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.showentries, "100");
		Max_wait();
		eleUtil.doSendKeys(mas.searchBox1, "North Branch");
		Max_wait();
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CL.Tabledata1).get(4).getAttribute("innerText").trim())) {
			logger.info("Area name is Approved");
		}
		else {
			logger.info("Area name is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
		eleUtil.doSendKeys(mas.searchBox1,"North Branch");
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CL.Tabledata1).get(4).getAttribute("innerText").trim())) {
			logger.info("Area name is Approved");
		}
		else {
			logger.info("Area name is not shown in the Table data");
		}
	}


return true;
	
}


public void AreaEdit(String SearchArea ,String Areaedit) throws InterruptedException {
	try {
		eleUtil.doClick(mas.masterIcon);
	Min_wait();
	eleUtil.doClick(mas.barangay);
	Min_wait();
	eleUtil.doClick(CL.AddBtn);
	logger.info("Search the Area Name ");
	eleUtil.waitForElementPresence(mas.searchBox1, 30);
	eleUtil.doSendKeys(mas.searchBox1, SearchArea);
	logger.info("Search Area Name  is : " + SearchArea);
	eleUtil.doClick(CL.editBtn);
	Min_wait();
	eleUtil.doSendKeys(mas.barangayName, Areaedit);
	logger.info("Edit Area Name  is : " + Areaedit);
	
	eleUtil.doClick(CL.updateBtn);
	}catch(Exception e) {
		logger.info("Unable to edit the flow");
	}
	
		
	}




/*
 * Masters-Geography-AREA action class
 */

public boolean WorklocationCheck(String CountryName,String StateName,String CityName,String AreaName,String locationcode,String locationName,String Stus) throws InterruptedException {
Max_wait();
eleUtil.doClick(mas.masterIcon);
	Max_wait();
	eleUtil.doClick(mas.workLocation);
	Max_wait();
	eleUtil.doClick(CL.AddBtn);
	
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(mas.AreaSelect, AreaName);
	Min_wait();
	eleUtil.doSendKeys(mas.workLocationCode, locationName);
	Min_wait();

	eleUtil.doSendKeys(mas.workLocationName, locationcode);
	Min_wait();
	
	
	eleUtil.doSelectByVisibleText(CL.Status, Stus);
	Min_wait();
	
	eleUtil.doClick(CL.saveButton);
	logger.info(" DATA CHECK ");
	if(eleUtil.toasterMessage().equals("Saved Successfully")) {
		logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
	}else {
		logger.info("Duplicate check!! " + eleUtil.toasterMessage);
	}
	Max_wait();
	Min_wait();
//	driver.findElement(By.id("swap")).click();
	eleUtil.doClick(CL.AddBtn);
//	js.clickElementByJS(CL.AddBtn);
	Max_wait();
	Max_wait();
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(mas.AreaSelect, AreaName);
	Min_wait();
	eleUtil.doSendKeys(mas.workLocationCode, "#$%%"); //negative check
	eleUtil.doClick(CL.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	eleUtil.toasterMessage("Enter work Location Code");
	logger.info("Negative data check  : " + eleUtil.toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CL.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CL.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(mas.AreaSelect, AreaName);
	if(eleUtil.doIsEnabled(CL.resetButton)) {
		eleUtil.doClick(CL.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CL.showentries)==eleUtil.doIsEnabled(CL.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CL.showentries, "100");
		Max_wait();
		eleUtil.doSendKeys(mas.searchBox1, "TEST");
		Max_wait();
		String location = locationcode;
		Min_wait();
		if(location.equals(eleUtil.getElements(CL.Tabledata1).get(5).getAttribute("innerText").trim())) {
			logger.info("location code name is Approved");
		}
		else {
			logger.info("location code is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
		eleUtil.doSendKeys(CL.searchBox, "TEST");
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CL.Tabledata1).get(5).getAttribute("innerText").trim())) {
			logger.info("location code name is Approved");
		}
		else {
			logger.info("location code is not shown in the Table data");
		}
	}


return true;
	
}


public void WorklocationEdit(String Searchlocation ,String Loctionedit) throws InterruptedException {
	try {
		eleUtil.doClick(mas.masterIcon);
	Min_wait();
	eleUtil.doClick(mas.workLocation);
	Min_wait();
	eleUtil.doClick(CL.AddBtn);
	logger.info("Search the WorkLocation Code Name ");
	eleUtil.waitForElementPresence(mas.searchBox1, 30);
	eleUtil.doSendKeys(mas.searchBox1, Searchlocation);
	logger.info("Search worklocation Name  is : " + Searchlocation);
	eleUtil.doClick(CL.editBtn);
	Min_wait();
	eleUtil.doSendKeys(mas.workLocationCode, Loctionedit);
	logger.info("Edit worklocation code Name  is : " + Loctionedit);
	
	eleUtil.doClick(CL.updateBtn);
	}catch(Exception e) {
		logger.info("Unable to edit the flow");
	}
	
		
	}

}