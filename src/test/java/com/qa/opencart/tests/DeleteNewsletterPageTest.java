package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteNewsletterPageTest extends BaseTest{

	@Test
	public void deleteNewsletter() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		circularPage.deleteNewsletter();
	}
}
