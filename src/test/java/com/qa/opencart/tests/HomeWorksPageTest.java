package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class HomeWorksPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "CircularData";
		sheetNum = "Sheet3";
	}
	
	@Test(dataProvider = "getdata")
	public void doHomeworks(String Ayear, String Tclass, String Section, String Sub, String PT, String Sdes) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		circularPage.doHomeworks(Ayear,Tclass,Section,Sub,PT,Sdes);
	}
}
