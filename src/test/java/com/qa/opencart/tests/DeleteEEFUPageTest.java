package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteEEFUPageTest extends BaseTest{

	@Test
	public void deleteEEFU() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		studentlifecyclePage.deleteEEFU();
	}
}
