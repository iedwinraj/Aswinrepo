package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeletePromotionPageTest extends BaseTest{

	@Test
	public void deletePromotion() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		studentmanagementPage.deletePromotion();
	}
}
