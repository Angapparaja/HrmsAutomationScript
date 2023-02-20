package com.hrms.pageactions.masters;

import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;

public class MastersPersonal extends Driverfactory {
	
	
	public static WebDriver driver;
	public static ElementUtils eleUtil;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersPersonal(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
		
		
		 
	}

	/*
	 * Masters-Personal-Religion action class
	 */
	
	public boolean ReligionCheck(String reliName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.religionName,reliName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.religionName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter religion Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.religionName, reliName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, reliName);
		String religion = reliName;
		
		if(religion.equals(eleUtil.getElements(CL.Tabledata).get(0).getAttribute("innerText").trim())) {
			logger.info("Religion name is Approved");
		}
		else {
			logger.info("Religion name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void ReligionEdit(String SearchReligion ,String Religionedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Religion Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchReligion);
		logger.info("Search Religion Name  is : " + SearchReligion );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.countryName, Religionedit);
		logger.info("Edit Religion Name  is : " + Religionedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Personal-Nationality action class
	 */
	
	public boolean NationalityCheck(String NatioName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.nationality);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.nationalityName,NatioName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.nationalityName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter nationality Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.nationalityName,NatioName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, NatioName);
		String nation = NatioName;
		
		if(nation.equals(eleUtil.getElements(CL.Tabledata3).get(0).getAttribute("innerText").trim())) {
			logger.info("Nationality name is Approved");
		}
		else {
			logger.info("Nationality name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void NationalityEdit(String SearchNationality ,String Nationalityedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.nationality);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Nationality Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchNationality);
		logger.info("Search Nationality Name  is : " + SearchNationality );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.nationalityName, Nationalityedit);
		logger.info("Edit Nationality Name  is : " + Nationalityedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Personal-Language action class
	 */
	
	public boolean LanguageCheck(String LanguageName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.language);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.languageName,LanguageName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.languageName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter language Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.languageName,LanguageName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, LanguageName);
		String Languages = LanguageName;
		
		if(Languages.equals(eleUtil.getElements(CL.Tabledata3).get(0).getAttribute("innerText").trim())) {
			logger.info("Languauge name is Approved");
		}
		else {
			logger.info("Languauge name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void LanguaugeEdit(String SearchLanguauge ,String Languaugeedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.language);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Languauge Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchLanguauge);
		logger.info("Search Languauge Name  is : " + SearchLanguauge );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.languageName, Languaugeedit);
		logger.info("Edit Languauge Name  is : " + Languaugeedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Personal-RelationShip action class
	 */
	
	public boolean RelationShipCheck(String relationName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.relationship);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.relationshipName,relationName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.relationshipName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter relationship Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		
		eleUtil.doSendKeys(mas.relationshipName,relationName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, relationName);
		String relations = relationName;
		
		if(relations.equals(eleUtil.getElements(CL.Tabledata1).get(0).getAttribute("innerText").trim())) {
			logger.info("relation name is Approved");
		}
		else {
			logger.info("relations name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void relationshipEdit(String Searchrelations ,String relationsedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.relationship);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the relationship Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, Searchrelations);
		logger.info("Search relationship Name  is : " + Searchrelations );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.relationshipName, relationsedit);
		logger.info("Edit relationship Name  is : " + relationsedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	/*
	 * Masters-Personal-BloodGroup action class
	 */
	
	public boolean BloodGroupCheck(String BloodGroupName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.bloodGroup);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.bloodgroupName,BloodGroupName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.bloodgroupName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Please Enter valid Blood Group");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		eleUtil.doSendKeys(mas.bloodgroupName,BloodGroupName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, BloodGroupName);
		String BloodGroup = BloodGroupName;
		
		if(BloodGroup.equals(eleUtil.getElements(CL.Tabledata1).get(0).getAttribute("innerText").trim())) {
			logger.info("BloodGroup name is Approved");
		}
		else {
			logger.info("BloodGroup name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void BloodGroupEdit(String SearchBloodGroup ,String BloodGroupedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.bloodGroup);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the BloodGroup Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchBloodGroup);
		logger.info("Search BloodGroup Name  is : " + SearchBloodGroup );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.bloodgroupName, BloodGroupedit);
		logger.info("Edit BloodGroup Name  is : " + BloodGroupedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Personal-Identification action class
	 */
	
	public boolean IdentificationProofCheck(String IdentificationProofName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(mas.masterIcon);
		Min_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.idproof);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(mas.idproofName,IdentificationProofName);
		eleUtil.doClick(CL.saveButton);
		logger.info(" DATA CHECK ");
		if(eleUtil.toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + eleUtil.toasterMessage);
		}else {
			logger.info("Duplicate check!! " + eleUtil.toasterMessage);
		}
		
		eleUtil.doClick(CL.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.idproofName, "#@$$$");  //negative check 
		eleUtil.doClick(CL.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		eleUtil.toasterMessage("Enter Idproof Name");
		logger.info("Negative data check  : " + eleUtil.toasterMessage);
		Min_wait();
//		eleUtil.doClick(CL.AddBtn);
//		Min_wait();
		eleUtil.doSendKeys(mas.idproofName,IdentificationProofName);

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CL.resetButton)) {
			eleUtil.doClick(CL.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CL.searchBox, IdentificationProofName);
		String Identification =IdentificationProofName;
		
		if(Identification.equals(eleUtil.getElements(CL.Tabledata1).get(0).getAttribute("innerText").trim())) {
			logger.info("IdentificationProof name is Approved");
		}
		else {
			logger.info("IdentificationProof name is not shown in the Table data");
		}

    return true;
		
	}
	
	
	public void IdentificationProofEdit(String SearchIdentificationProof ,String IdentificationProofedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(mas.masterIcon);
		Max_wait();
		eleUtil.doClick(mas.personal);
		Min_wait();
		eleUtil.doClick(mas.idproof);
		Min_wait();
		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the IdentificationProof Name ");
		eleUtil.waitForElementPresence(CL.searchBox, 30);
		eleUtil.doSendKeys(CL.searchBox, SearchIdentificationProof);
		logger.info("Search IdentificationProof Name  is : " + SearchIdentificationProof );
		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(mas.idproofName, IdentificationProofedit);
		logger.info("Edit IdentificationProof Name  is : " + IdentificationProofedit);
		
		eleUtil.doClick(CL.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}


}
