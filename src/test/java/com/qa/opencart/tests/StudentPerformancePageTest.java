package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class StudentPerformancePageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CurriculumManagementData";
		sheetNum = "Sheet2";
	}
	
	@Test(dataProvider="getdata")
	public void studentPerformance(String Schname, String Ayear, String Grade, String Section, String Subject, String Sname) throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.studentPerformance(Schname,Ayear,Grade,Section,Subject,Sname);
    }
}
