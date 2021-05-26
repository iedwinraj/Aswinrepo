package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ApprovePortionsPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		/*
		 * sheetName = "CurriculumManagementData"; sheetNum = "Sheet5"
		 */
	}
	
	@Test(dataProvider="getdata")
	public void approvePortions() throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.approvePortions();
	}
}
