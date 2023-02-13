package com.hrms.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.Utils.ElementUtils;



public class HrmsHomePage {
	private WebDriver driver;
	private ElementUtils elementUtil;
	
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-1.png']")
	WebElement dashboardIcon;
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-2.png']")
	WebElement structureIcon;
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-3.png']")
	WebElement coreHmrsIcon;
		
	@FindBy(xpath="//img[@src='resources/images/menu-icon-4.png']")
	WebElement reportsIcon;
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement mastersIcon;
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-6.png']")
	WebElement settingsIcon;

	public HrmsHomePage(WebDriver driver) {
		this.driver=driver; 
		elementUtil =new ElementUtils(driver);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyDashboardIcon() {
		return dashboardIcon.isDisplayed();
	}
	
	public boolean verifyReportsIcon() {
		return structureIcon.isDisplayed();
	}
	
	public boolean verifyMasterIcon() {
		return coreHmrsIcon.isDisplayed();
	}
	
	public boolean verifyMastersIcon() {
		return reportsIcon.isDisplayed();
	}
	
	public boolean verifySettingsIcon() {
		return settingsIcon.isDisplayed();
	}
	
	public boolean verifyLogoutIcon() {
		return settingsIcon.isDisplayed();
	}
}
