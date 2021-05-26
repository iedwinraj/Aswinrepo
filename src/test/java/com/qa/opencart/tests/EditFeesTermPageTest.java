package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.ElementUtil;

public class EditFeesTermPageTest extends BaseTest{

	@Test
	public void editeesTerm() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		feesmanagementPage.editFeesTerm();
	}
}
