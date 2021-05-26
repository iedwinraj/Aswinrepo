package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditBoardPageTest extends BaseTest{
	
	@Test
	public void editBoard() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		administrationPage.editBoard();
	}
}
