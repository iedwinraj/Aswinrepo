package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditOnlineVideoPageTest extends BaseTest{

	@Test
	public void editOnlineVideo() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Principalusername"), prop.getProperty("Npassword"));
		onlinevideosPage.editOnlineVideo();
	}
}
