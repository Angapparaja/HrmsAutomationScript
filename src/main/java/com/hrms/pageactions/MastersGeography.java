package com.hrms.pageactions;

import org.openqa.selenium.WebDriver;


import com.hrms.Utils.ElementUtils;
import com.hrms.pageobjects.Masters;







public class MastersGeography {
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
		Thread.sleep(500);
		elementUtil.doClick(mas.AddBtn);
		Thread.sleep(500);
		elementUtil.doSendKeys(mas.countryName, CountryName);
		elementUtil.doClick(mas.saveButton);
		System.out.println("************** DATA CHECK **************");
		
		if(elementUtil.toasterMessage().equals("Saved Successfully")) {
			System.out.println("Verified new data saved!! -> " + elementUtil.toasterMessage);
		}else {
			System.out.println("Duplicate check!! -> " + elementUtil.toasterMessage);
		}
		elementUtil.doClick(mas.AddBtn);
		elementUtil.doSendKeys(mas.countryName, "#@$$$");  //negative check 
		elementUtil.doClick(mas.saveButton);
		System.out.println("************** NEGATIVE DATA CHECK **************");
		
		elementUtil.toasterMessage("Please enter Country Name");
		Thread.sleep(500);
		elementUtil.doSendKeys(mas.countryName, CountryName);
		System.out.println("************** RESET BUTTON CHECK **************");
		
		if(elementUtil.doIsEnabled(mas.resetButton)) {
		elementUtil.doClick(mas.resetButton);
		System.out.println("Reset button successfully worked");
		}else {
			System.out.println("Reset button is does not worked");
		}
		Thread.sleep(500);
		elementUtil.doSelectByVisibleText(mas.showentries, "100");
		Thread.sleep(500);
		System.out.println("************** TABLE DATA VALIDATION  CHECK **************");
		
		elementUtil.doSendKeys(mas.searchBox, CountryName);
		String country = CountryName;
		Thread.sleep(500);
		if(country.equals(elementUtil.getElements(mas.Tabledata).get(0).getAttribute("innerText").trim())) {
			System.out.println("country name is Approved");
		}
		else {
			System.out.println("country name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public boolean CountryEdit(String countryedit) throws InterruptedException {
		elementUtil.doClick(mas.masterIcon);
		Thread.sleep(500);
		elementUtil.doClick(mas.AddBtn);
		Thread.sleep(500);
		elementUtil.doSendKeys(mas.searchBox, countryedit);
		Thread.sleep(500);
		elementUtil.doClick(mas.editBtn);
		elementUtil.doSendKeys(mas.countryName, "rusia");
		elementUtil.doClick(mas.updateBtn);
		return true;
			
		}


}



