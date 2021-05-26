package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class WorkSheetPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet6";
	}
	
	@Test(dataProvider = "getdata")
	public void doWorksheet(String Grade, String Section, String Subject, String Des) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		circularPage.doWorksheet(Grade,Section,Subject,Des);
	}
}
