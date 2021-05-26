package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditStoryPageTest extends BaseTest{

	@Test
	public void editStroy() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Principalusername"), prop.getProperty("Npassword"));
		storiesPage.editStory();
	}
}
