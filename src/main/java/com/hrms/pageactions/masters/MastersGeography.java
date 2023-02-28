package com.hrms.pageactions.masters;
import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.Utils.JavaScriptUtil;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;




public class MastersGeography extends Driverfactory{
	public  WebDriver driver;
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
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		Max_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		
		Min_wait();
		Max_wait();
		eleUtil.doSendKeys(Masters.countryName, CountryName);
		eleUtil.doClick(CommanLocators.saveButton);
		Max_wait();
		logger.info(" DATA CHECK ");
		Max_wait();
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		Max_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Max_wait();
		eleUtil.doSendKeys(Masters.countryName, "#@$$$");  //negative check 
		Max_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		Min_wait();
		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Please enter Country Name");
		logger.info("Negative data check  : " + toasterMessage);
		Max_wait();
		eleUtil.doSendKeys(Masters.countryName, CountryName);
		Max_wait();
		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Max_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.showentries, "100");
		Max_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, CountryName);
		String country = CountryName;
		Max_wait();
		if(country.equals(eleUtil.getElements(CommanLocators.Tabledata).get(0).getAttribute("innerText").trim())) {
			logger.info("country name is Approved");
		}
		else {
			logger.info("country name is not shown in the Table data");
		}
		Max_wait();
    return true;
		
	}
	
	
	public void CountryEdit(String SearchCountry ,String countryedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
		Max_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		logger.info(" Search the Country Name ");
		eleUtil.waitForElementPresence(CommanLocators.searchBox, 30);
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchCountry);
		logger.info("Search Country Name  is : " + SearchCountry );
		eleUtil.doClick(CommanLocators.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.countryName, countryedit);
		logger.info("Edit Country Name  is : " + countryedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			//logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Geography-State action class
	 */
	
public boolean StateCheck(String CountryName,String StateName) throws InterruptedException {
	Max_wait();
	eleUtil.doClick(Masters.masterIcon);
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.province);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		
		Max_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
		Min_wait();
		eleUtil.doSendKeys(Masters.stateName, StateName);
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
		eleUtil.doSendKeys(Masters.stateName, "#@$$$");  //negative check 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info(" NEGATIVE DATA CHECK ");
		toasterMessage("Please enter state");
		logger.info("Negative data check  : " + toasterMessage);
		
		
		logger.info(" RESET BUTTON CHECK ");
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
		eleUtil.doSendKeys(Masters.stateName, StateName);
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.showentries, "100");
		Min_wait();
		logger.info("TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, StateName);
		String state = StateName;
		Min_wait();
		if(state.equals(eleUtil.getElements(CommanLocators.Tabledata).get(1).getAttribute("innerText").trim())) {
			logger.info("state name is Approved");
		}
		else {
			logger.info("state name is not shown in the Table data");
		}

    return true;
		
	}


public void StateEdit(String SearchState ,String stateedit) throws InterruptedException {
	try {
		eleUtil.doClick(Masters.masterIcon);
	Min_wait();
	eleUtil.doClick(Masters.province);
	Min_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	logger.info("Search the State Name ");
	eleUtil.waitForElementPresence(CommanLocators.searchBox, 30);
	eleUtil.doSendKeys(CommanLocators.searchBox, SearchState);
	logger.info("Search State Name  is : " + SearchState);
	eleUtil.doClick(CommanLocators.editBtn);
	Min_wait();
	eleUtil.doSendKeys(Masters.stateName, stateedit);
	logger.info("Edit State Name  is : " + stateedit);
	
	eleUtil.doClick(CommanLocators.updateBtn);
	}catch(Exception e) {
//		logger.info("Unable to edit the flow");
	}
	
		
	}


/*
 * Masters-Geography-City action class
 */

public boolean CityCheck(String CountryName,String StateName,String CityName,String Populations,String Stus) throws InterruptedException {
Max_wait();
eleUtil.doClick(Masters.masterIcon);
	Max_wait();
	Max_wait();
	eleUtil.doClick(Masters.city);
	Max_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	Max_wait();
	Max_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	Min_wait();
	eleUtil.doSendKeys(Masters.cityName, CityName);
	Min_wait();
	
	if (eleUtil.doIsDisplayed(Masters.LocMetro) || eleUtil.doIsEnabled(Masters.LocMetro)) {
  	eleUtil.doClick(Masters.LocMetro);
	}
	
	eleUtil.doSelectByVisibleText(Masters.population, Populations);
	Min_wait();
	
	eleUtil.doSelectByVisibleText(CommanLocators.Status, Stus);
	Min_wait();
	
	eleUtil.doClick(CommanLocators.saveButton);
	logger.info(" DATA CHECK ");
	if(toasterMessage().equals("Saved Successfully")) {
		logger.info("Verified new data saved!! -> " + toasterMessage);
	}else {
		logger.info("Duplicate check!! " + toasterMessage);
	}
	
	eleUtil.doClick(CommanLocators.AddBtn);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	eleUtil.doSendKeys(Masters.cityName, "#$%%"); //negative check
	eleUtil.doClick(CommanLocators.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	toasterMessage("Please enter city");
	logger.info("Negative data check  : " + toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	eleUtil.doSendKeys(Masters.cityName, CityName);
	if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
		eleUtil.doClick(CommanLocators.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CommanLocators.showentries)==eleUtil.doIsEnabled(CommanLocators.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.showentries, "100");
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, CityName);
		String city = CityName;
		Min_wait();
		if(city.equals(eleUtil.getElements(CommanLocators.Tabledata).get(2).getAttribute("innerText").trim())) {
			logger.info("state name is Approved");
		}
		else {
			logger.info("state name is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, CityName);
		String city = CityName;
		Min_wait();
		if(city.equals(eleUtil.getElements(CommanLocators.Tabledata).get(2).getAttribute("innerText").trim())) {
			logger.info("City name is Approved");
		}
		else {
			logger.info("City name is not shown in the Table data");
		}
	}
	
	
	
	

return true;
	

}


<<<<<<< HEAD:src/main/java/com/hrms/pageactions/MastersGeography.java

=======
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5:src/main/java/com/hrms/pageactions/masters/MastersGeography.java
public void CityEdit(String SearchCity ,String Cityedit) throws InterruptedException {
	try {
		eleUtil.doClick(Masters.masterIcon);
	Min_wait();
	eleUtil.doClick(Masters.city);
	Min_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	logger.info("Search the City Name ");
	eleUtil.waitForElementPresence(CommanLocators.searchBox, 30);
	eleUtil.doSendKeys(CommanLocators.searchBox, SearchCity);
	logger.info("Search City Name  is : " + SearchCity);
	eleUtil.doClick(CommanLocators.editBtn);
	Min_wait();
	eleUtil.doSendKeys(Masters.cityName, Cityedit);
	logger.info("Edit City Name  is : " + Cityedit);
	
	eleUtil.doClick(CommanLocators.updateBtn);
	}catch(Exception e) {
		//logger.info("Unable to edit the flow");
	}
	
		
	}



<<<<<<< HEAD:src/main/java/com/hrms/pageactions/MastersGeography.java
=======




>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5:src/main/java/com/hrms/pageactions/masters/MastersGeography.java
/*
 * Masters-Geography-AREA action class
 */

public boolean AreaCheck(String CountryName,String StateName,String CityName,String AreaName,String Pincode,String Stus) throws InterruptedException {
Max_wait();
Max_wait();
eleUtil.doClick(Masters.masterIcon);
	Max_wait();
<<<<<<< HEAD:src/main/java/com/hrms/pageactions/MastersGeography.java
=======
	Max_wait();
<<<<<<< HEAD
	eleUtil.doClick(Masters.barangay);
=======
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5:src/main/java/com/hrms/pageactions/masters/MastersGeography.java
	eleUtil.doClick(mas.barangay);
>>>>>>> 0f1f3fdc07b073332b0ca5a6b2d3ab9394efad46
	Max_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	
	Max_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	Min_wait();
	eleUtil.doSendKeys(Masters.barangayName, AreaName);
	
	eleUtil.doSendKeys(Masters.zipCode, Pincode);
	Min_wait();
	
	eleUtil.doSelectByVisibleText(CommanLocators.Status, Stus);
	Min_wait();
	
	eleUtil.doClick(CommanLocators.saveButton);
	logger.info(" DATA CHECK ");
	if(toasterMessage().equals("Saved Successfully")) {
		logger.info("Verified new data saved!! -> " + toasterMessage);
	}else {
		logger.info("Duplicate check!! " + toasterMessage);
	}
	
	eleUtil.doClick(CommanLocators.AddBtn);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	Min_wait();
	eleUtil.doSendKeys(Masters.barangayName, "#$%%"); //negative check
	eleUtil.doClick(CommanLocators.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	toasterMessage("Enter Area Name");
	logger.info("Negative data check  : " + toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	eleUtil.doSendKeys(Masters.barangayName, AreaName);
	if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
		eleUtil.doClick(CommanLocators.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CommanLocators.showentries)==eleUtil.doIsEnabled(CommanLocators.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.showentries, "100");
		Max_wait();
		eleUtil.doSendKeys(Masters.searchBox1, "North Branch");
		Max_wait();
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CommanLocators.Tabledata1).get(4).getAttribute("innerText").trim())) {
			logger.info("Area name is Approved");
		}
		else {
			logger.info("Area name is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
		eleUtil.doSendKeys(Masters.searchBox1,"North Branch");
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CommanLocators.Tabledata1).get(4).getAttribute("innerText").trim())) {
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
		eleUtil.doClick(Masters.masterIcon);
	Min_wait();
	eleUtil.doClick(Masters.barangay);
	Min_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	logger.info("Search the Area Name ");
	eleUtil.waitForElementPresence(Masters.searchBox1, 30);
	eleUtil.doSendKeys(Masters.searchBox1, SearchArea);
	logger.info("Search Area Name  is : " + SearchArea);
	eleUtil.doClick(CommanLocators.editBtn);
	Min_wait();
	eleUtil.doSendKeys(Masters.barangayName, Areaedit);
	logger.info("Edit Area Name  is : " + Areaedit);
	
	eleUtil.doClick(CommanLocators.updateBtn);
	}catch(Exception e) {
		//logger.info("Unable to edit the flow");
	}
	
		
	}




/*
 * Masters-Geography-AREA action class
 */

public boolean WorklocationCheck(String CountryName,String StateName,String CityName,String AreaName,String locationcode,String locationName,String Stus) throws InterruptedException {
Max_wait();
Max_wait();
eleUtil.doClick(Masters.masterIcon);
	Max_wait();
	Max_wait();
	eleUtil.doClick(Masters.workLocation);
	Max_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	
	Max_wait();
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(Masters.AreaSelect, AreaName);
	Min_wait();
	eleUtil.doSendKeys(Masters.workLocationCode, locationName);
	Min_wait();

	eleUtil.doSendKeys(Masters.workLocationName, locationcode);
	Min_wait();
	
	
	eleUtil.doSelectByVisibleText(CommanLocators.Status, Stus);
	Min_wait();
	
	eleUtil.doClick(CommanLocators.saveButton);
	logger.info(" DATA CHECK ");
	if(toasterMessage().equals("Saved Successfully")) {
		logger.info("Verified new data saved!! -> " + toasterMessage);
	}else {
		logger.info("Duplicate check!! " + toasterMessage);
	}
<<<<<<< HEAD:src/main/java/com/hrms/pageactions/MastersGeography.java
	
	eleUtil.doClick(CL.AddBtn);
	Min_wait();
=======
	Max_wait();
	Min_wait();
//	driver.findElement(By.id("swap")).click();
	eleUtil.doClick(CommanLocators.AddBtn);
//	js.clickElementByJS(CL.AddBtn);
	Max_wait();
	Max_wait();
<<<<<<< HEAD
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
=======
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5:src/main/java/com/hrms/pageactions/masters/MastersGeography.java
	eleUtil.doSelectByVisibleText(CL.countrySelect, CountryName);
>>>>>>> 0f1f3fdc07b073332b0ca5a6b2d3ab9394efad46
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(Masters.AreaSelect, AreaName);
	Min_wait();
	eleUtil.doSendKeys(Masters.workLocationCode, "#$%%"); //negative check
	eleUtil.doClick(CommanLocators.saveButton);

	logger.info(" NEGATIVE DATA CHECK ");
	toasterMessage("Enter work Location Code");
	logger.info("Negative data check  : " + toasterMessage);
	
	
	logger.info(" RESET BUTTON CHECK ");
	
	eleUtil.doSelectByVisibleText(CommanLocators.countrySelect, CountryName);
	Min_wait();
	eleUtil.doSelectByVisibleText(CommanLocators.stateSelect, StateName);
	
	eleUtil.doSelectByVisibleText(CommanLocators.citySelect, CityName);
	Min_wait();
	eleUtil.doSelectByVisibleText(Masters.AreaSelect, AreaName);
	if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
		eleUtil.doClick(CommanLocators.resetButton);
	logger.info("Reset button successfully worked");
	}else {
		logger.info("Reset button is does not worked");
	}
	
	
	Min_wait();
	logger.info("TABLE DATA VALIDATION  CHECK ");
	try {
	if(eleUtil.doIsDisplayed(CommanLocators.showentries)==eleUtil.doIsEnabled(CommanLocators.showentries) ) {
		Min_wait();
		eleUtil.doSelectByVisibleText(CommanLocators.showentries, "100");
		Max_wait();
		eleUtil.doSendKeys(Masters.searchBox1, "TEST");
		Max_wait();
		String location = locationcode;
		Min_wait();
		if(location.equals(eleUtil.getElements(CommanLocators.Tabledata1).get(5).getAttribute("innerText").trim())) {
			logger.info("location code name is Approved");
		}
		else {
			logger.info("location code is not shown in the Table data");
		}
		
	}
	}catch(Exception e) {
		Min_wait();
<<<<<<< HEAD
		eleUtil.doSendKeys(CommanLocators.searchBox, "TEST");
=======
<<<<<<< HEAD:src/main/java/com/hrms/pageactions/MastersGeography.java
		eleUtil.doSendKeys(mas.searchBox1, "TEST");
=======
		eleUtil.doSendKeys(CL.searchBox, "TEST");
>>>>>>> 20ec7aafb60c75bc3b542e393315afe2042f9df5:src/main/java/com/hrms/pageactions/masters/MastersGeography.java
>>>>>>> 0f1f3fdc07b073332b0ca5a6b2d3ab9394efad46
		String Area = AreaName;
		Min_wait();
		if(Area.equals(eleUtil.getElements(CommanLocators.Tabledata1).get(5).getAttribute("innerText").trim())) {
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
		eleUtil.doClick(Masters.masterIcon);
	Min_wait();
	eleUtil.doClick(Masters.workLocation);
	Min_wait();
	eleUtil.doClick(CommanLocators.AddBtn);
	logger.info("Search the WorkLocation Code Name ");
	eleUtil.waitForElementPresence(Masters.searchBox1, 30);
	eleUtil.doSendKeys(Masters.searchBox1, Searchlocation);
	logger.info("Search worklocation Name  is : " + Searchlocation);
	eleUtil.doClick(CommanLocators.editBtn);
	Min_wait();
	eleUtil.doSendKeys(Masters.workLocationCode, Loctionedit);
	logger.info("Edit worklocation code Name  is : " + Loctionedit);
	
	eleUtil.doClick(CommanLocators.updateBtn);
	}catch(Exception e) {
		//logger.info("Unable to edit the flow");
	}
	
		
	}

}