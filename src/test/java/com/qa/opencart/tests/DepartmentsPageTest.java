package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DepartmentsPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "EmployeesData";
		sheetNum = "Sheet1";
	}
	
	@Test(dataProvider = "getdata")
	public void createDepartment(String SN, String DN, String DC, String PD, String RMN) {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"),prop.getProperty("CADMINpassword"));
		employeesPage.createDepartment(SN,DN,DC,PD,RMN);
	}
}
