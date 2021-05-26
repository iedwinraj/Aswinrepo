package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class GroupPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet2";
	}
	
	@Test(dataProvider = "getdata")
	public void doGroup(String Name, String Ayear, String Tclass, String Section) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		circularPage.doGroup(Name,Ayear,Tclass,Section);
	}
}
