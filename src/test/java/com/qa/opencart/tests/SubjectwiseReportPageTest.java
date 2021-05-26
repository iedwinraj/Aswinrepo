package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SubjectwiseReportPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CurriculumManagementData";
		sheetNum = "Sheet3";
	}
	
	@Test(dataProvider="getdata")
	public void subjectwiseReport(String Grade, String Section, String TOE, String Month, String Examnum, String Subject) throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.subjectwiseReport(Grade,Section,TOE,Month,Examnum,Subject);
    }
}
