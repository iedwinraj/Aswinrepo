package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class OnlineVideosPageTest extends BaseTest{

	@BeforeClass
	public void test() {
		
		sheetName = "OnlineVideosData";
		sheetNum = "Sheet1";
	}
	
	@Test(dataProvider = "getdata")
	public void onlinevideos(String School, String Ayear, String Cls, String Section,String Time, String Title, String Des, String VURL) {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		onlinevideosPage.onlineVideo(School, Ayear, Cls, Section, Time, Title, Des, VURL);
	}
}
