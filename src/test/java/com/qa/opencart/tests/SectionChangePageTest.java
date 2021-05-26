package com.qa.opencart.tests;

import org.testng.annotations.Test;
import com.qa.opencart.base.BaseTest;

public class SectionChangePageTest extends BaseTest{

	@Test
	public void sectionChange() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		studentmanagementPage.sectionChange();
	}
}
