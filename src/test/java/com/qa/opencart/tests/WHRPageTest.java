package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class WHRPageTest extends BaseTest{

		@BeforeClass
		public void test() {
			
			sheetName = "ReportsData";
			sheetNum = "Sheet2";
		}
		
		@Test(dataProvider = "getdata")
		public void whr(String School, String Ayear, String Grade, String Student) {
			
			loginPage.doSelect();
			loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
			reportsPage.WHR(School, Ayear, Grade, Student);
		}
}
