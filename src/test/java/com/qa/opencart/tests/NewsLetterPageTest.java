package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class NewsLetterPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet4";
	}
	
	@Test(dataProvider = "getdata")
	public void newsLetter(String Ayear, String Env, String Subject, String Des) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		circularPage.newsLetter(Ayear,Env,Subject,Des);
	}
}
