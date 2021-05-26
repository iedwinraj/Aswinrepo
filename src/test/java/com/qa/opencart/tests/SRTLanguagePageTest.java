package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SRTLanguagePageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		
		sheetName = "CurriculumManagementData";
		/* sheetNum = "Sheet7"; */
	}

	@Test(dataProvider="getdata")
	public void srtLanguage(String Ayear, String Grade, String Lname, String Lcode) throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.srtLanguage(Ayear, Grade, Lname, Lcode);
	}
}
