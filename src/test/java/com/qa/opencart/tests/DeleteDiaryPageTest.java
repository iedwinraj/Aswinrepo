package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteDiaryPageTest extends BaseTest{

	@Test
	public void deleteDiary() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		circularPage.deleteDiary();
	} 
}