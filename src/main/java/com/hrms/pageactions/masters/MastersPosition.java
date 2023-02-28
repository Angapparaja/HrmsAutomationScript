package com.hrms.pageactions.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hrms.Utils.ElementUtils;
import com.hrms.commans.CommanLocators;
import com.hrms.driverfactory.Driverfactory;
import com.hrms.pageobjects.Masters;

public class MastersPosition extends Driverfactory {
	
	public WebDriver driver;
	public static ElementUtils eleUtil;
	Masters mas;
	CommanLocators CL;
	
	
	public MastersPosition(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
		
		
		 
	}

	/*
	 * Masters-Position-JobLevel action class
	 */
	
	public boolean JoblevelCheck(String jobName,String Hierarchy) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.jobLevel);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		
		Min_wait();
		eleUtil.doSendKeys(Masters.jobLevelName,jobName);
		
		eleUtil.doSelectByVisibleText(Masters.hierarchySelect, Hierarchy);
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.jobLevelName, "");  //negative check 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Job level Name");
		logger.info("Negative data check  : " + toasterMessage);
		
		eleUtil.doSendKeys(Masters.jobLevelName, jobName);
		eleUtil.doSelectByVisibleText(Masters.hierarchySelect, Hierarchy);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, jobName);
		String Job = jobName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+jobName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(Job.equals(value.trim())) {
			logger.info("JobLevel name is Approved");
		}
		else {
			logger.info("JobLevel name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void JoblevelEdit(String SearchJoblevel ,String Jobleveledit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.jobLevel);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Joblevel Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchJoblevel);
		logger.info("Search Joblevel Name  is : " + SearchJoblevel );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchJoblevel+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.jobLevelName, Jobleveledit);
		logger.info("Edit jobLevelName  is : " + Jobleveledit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Position-Designation action class
	 */
	
	public boolean DesignationCheck(String Joblevel,String DesignationName) throws InterruptedException {
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		Min_wait();
		eleUtil.doClick(Masters.designation);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.JoblevelSelect, Joblevel);
		Min_wait();
		eleUtil.doSendKeys(Masters.designationName,DesignationName);
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.JoblevelSelect, Joblevel);
		Min_wait();
		eleUtil.doSendKeys(Masters.designationName, "");  //negative check 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Designation");
		logger.info("Negative data check  : " + toasterMessage);
		
		eleUtil.doSendKeys(Masters.designationName, DesignationName);
		
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, DesignationName);
		String Designation = DesignationName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+DesignationName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(Designation.equals(value.trim())) {
			logger.info("Designation name is Approved");
		}
		else {
			logger.info("Designation name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void DesignationEdit(String SearchDesignation ,String Designationedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.designation);
			Min_wait();
//		eleUtil.doClick(CL.AddBtn);
		logger.info(" Search the Designation Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchDesignation);
		logger.info("Search Designation Name  is : " + SearchDesignation );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchDesignation+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.designationName, Designationedit);
		logger.info("Edit Designation  is : " + Designationedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Position-BusinessUnit action class
	 */
	
	public boolean BusinessUnitCheck(String BusinessUnitName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.businessUnit);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.businessUnitName,BusinessUnitName);
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " + toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.businessUnitName, "$#%");  //negative check 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Business Unit Name");
		logger.info("Negative data check  : " + toasterMessage);
		
		eleUtil.doSendKeys(Masters.businessUnitName, BusinessUnitName);
		
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, BusinessUnitName);
		String BusinessUnit = BusinessUnitName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+BusinessUnitName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(BusinessUnit.equals(value.trim())) {
			logger.info("BusinessUnit name is Approved");
		}
		else {
			logger.info("BusinessUnit name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void BusinessUnitEdit(String SearchBusinessUnit ,String BusinessUnitedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.businessUnit);
			Min_wait();

		logger.info(" Search the BusinessUnit Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchBusinessUnit);
		logger.info("Search BusinessUnit Name  is : " + SearchBusinessUnit );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchBusinessUnit+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.businessUnitName, BusinessUnitedit);
		logger.info("Edit BusinessUnit  is : " + BusinessUnitedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Position-Department action class
	 */
	
	public boolean DepartmentCheck(String DepartmentName,String DepartmentCode) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.department);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.departmentName,DepartmentName);
		Min_wait();
		eleUtil.doSendKeys(Masters.departmentCode,DepartmentCode);
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.departmentName,""); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Department Name");
		logger.info("Negative data check  : " + toasterMessage);
		
		eleUtil.doSendKeys(Masters.departmentName,DepartmentName);
		Min_wait();
		eleUtil.doSendKeys(Masters.departmentCode,DepartmentCode);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, DepartmentName);
		String Department = DepartmentName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+DepartmentName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(Department.equals(value.trim())) {
			logger.info("Department name is Approved");
		}
		else {
			logger.info("Department name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void DepartmentEdit(String SearchDepartment ,String Departmentedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.department);
			Min_wait();

		logger.info(" Search the department Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchDepartment);
		logger.info("Search BusinessUnit Name  is : " + SearchDepartment );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchDepartment+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.departmentName, Departmentedit);
		logger.info("Edit department  is : " + Departmentedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	
	/*
	 * Masters-Position-SubDepartment action class
	 */
	
	public boolean SubDepartmentCheck(String DepartmentName,String SubDepartment) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.subDepartment);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.departmentSelect,DepartmentName);
		Min_wait();
		eleUtil.doSendKeys(Masters.SubdepartmentName,SubDepartment);
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.departmentSelect,DepartmentName);
		Min_wait();
		eleUtil.doSendKeys(Masters.SubdepartmentName,""); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter sub department Name");
		logger.info("Negative data check  : " + toasterMessage);
		
	
		eleUtil.doSendKeys(Masters.SubdepartmentName,SubDepartment);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, SubDepartment);
		String Department = SubDepartment;
		Min_wait();
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+DepartmentName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(Department.equals(value.trim())) {
			logger.info("SubDepartment name is Approved");
		}
		else {
			logger.info("SubDepartment name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void SubDepartmentEdit(String SearchSubDepartment ,String SubDepartmentedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.subDepartment);
			Min_wait();

		logger.info(" Search the Subdepartment Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchSubDepartment);
		logger.info("Search SubDepartment Name  is : " + SearchSubDepartment );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchSubDepartment+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.SubdepartmentName, SubDepartmentedit);
		logger.info("Edit Subdepartment  is : " + SubDepartmentedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}

	
	
	/*
	 * Masters-Position-CostCenter action class
	 */
	
	public boolean CostCenterCheck(String CostCenterName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.costCenter);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.costCenterName,CostCenterName);
		Min_wait();
		
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
	
		eleUtil.doSendKeys(Masters.costCenterName,"$#$%#"); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter CostCenter Name");
		logger.info("Negative data check  : " + toasterMessage);
		
	
		eleUtil.doSendKeys(Masters.costCenterName,CostCenterName);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, CostCenterName);
		String CostCenter = CostCenterName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+CostCenterName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(CostCenter.equals(value.trim())) {
			logger.info("CostCenter name is Approved");
		}
		else {
			logger.info("CostCenter name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void CostCenterEdit(String SearchCostCenter ,String CostCenteredit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.costCenter);
			Min_wait();

		logger.info(" Search the CostCenter Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchCostCenter);
		logger.info("Search CostCenter Name  is : " + SearchCostCenter );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchCostCenter+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.costCenterName, CostCenteredit);
		logger.info("Edit costCenterName  is : " + CostCenteredit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Position-Center action class
	 */
	
	public boolean CenterCheck(String CostCenterName,String centerName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.Center);
		Min_wait();
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.costCenterselect,CostCenterName);
		Min_wait();
		eleUtil.doSendKeys(Masters.CenterName,centerName);
		Min_wait();
		
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		eleUtil.doSelectByVisibleText(Masters.costCenterselect,CostCenterName);
		Min_wait();
		eleUtil.doSendKeys(Masters.CenterName,"$#$%#"); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Center Name");
		logger.info("Negative data check  : " + toasterMessage);
		
	
		eleUtil.doSendKeys(Masters.CenterName,centerName);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, centerName);
		String CostCenter = centerName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+centerName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(CostCenter.equals(value.trim())) {
			logger.info("Center name is Approved");
		}
		else {
			logger.info("Center name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void CenterEdit(String SearchCenter ,String Centeredit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.Center);
			Min_wait();

		logger.info(" Search the Center Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchCenter);
		logger.info("Search Center Name  is : " + SearchCenter );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchCenter+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.CenterName, Centeredit);
		logger.info("Edit CenterName  is : " + Centeredit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Position-PositionCategory action class
	 */
	
	public boolean PositionCategoryCheck(String PositionCategoryName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.positionCategory);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		//TaxeligibleYes
		eleUtil.doSendKeys(Masters.positionCategoryName,PositionCategoryName);
		Min_wait();
		eleUtil.doClick(Masters.TaxeligibleYes);
//		 if (eleUtil.doIsDisplayed(mas.TaxeligibleYes) || eleUtil.doIsEnabled(mas.TaxeligibleYes)) {
// boolean selectType =eleUtil.doIsEnabled(mas.TaxeligibleYes);
//		if(selectType == false) {
//		eleUtil.doClick(mas.TaxeligibleYes);	
//		}
//   } 
		Min_wait();
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK -- TaxeligibleYes ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		Min_wait();
		//TaxeligibleNo
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(Masters.positionCategoryName,PositionCategoryName);
		Min_wait();
		eleUtil.doClick(Masters.TaxeligibleNo);	
//		 if (eleUtil.doIsDisplayed(mas.TaxeligibleNo) || eleUtil.doIsEnabled(mas.TaxeligibleNo)) {
// boolean selectType =eleUtil.doIsEnabled(mas.TaxeligibleNo);
//		if(selectType == false) {
//		eleUtil.doClick(mas.TaxeligibleNo);	
//		}
//   } 
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK -- TaxeligibleNo");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		
		eleUtil.doSendKeys(Masters.positionCategoryName,"$#$%#"); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Position Category Name");
		logger.info("Negative data check  : " + toasterMessage);
		
	
		eleUtil.doSendKeys(Masters.positionCategoryName,PositionCategoryName);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, PositionCategoryName);
		String PositionCategory = PositionCategoryName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+PositionCategoryName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(PositionCategory.equals(value.trim())) {
			logger.info("PositionCategory name is Approved");
		}
		else {
			logger.info("PositionCategory name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void PositionCategoryEdit(String SearchPositionCategory ,String PositionCategoryedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.positionCategory);
			Min_wait();

		logger.info(" Search the PositionCategory Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchPositionCategory);
		logger.info("Search positionCategory Name  is : " + SearchPositionCategory );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchPositionCategory+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.positionCategoryName, PositionCategoryedit);
		logger.info("Edit positionCategoryName  is : " +PositionCategoryedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}
	
	
	/*
	 * Masters-Position-MarketDesignation action class
	 */
	
	public boolean MarketDesignationCheck(String MarketDesignationName) throws InterruptedException {
		Max_wait();
		Max_wait();
		eleUtil.doClick(Masters.masterIcon);
		Min_wait();
		eleUtil.doClick(Masters.Position);
		Min_wait();
		eleUtil.doClick(Masters.marketDesignation);
		Min_wait();
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
		
		eleUtil.doSendKeys(Masters.marketDesignationName,MarketDesignationName);
		Min_wait();
		
		eleUtil.doClick(CommanLocators.saveButton);
		logger.info(" DATA CHECK ");
		if(toasterMessage().equals("Saved Successfully")) {
			logger.info("Verified new data saved!! -> " + toasterMessage);
		}else {
			logger.info("Duplicate check!! " +toasterMessage);
		}
		
		eleUtil.doClick(CommanLocators.AddBtn);
		Min_wait();
	
		eleUtil.doSendKeys(Masters.marketDesignationName,"$#$%#"); //negative check 
		Min_wait(); 
		eleUtil.doClick(CommanLocators.saveButton);

		logger.info("NEGATIVE DATA CHECK");
		toasterMessage("Enter Center Name");
		logger.info("Negative data check  : " + toasterMessage);
		
	
		eleUtil.doSendKeys(Masters.marketDesignationName,MarketDesignationName);
		Min_wait();

		logger.info(" RESET BUTTON CHECK ");
		if(eleUtil.doIsEnabled(CommanLocators.resetButton)) {
			eleUtil.doClick(CommanLocators.resetButton);
		logger.info("Reset button successfully worked");
		}else {
			logger.info("Reset button is does not worked");
		}
		
		Min_wait();
		logger.info(" TABLE DATA VALIDATION  CHECK ");
		eleUtil.doSendKeys(CommanLocators.searchBox, MarketDesignationName);
		String MarketDesignation = MarketDesignationName;
		By tablecheck =By.xpath("(//table)[1]//tr//td[text()= '"+MarketDesignationName+"']");
		String value=eleUtil.doGetText(tablecheck);
		if(MarketDesignation.equals(value.trim())) {
			logger.info("MarketDesignation name is Approved");
		}
		else {
			logger.info("MarketDesignation name is not shown in the Table data");
		}
		
		

    return true;
		
	}
	
	
	public void MarketDesignationEdit(String SearchMarketDesignation ,String MarketDesignationedit) throws InterruptedException {
		try {
			Min_wait();
			eleUtil.doClick(Masters.masterIcon);
			Min_wait();
			eleUtil.doClick(Masters.Position);
			Min_wait();
			eleUtil.doClick(Masters.marketDesignation);
			Min_wait();

		logger.info(" Search the MarketDesignation Name ");
		
		Min_wait();
		Min_wait();
		eleUtil.doSendKeys(CommanLocators.searchBox, SearchMarketDesignation);
		logger.info("Search MarketDesignation Name  is : " + SearchMarketDesignation );
		By TableCheck =By.xpath("(//table)[1]//tr//td[text()= '"+SearchMarketDesignation+"']//parent::tr//td[last()]//a");
		eleUtil.doClick(TableCheck);
//		eleUtil.doClick(CL.editBtn);
		Min_wait();
		eleUtil.doSendKeys(Masters.marketDesignationName,MarketDesignationedit);
		logger.info("Edit MarketDesignation  is : " + MarketDesignationedit);
		
		eleUtil.doClick(CommanLocators.updateBtn);
		}catch(Exception e) {
			logger.info("Unable to edit the flow");
		}
		
			
		}

}
