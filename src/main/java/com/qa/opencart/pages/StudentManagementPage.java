package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class StudentManagementPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By stumgmt = By.linkText("Student Management");
	private By secchange = By.linkText("Section Change");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By fgrade = By.xpath("//label[normalize-space() = 'From Grade']//following::input");
	private By fsec = By.xpath("//label[normalize-space() = 'From Section']//following::input");
	private By tsec = By.xpath("//label[normalize-space() = 'To Section']//following::input");
	private By add = By.linkText("Add an item");
	private By sel = By.xpath("(//input[@class= 'oe_list_record_selector'])[2]");
	private By select = By.xpath("//span[text() = 'Select']");
	private By csec = By.xpath("//span[text() = 'Change Section']");
	
	private By promotion = By.linkText("Promotion");
	private By create = By.xpath("//button[normalize-space() = 'Create']");
	private By tayear = By.xpath("//label[normalize-space() = 'To Academic Year']//following::input");
	private By pgrade = By.xpath("//label[normalize-space() = 'Promote Grade']//following::input");
	private By fsn = By.xpath("//label[normalize-space() = 'From Section Name']//following::input");
	private By tsn = By.xpath("//label[normalize-space() = 'To Section Name']//following::input");
	private By type = By.xpath("//label[normalize-space() = 'Type']//following::select");
	
	private By reports = By.linkText("Reports");
	private By shr = By.linkText("Students HouseList Report");
	private By gname = By.xpath("//label[normalize-space() = 'Grade Name']//following::input");
	private By sname = By.xpath("//label[normalize-space() = 'Section Name']//following::input"); 
	private By house = By.xpath("//label[normalize-space() = 'House']//following::input");
	private By vreport = By.xpath("//span[text() = 'View Report']");
	
	private By attendances =By.linkText("Attendances");
	private By bdac = By.linkText("Back Date Attendance Creation");
	private By rname = By.xpath("//label[normalize-space() = 'Register Name']//following::input");
	private By date = By.xpath("//input[@class = 'o_datepicker_input']");
	private By generate = By.xpath("//span[text() = 'Generate']");
	
	private By areport = By.linkText("Attendance Reports");
	private By creport = By.linkText("Classwise Report");
	private By fdate = By.xpath("//label[normalize-space() = 'From Date']//following::input");
	private By tdate = By.xpath("//label[normalize-space() = 'To Date']//following::input");
	private By status = By.xpath("//label[normalize-space() = 'Status']//following::select");
	
	private By aregister = By.linkText("Attendance Registers");
	
	private By dca = By.linkText("Daily Class Attendance");
	
	private By attendance = By.linkText("Attendance");
	
	private By sp = By.linkText("Students Profile");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By ite1 = By.xpath("//td[normalize-space() = 'A Krishna']");
	private By bg = By.xpath("//label[normalize-space() = 'Blood Group']//following::input");
	private By lbg = By.linkText("O +VE");
	private By save = By.xpath("//button[text() = 'Save']");
	
	private By scar = By.linkText("Student Continuous Absent Report");
	private By count = By.xpath("//label[normalize-space() = 'Count']//following::input");
	private By excel = By.xpath("//span[text() = 'Excel']");
	
	private By itd1 = By.xpath("(//td[normalize-space() = 'Grade PP2'])[1]");
	private By itd2 = By.xpath("//td[normalize-space() = 'Grade 2 Ashoka']");
	private By itd3 = By.xpath("(//input[@type = 'checkbox'])[25]");
	private By itd4 = By.xpath("//td[normalize-space() = 'Grade 12 Bio Math']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	
	public StudentManagementPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("section change")
	public void sectionChange() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(secchange, 10);
		elementUtil.doSendKeys(ayear, "2021 - 2022");
		elementUtil.doSendKeys(fgrade, "Grade 3");
		elementUtil.doSendKeys(fsec, "Ashoka");
		elementUtil.doSendKeys(tsec, "Chandanam");
	}
	
	@Step("promotion")
	public void doPromotion() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(promotion, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(tayear, "2021 - 2022");
	}
	
	@Step("students houselist report")
	public void doSHR() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(reports, 10);
		elementUtil.clickWhenReady(shr, 10);
		elementUtil.doSendKeys(ayear, "2020 -2021");
		elementUtil.doSendKeys(gname, "Grade 9");
		elementUtil.doSendKeys(sname, "Neithal");
		elementUtil.doSendKeys(house, "Prithvi");
		elementUtil.clickWhenReady(vreport, 10);
	}
	
	@Step("black date attendance creation")
	public void doBDAC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(attendances, 10);
		elementUtil.clickWhenReady(bdac, 10);
		elementUtil.doSendKeys(ayear, "2020 - 2021");
		elementUtil.doSendKeys(gname, "Grade 11");
		elementUtil.doSendKeys(rname, "Grade 11 Nalanda ");
		elementUtil.doSendKeys(date, "02032021");
		elementUtil.clickWhenReady(generate, 10);
	}
	
	@Step("classwise report")
	public void doCR() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(reports, 10);
		elementUtil.clickWhenReady(areport, 10);
		elementUtil.clickWhenReady(creport, 10);
		elementUtil.doSendKeys(fdate, "01032021");
		elementUtil.doSendKeys(tdate, "31032021");
		elementUtil.doSendKeys(ayear, "2020 -2021");
		elementUtil.doSendKeys(gname, "Grade 10");
		elementUtil.doSendKeys(sname, "Tapasaloka");
		elementUtil.selectValueFromDropDown(status, "Pending");
		elementUtil.clickWhenReady(vreport, 10);
	}
	
	@Step("delete attendance registers")
	public void deleteAttendanceRegister() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(attendances, 10);
		elementUtil.clickWhenReady(aregister, 10);
		elementUtil.clickWhenReady(itd1, 10);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete daily class attendance")
	public void deleteDCA() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(attendances, 10);
		elementUtil.clickWhenReady(dca, 10);
		elementUtil.clickWhenReady(itd2, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete attendance")
	public void deleteAttendance() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(attendances, 10);
		elementUtil.clickWhenReady(attendance, 10);
		elementUtil.clickWhenReady(itd3, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("student continuous absent report")
	public void doSCAR() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(reports, 10);
		elementUtil.clickWhenReady(areport, 10);
		elementUtil.clickWhenReady(scar, 10);
		elementUtil.doSendKeys(fdate, "03012021");
		elementUtil.doSendKeys(tdate, "31032021");
		elementUtil.doSendKeys(gname, "Grade 10");
		elementUtil.doSendKeys(sname, "Janaloka");
		elementUtil.doSendKeys(count, "2");
		elementUtil.clickWhenReady(excel, 10);
	}
	
	@Step("edit students profile")
	public void editStudentsProfile() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(sp, 10);
		elementUtil.clickWhenReady(ite1, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(bg, "O");
		elementUtil.clickWhenReady(lbg, 10);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete promotion")
	public void deletePromotion() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stumgmt, 10);
		elementUtil.clickWhenReady(promotion, 10);
		elementUtil.clickWhenReady(itd4, 20);
		elementUtil.scrollUp();
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
}
