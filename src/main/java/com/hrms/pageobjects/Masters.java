package com.hrms.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.Utils.ElementUtils;
import com.hrms.driverfactory.Driverfactory;

public class Masters{
	
	/*
	 * Masters Page comman Locators
	 * 
	 */
	public static By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	public static By AddBtn=By.xpath("//*[@id='swap']");
	
	public static By showentries =By.xpath("(//select)[2]");
	
	public static By Tabledata =By.xpath("(((//table)[1]//tr[@role]))[position()=last()]//td[position()>1]");
	
	public static By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	public static By saveButton=By.xpath("//*[text()='Save']");
	
	public static By resetButton=By.xpath("//*[text()='Reset']");
	
	public static By nextButton=By.xpath("//*[text()='Next']");
	
	public static By searchBox=By.xpath("//input[@type='search']");
	
	public static By updateBtn =By.xpath("//button[text()='Update']");
	
	public static By editBtn =By.xpath("(//a[@class='fa fa-edit'])[1]");

	/*
	 * Master-Geography-Country-Locators
	 */

	public static By countryName=By.xpath("//*[@id='CountyName']");
	
	public static By CountryTableCheck = By.xpath("((//table//tr)[2][position()=last()]//td)[2]");
	

	

	


}
