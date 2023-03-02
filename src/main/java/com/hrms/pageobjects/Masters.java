package com.hrms.pageobjects;

import org.openqa.selenium.By;



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
	
	/*
	 * Master-Personal-Religion-Locators
	 */
	public static By personal=By.xpath("//*[@id='otherdetail']");
	
	public static By religionName=By.xpath("//*[@id='religionName']");
	
	
	/*
	 * Master-Personal-Nationality-Locators
	 */

	public static By nationality=By.xpath("//*[@id='nationality']");
	
	public static By nationalityName=By.xpath("//*[@id='nationalityName']");
	
	
	/*
	 * Master-Personal-Language-Locators
	 */
	public static By language=By.xpath("//*[@id='language']");
	
	public static By languageName=By.xpath("//*[@id='languageName']");
	
	/*
	 * Master-Personal-Relationship-Locators
	 */
	public static By relationship=By.xpath("//span[@id='relationship']");
	
	public static By relationshipName=By.xpath("//*[@id='relationshipName']");

	/*
	 * Master-Personal-BloodGroup-Locators
	 */
	public static By bloodGroup=By.xpath("//*[@id='bloodGroup']");
	
	public static By bloodgroupName=By.xpath("//*[@id='bloodgroupName']");
	
	/*
	 * Master-Personal-IdentificationProof-Locators
	 */
	public static By idproof=By.xpath("//*[@id='idproof']");
	
	public static By idproofName=By.xpath("//*[@id='idproofName']");
	
	
	/*
	 * Master-Education-Qualification-Locators
	 */
	public static By education=By.xpath("//*[@id='education']");
	
	public static By Qualification=By.xpath("//*[text()='Qualification']");
	
	public static By qualificationName=By.xpath("//*[@id='qualificationName']");
	
	
	
	/*
	 * Master-Education-Degree-Locators
	 */
	public static By degree=By.xpath("//*[text()='Degree']");
	
	public static By qualificationselect=By.xpath("//*[@id='quali']");
	
	public static By degreeName=By.xpath("//*[@id='degreeName']");
	
	
	/*
	 * Master-Education-Course-Locators
	 */
	public static By course=By.xpath("//*[text()='Course']");
	
	public static By degreeSelect=By.xpath("//*[@id='degreeId']");
	
	public static By courseName=By.xpath("//*[@id='courseName']");
	
	
	/*
	 * Master-Position-JobLevel-Locators
	 */
	public static By Position=By.xpath("//*[@id='job_position']");
	
	public static By jobLevel=By.xpath("//*[text()='Job Level']");
	
	public static By jobLevelName=By.xpath("//*[@id='levelName']"); 
	
	public static By hierarchySelect=By.xpath("//*[@id='weightage']"); 
	
	/*
	 * Master-Position-designation-Locators
	 */
	public static By designation=By.xpath("//span[@id='designation']");
	 
	public static By JoblevelSelect=By.xpath("//*[@id='levelId']"); 
	
	public static By designationName=By.xpath("//*[@id='designationName']"); 
	
	
	/*
	 * Master-Position-BusinessUnit-Locators
	 */
	public static By businessUnit=By.xpath("//*[text()='Business Unit']");
	 
	public static By businessUnitName=By.xpath("//*[@id='businessUnitName']"); 
	
	
	/*
	 * Master-Position-Department-Locators
	 */
	public static By department=By.xpath("//*[text()='Department']");
	 
	public static By departmentName=By.xpath("//*[@id='departmentName']"); 
	
	public static By departmentCode=By.xpath("//*[@id='departmentCode']"); 
	
	
	/*
	 * Master-Position-SubDepartment-Locators
	 */
	public static By subDepartment=By.xpath("//*[text()='Sub Department']");
	 
	public static By departmentSelect=By.xpath("//*[@id='departId']"); 
	
	public static By SubdepartmentName=By.xpath("//*[@id='divisionName']"); 

	
	/*
	 * Master-Position-CostCenter-Locators
	 */
	public static By costCenter=By.xpath("//*[text()='Cost Center ']");
	 
	public static By costCenterName=By.xpath("//*[@id='CostCenterName']"); 
	
	
	/*
	 * Master-Position-Center-Locators
	 */
	public static By Center=By.xpath("//span[@id='center']");
	 
	public static By costCenterselect=By.xpath("//select[@id='costCenterId']"); 
	
	public static By CenterName=By.xpath("//input[@id='CenterName']"); 
	
	
	/*
	 * Master-Position-PositionCategory-Locators
	 */
	public static By positionCategory=By.xpath("//*[text()='Position Category ']");
	 
	public static By positionCategoryName=By.xpath("//*[@id='empCatName']"); 
	
	public static By TaxeligibleYes=By.xpath("(//span[@class='checkmark'])[1]");
	
	public static By TaxeligibleNo=By.xpath("(//span[@class='checkmark'])[2]");
	
	
	/*
	 * Master-Position-MarketDesignation-Locators
	 */
	public static By marketDesignation=By.xpath("//*[text()='Market Designation']");
	 
	public static By marketDesignationName=By.xpath("//*[@id='mktDesigName']"); 
	
	
	/*
	 * Master-Recruitment-Consultant-Locators
	 */
	public static By recruitment=By.xpath("//*[text()='RECRUITMENT']");
	 
	public static By consultant=By.xpath("//*[text()='Consultant']"); 
	
	public static By consultantName=By.xpath("//*[@id='consultantName']");
	
	public static By consultantPerson=By.xpath("//*[@id='consultantContactPerson']");
	
	public static By consContactNo=By.xpath("//*[@id='consultantContactNo']");
	
	public static By consEmail=By.xpath("//*[@id='consultantEmail']");
	
	public static By consAddress=By.xpath("//*[@id='consultantAddress']");
	
	public static By conslocation=By.xpath("//*[@id='location']");	
	
	public static By consuserName=By.xpath("//*[@id='userName']");
	
    public static By countrySelect=By.xpath("//*[@id='countryName']");
	
	public static By stateSelect=By.xpath("//*[@id='stateName']");
	
	public static By citySelect=By.xpath("//*[@id='city']");
	
	
	/*
	 * Master-Recruitment-Competencies-Locators
	 */
	public static By competencies=By.xpath("//*[text()='COMPETENCIES']");
	
	public static By compName=By.xpath("//*[@id='compName']");
	
	public static By compGroup=By.xpath("//*[@id='compGroup']");
	
	public static By compDescription=By.xpath("//*[@id='compDescription']");
	
	public static By behaviouralRadio=By.xpath("(//span[@class='checkmark'])[1]");
	
	public static By functionalRadio=By.xpath("(//*[@class='checkmark'])[2]");
	
	public static By positiveIndicator=By.xpath("(//input[@type='text'])[4]");
	
	public static By negativeIndicator=By.xpath("//*[@id='negativeIndicator']");
	
	public static By interventionYes=By.xpath("//*[@id='Yes']");
	
	public static By interventionNo=By.xpath("(//*[@class='checkmark'])[4]");
	
	public static By mode=By.xpath("//*[text()='MODE']");
	
	public static By compStatus =By.xpath("//*[@id='compStatus']");
	

	/*
	 * Master-Recruitment-EvalutionForm-Locators
	 */
	public static By EvalutionForm=By.xpath("//*[text()='Evaluation Form']");
	
	public static By EvatitleName=By.xpath("//*[@id='com_name']");
	
	public static By Evaquestion=By.xpath("//*[@id='txt_crit_1']");
	
	public static By EvaTopicsAdd=By.xpath("//a[@class='fa fa-plus-circle mt-3']");
	
	public static By EvaTopicsTrash=By.xpath("//a[@class='fa fa-trash mt-3']");
	
	
	/*
	 * Master-Recruitment--Locators
	 */
	public static By Skill=By.xpath("//*[text()='Skill']");
	
	public static By SkillName=By.xpath("//*[@id='SkillName']");
	
	
	
	
	
	
}


