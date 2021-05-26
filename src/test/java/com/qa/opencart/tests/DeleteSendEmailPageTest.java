package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteSendEmailPageTest extends BaseTest{

	@Test
	public void deleteSendEmail() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		sendemailPage.deleteSendEmail();
	}
}
