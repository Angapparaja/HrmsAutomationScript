package com.hrms.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.Utils.ElementUtils;
import com.hrms.driverfactory.Driverfactory;

public class Masters{
	
	public static By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");

	/*
	 * Master-Geography-Country-Locators
	 */

	public static By countryName=By.xpath("//*[@id='CountyName']");
	public static By CountryTableCheck = By.xpath("((//table//tr)[2][position()=last()]//td)[2]");
	

	
	/*
	 * Master-Geography-State-Locators
	 */

	public static By province=By.xpath("//span[@id='state']");
	
	public static By stateName=By.xpath("//*[@id='StateName']");


	/*
	 * Master-Geography-City-Locators
	 */
	
	public static By city=By.xpath("//span[@id='city']");
	
	public static By cityName=By.xpath("//*[@id='cityName']");
	
	public static By population=By.xpath("//select[@id='population']");	
	
	public static By LocMetro = By.xpath("(//span[@class='checkmark'])[1]");
	
	public static By LocNonMetro = By.xpath("(//span[@class='checkmark'])[2]");
	
	
	
	/*
	 * Master-Geography-Area-Locators
	 */
	
	public static By barangay=By.xpath("//*[@id='barangay']");
	
	
	
	public static By barangayName=By.xpath("//*[@id='BarangayName']");
	
	public static By zipCode=By.xpath("//*[@id='zipcode']");
	
	public static By searchBox1=By.xpath("//input[@id='search']");
	
	/*
	 * Master-Geography-WORKLOCATION-Locators
	 */
	
	public static By workLocation=By.xpath("//*[@id='workLocation']");
	
	public static By AreaSelect=By.xpath("//*[@id='barengay']");

	public static By workLocationCode=By.xpath("//*[@id='workLocationCode']");
	
	public static By workLocationName=By.xpath("//*[@id='workLocationName']");
	
	

}
