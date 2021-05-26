package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DiaryPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet5";
	}
	
	@Test(dataProvider = "getdata")
	public void doDiary(String Ayear, String Grade, String Section, String Student, String Subject, String Des) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		circularPage.doDiary(Ayear,Grade,Section,Student,Subject,Des);
	}
}
