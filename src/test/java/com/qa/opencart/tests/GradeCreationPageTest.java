package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class GradeCreationPageTest extends BaseTest{

	@BeforeClass
	public void test() {

		sheetName = "SchoolManagementData";
		sheetNum = "Sheet2";	
	}
	
	@Test(dataProvider = "getdata")

	public void gradeCreation(String Ayear, String Gname, String Gcode, String Gfor, String Shift, String Stream, String Maxcap, String Sequence, String Fdate, String Tdate) throws InterruptedException {

		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"),prop.getProperty("Npassword"));
		schoolmanagementPage.gradeCreation(Ayear, Gname, Gcode, Gfor, Shift, Stream, Maxcap, Sequence, Fdate, Tdate);
	}
}
