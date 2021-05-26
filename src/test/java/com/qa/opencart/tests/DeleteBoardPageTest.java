package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteBoardPageTest extends BaseTest{

	@Test
	public void deleteBoard() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		administrationPage.deleteBoard();
	}
}
