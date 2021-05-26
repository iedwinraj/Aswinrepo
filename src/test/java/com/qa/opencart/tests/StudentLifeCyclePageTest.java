package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class StudentLifeCyclePageTest extends BaseTest{
	
	@Test
	
	public void doImport() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		studentlifecyclePage.doImport();
	}
}
