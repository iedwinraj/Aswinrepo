package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditNewsletterPageTest extends BaseTest{

	@Test
	public void editNewsletter() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		circularPage.editNewsletter();
	}
}
