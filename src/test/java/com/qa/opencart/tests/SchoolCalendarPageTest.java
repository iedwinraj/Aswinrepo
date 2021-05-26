package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SchoolCalendarPageTest extends BaseTest{

	@Test
	public void schoolCalendar() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		schoolmanagementPage.schoolCalendar();
	}
}
