package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.ElementUtil;

public class EditFeesTypePageTest extends BaseTest{

	@Test
	public void editFeesType() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		feesmanagementPage.editFeesType();
	}
}
