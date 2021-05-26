package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DashboardPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "TestData";
		sheetNum = "Sheet1";
	}
	
	@Test(dataProvider = "getdata")
	public void selectMenu(String Name, String Street, String City, String State, String ZIP, String Site, String Phone, String Mobile, String Mail) {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		dashboardPage.subLink(Name,Street,City,State,ZIP,Site,Phone,Mobile,Mail);
	}
}
