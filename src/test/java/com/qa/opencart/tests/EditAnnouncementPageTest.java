package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditAnnouncementPageTest extends BaseTest{
	
	@Test
	public void editAnnouncement() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Principalusername"), prop.getProperty("Npassword"));
		circularPage.editAnnouncement();
	}
}
