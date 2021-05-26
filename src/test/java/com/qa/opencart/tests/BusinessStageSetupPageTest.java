package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class BusinessStageSetupPageTest extends BaseTest{

	@BeforeClass
	public void test() {

		sheetName = "SchoolManagementData";
		sheetNum = "Sheet4";	
	}
	
	@Test(dataProvider = "getdata")

	public void businessStagesetup(String Ayear, String BSN, String BSC, String Sequence, String Fee, String Gnames)
			throws InterruptedException {

		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"),prop.getProperty("CADMINpassword"));
		schoolmanagementPage.businessstageSetup(Ayear, BSN, BSC, Sequence, Fee, Gnames);
	}
}
