package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AnnouncementPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet1";
	}

	@Test(dataProvider="getdata")
	public void doAnnouncement(String Ayear, String Category, String Sdate, String Edate, String Message) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		circularPage.doAnnouncement(Ayear,Category,Sdate,Edate,Message);
	}
}