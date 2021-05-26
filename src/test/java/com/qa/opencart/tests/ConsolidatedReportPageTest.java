package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ConsolidatedReportPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CurriculumManagementData";
		sheetNum = "Sheet4";
	}
	
	@Test(dataProvider="getdata")
	public void consolidatedReport(String Grade, String Section, String TOE, String Month, String Examnum, String Subject) throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.consolidatedReport(Grade,Section,TOE,Month,Examnum,Subject);
    }
}
