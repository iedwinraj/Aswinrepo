package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class CreateEnvironmentPageTest extends BaseTest{

	@BeforeClass
	public void test() {

		sheetName = "SchoolManagementData";
		sheetNum = "Sheet3";	
	}
	
	@Test(dataProvider = "getdata")

	public void createEnvironment(String Title, String School, String Ayear, String Grade, String PT, String ST, String Des) throws InterruptedException {

		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"),prop.getProperty("CADMINpassword"));
		schoolmanagementPage.createEnvironment(Title, School, Ayear, Grade, PT, ST, Des);
	}
	
}
