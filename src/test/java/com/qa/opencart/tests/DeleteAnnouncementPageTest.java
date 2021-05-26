package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteAnnouncementPageTest extends BaseTest{

	@Test
	public void deleteAnnouncement() {
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		circularPage.deleteAnnouncement();
	}
}
