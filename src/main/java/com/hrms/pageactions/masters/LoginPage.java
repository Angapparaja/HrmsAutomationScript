package com.hrms.pageactions.masters;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import com.hrms.Utils.ElementUtils;
import com.hrms.commans.CommanLocators;




public class LoginPage {
	
	public WebDriver driver;
	public ElementUtils eleUtil;
	
	CommanLocators CL;

	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		eleUtil =new ElementUtils(driver);
	}
	
	public void Login(String cn, String un, String pwd) throws InterruptedException {
		//driver.navigate().refresh();
//		clientName.sendKeys(cn);
		
		eleUtil.doSendKeys(CommanLocators.clientName, cn);
		eleUtil.doSendKeys(CommanLocators.userName, un);
		
		eleUtil.doSendKeys(CommanLocators.password, pwd);
		
		eleUtil.doClick(CommanLocators.loginBtn);
	
//		loginBtn.click();
//		Thread.sleep(1500);

		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		  try {
	            WebElement element = driver.findElement(By.xpath("//div[text()=' HRMS-CORE ']"));
	            if (element.isDisplayed() || element.isEnabled())
//	                flag = false;
//	            	ElementUtils.waitForElementPresenseClick(hrms, 10);
	            eleUtil.doClick(CommanLocators.hrms);
//	            	Locationetro.click();
			
	        } catch (Exception e) {

//	            ElementUtils.waitForElementPresenseClick(selfcare, 10);
	            eleUtil.doClick(CommanLocators.selfcare);
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