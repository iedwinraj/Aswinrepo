package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class StoriesPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		
		sheetName = "StoriesData";
		sheetNum = "Sheet1";
	}

	@Test(priority = 1,dataProvider = "getdata")
	public void selectMenu(String Section, String Env, String Title, String Story) throws InterruptedException {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		storiesPage.createStory(Section,Env,Title,Story);
	}
	
	@Test(priority = 2)
	public void viewStory() throws InterruptedException {
		
		storiesPage.viewStory();
	}
}
