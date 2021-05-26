package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ClassTeacherAllocationPageTest extends BaseTest{

	@BeforeClass
	public void test() {

		sheetName = "SchoolManagementData";
		sheetNum = "Sheet1";	
	}
	
	@Test(dataProvider = "getdata")
	  
	public void classteacherAllocation(String PT, String ST) throws InterruptedException  {
	
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"),prop.getProperty("CADMINpassword"));
		schoolmanagementPage.classteacherAllocation(PT,ST);
	}
}
