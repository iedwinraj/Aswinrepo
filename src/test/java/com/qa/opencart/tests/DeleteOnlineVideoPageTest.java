package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteOnlineVideoPageTest extends BaseTest{

	@Test
	public void deleteOnlineVideo() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		onlinevideosPage.deleteOnlineVideo();
	}
}
