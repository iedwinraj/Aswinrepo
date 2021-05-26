package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeletePEFPageTest extends BaseTest{

	@Test
	public void deletePEF() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		studentlifecyclePage.deletePEF();
	}
}
