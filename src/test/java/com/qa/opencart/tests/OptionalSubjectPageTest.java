package com.qa.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class OptionalSubjectPageTest extends BaseTest{

	@BeforeClass
	public void test() {

		  sheetName = "CurriculumManagementData";
		  sheetNum = "Sheet1";
	}
	
	@Test(dataProvider="getdata")
	public void optionalSubject(String Ayear, String Subject, String Gradename, String Sectionname, String Firstname, String Empnum, String Pempnum, String DOB,String Gender, String DOH, String Religion, String Caste, String Community, String Nationality, String COB, String POB, String MT, String BG, String City, String Zip) throws IOException, InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		curriculummanagementPage.optionalSubject(Ayear,Subject,Gradename,Sectionname,Firstname,Empnum,Pempnum,DOB,Gender,DOH,Religion,Caste,Community,Nationality,COB,POB,MT,BG,City,Zip);
	}
}
