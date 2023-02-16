package com.hrms.driverfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driverfactory {
	
	public static WebDriver driver;
	public static String highlight;
	private Optionsmanagers optionsManager;
	
	public ExtentReports reports;
	public ExtentTest logs;
	
	
	public static Logger logger; 
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	/**
	 * This method is used to initialize the driver
	 * @param browserName
	 */
	@SuppressWarnings("deprecation")
	public WebDriver initDriver(Properties prop) {  
			
		
		
		
        String browserName = prop.getProperty("browser");
        highlight =prop.getProperty("highlight"); 
        
		System.out.println("browser name is:"+browserName);
		
		optionsManager =new Optionsmanagers(prop);
		
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
		}
		else {
			System.out.println("please pass the right browserName" +browserName);
		}
		
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();	
//		driver.get(prop.getProperty("url"));	
//		return driver;
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().get(prop.getProperty("url"));
		
		return getDriver();
	}
	public WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	/**
	 * This method is used to initialize the properties on the basis of given env name
	 * 
	 */
	public Properties initProperties() {
		
		
		
		Properties prop =null;
		FileInputStream ip=null;
		
		String env =System.getProperty("env");//mvn clean install 
		
		try {
			logger = Logger.getLogger("HRMS");
			PropertyConfigurator.configure("Log4j.properties");
			
		if(env==null) {
			System.out.println("Running on Environment:PROD env...");
			ip = new FileInputStream("./src/test/resources/Config/Config.properties");
			
		}
		else {
			System.out.println("Running On Environment "+ env);
			switch(env) {
//			case "ba":
//				ip = new FileInputStream("./src/test/resources/config/ba.config.properties");
//				break;
			case "dev":
				ip = new FileInputStream("./src/test/resources/config/dev.Config.properties");
			break;	
			case "stage":
				ip = new FileInputStream("./src/test/resources/config/stage.Config.properties");
			break;
			default:
				System.out.println("No env found....");
				throw new Exception("NOENVFOUNDEXCEPTION");
					
			}
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			prop =new Properties();
			prop.load(ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
		
	}
	
public static int max = 1100;
public static int min = 500;
	public static void Max_wait() throws InterruptedException {
	Thread.sleep(max);
	}
	
	public static void Min_wait() throws InterruptedException {
	Thread.sleep(min);
	}
	
	
	/**
	 * TAKE A SCREENSHOT
	 */
	public String getScreenshot() {
		File srcFile =((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"/screenshot/"+ System.currentTimeMillis()+".png";
		
		File destination =new File(path);
		
		try {
			FileUtils.copyFile(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
		
	}

}
