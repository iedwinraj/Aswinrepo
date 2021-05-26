package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class BlackDateAttendanceCreationPageTest extends BaseTest{

	@Test
	public void bdac() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		studentmanagementPage.doBDAC();
	}
}
