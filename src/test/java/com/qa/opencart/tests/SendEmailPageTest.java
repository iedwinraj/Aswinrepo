package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SendEmailPageTest extends BaseTest {

	@BeforeClass
	public void test() {
		
		sheetName = "SendEmailData";
		sheetNum = "Sheet1";
	}
	
	@Test(dataProvider = "getdata")
	public void selectMenu(String Ayear, String Type, String Subject, String Content) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		sendemailPage.sendEmail(Ayear,Type,Subject,Content);
	}
}
