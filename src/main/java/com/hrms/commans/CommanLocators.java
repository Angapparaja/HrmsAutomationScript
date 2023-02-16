package com.hrms.commans;

import org.openqa.selenium.By;

public class CommanLocators {
	
	/*
	 * Masters Page comman Locators
	 * 
	 */
	
	public static By clientName=By.xpath("//*[@name='clientname']");
	
	public static By userName=By.xpath("//*[@name='username']");
	
	public static By password=By.xpath("//*[@name='password']");
	
	public static By loginBtn=By.xpath("//button[text()='LOGIN ']");
	
	public static By hrms=By.xpath("//div[text()=' HRMS-CORE ']");
	
	public static By selfcare=By.xpath("//div[text()=' HRMS-SELFCARE ']");
	
	
	public static By AddBtn=By.xpath("//*[@id='swap']");
	
	public static By showentries =By.xpath("//label[text()='Show ']/select");
	
	public static By Tabledata =By.xpath("(((//table)[1]//tr[@role]))[position()=last()]//td[position()>1]");
	
	public static By Tabledata1 =By.xpath("((//table)[1]//tr)[2][position()=last()]//td[position()>1]");
	
	public static By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	public static By saveButton=By.xpath("//*[text()='Save']");
	
	public static By resetButton=By.xpath("//*[text()='Reset']");
	
	public static By nextButton=By.xpath("//*[text()='Next']");
	
	public static By searchBox=By.xpath("//input[@type='search']");
	
	public static By updateBtn =By.xpath("//button[text()='Update']");
	
	public static By editBtn =By.xpath("(//a[@class='fa fa-edit'])[1]");
	
	public static By Status = By.xpath("//select[@id='status']");
	
	
	public static By countrySelect=By.xpath("//*[@id='countryId']");
	
	public static By stateSelect=By.xpath("//*[@id='stateId']");
	
	public static By citySelect=By.xpath("//*[@id='cityId']");

}
