package com.hrms.pageactions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.hrms.Utils.ElementUtils;




public class LoginPage {
	
	private WebDriver driver;
	private ElementUtils elementUtil;


	public static By clientName=By.xpath("//*[@name='clientname']");
	
	public static By userName=By.xpath("//*[@name='username']");
	
	public static By password=By.xpath("//*[@name='password']");
	
	public static By loginBtn=By.xpath("//button[text()='LOGIN ']");
	
	
	public static By hrms=By.xpath("//div[text()=' HRMS-CORE ']");
	
	public static By selfcare=By.xpath("//div[text()=' HRMS-SELFCARE ']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		elementUtil =new ElementUtils(driver);
	}
	
	public void Login(String cn, String un, String pwd) throws InterruptedException {
		//driver.navigate().refresh();
//		clientName.sendKeys(cn);
		
		elementUtil.doSendKeys(clientName, cn);
		elementUtil.doSendKeys(userName, un);
		
		elementUtil.doSendKeys(password, pwd);
		
		elementUtil.doClick(loginBtn);
	
//		loginBtn.click();
//		Thread.sleep(1500);

		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		  try {
	            WebElement element = driver.findElement(By.xpath("//div[text()=' HRMS-CORE ']"));
	            if (element.isDisplayed() || element.isEnabled())
//	                flag = false;
//	            	ElementUtils.waitForElementPresenseClick(hrms, 10);
	            elementUtil.doClick(hrms);
//	            	Locationetro.click();
			
	        } catch (Exception e) {

//	            ElementUtils.waitForElementPresenseClick(selfcare, 10);
	            elementUtil.doClick(selfcare);
	        } 
			
		
//		ElementUtil.waitForElementPresenseClick(hrms, 10);
//		hrms.click();
		
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		
		
		while(I1.hasNext())
		{
			
		String child_window=I1.next();
		System.out.println(child_window);

		if(!parent.equals(child_window))
		{
			
			driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		}
		
		}
		return ;
		
	}

}
