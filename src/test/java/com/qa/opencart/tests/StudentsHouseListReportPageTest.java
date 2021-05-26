package com.qa.opencart.tests;

import org.testng.annotations.Test;
import com.qa.opencart.base.BaseTest;

public class StudentsHouseListReportPageTest extends BaseTest{

	@Test
	public void shr() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		studentmanagementPage.doSHR();
	}
}
