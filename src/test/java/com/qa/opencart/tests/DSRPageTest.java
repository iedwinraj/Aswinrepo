package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DSRPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "ReportsData";
		sheetNum = "Sheet1";
	}
	
	@Test(dataProvider = "getdata")
	public void dsr(String Student, String Exam) {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		reportsPage.DSR(Student, Exam);
	}
}
