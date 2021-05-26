package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class SchoolManagementPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By schmgmt = By.linkText("School Management");
	private By cta = By.linkText("Class Teacher Allocation");
	private By gkg1 = By.xpath("(//td[normalize-space() = 'Grade Kg1'])[3]");
	private By edit = By.xpath("//button[ contains ( text() , 'Edit')]");
	private By pt = By.xpath("//label[normalize-space() = 'Primary Tutor']//following::input");
	private By apt = By.linkText("Ms.Narmada");
	private By st = By.xpath("//label[normalize-space() = 'Secondary Tutor']//following::input");
	private By ast = By.linkText("Mr.N.P.Mathankumar");
	//private By sst = By.linkText("Mr.Jezreel");
	private By save = By.xpath("//button[text() = 'Save']");
	
	private By gcrtion = By.linkText("Grade Creation");
	private By create = By.xpath("//button[normalize-space() = 'Create']");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By gname = By.xpath("//label[normalize-space() = 'Grade Name']//following::input");
	private By gcode = By.xpath("//label[normalize-space() = 'Grade Code']//following::input");
	private By gfor = By.xpath("//label[normalize-space() = 'Grade For']//following::input");
	private By shift = By.xpath("//label[normalize-space() = 'Shift Name']//following::input");
	private By stream = By.xpath("//label[normalize-space() = 'Stream Name']//following::input");
	private By maxcap = By.xpath("//label[normalize-space() = 'Maximum Capacity']//following::input");
	private By sequence = By.xpath("//label[normalize-space() = 'Sequence']//following::input");
	private By grange = By.xpath("//label[normalize-space() = 'Grade range']//following::select");
	private By eligiblity = By.linkText("Age Eligibility");
	private By datefrom = By.xpath("//label[normalize-space() = 'Date From']//following::input");
	private By dateto = By.xpath("//label[normalize-space() = 'Date To']//following::input");
	
	private By env = By.linkText("Environment");
	private By cenv = By.linkText("Create Environment");
	private By etitle = By.xpath("//label[normalize-space() = 'Environment Title']//following::input");
	private By school = By.xpath("//label[normalize-space() = 'School']//following::input");
	private By grade = By.xpath("//label[normalize-space() = 'Grade']//following::input");
	private By des = By.xpath("//label[normalize-space() = 'Description']//following::textarea");
	
	private By bss = By.linkText("Business Stage Setup");
	private By bsn = By.xpath("//label[normalize-space() = 'Business Stage Name']//following::input");
	private By bsc = By.xpath("//label[normalize-space() = 'Business Stage Code']//following::input");
	private By snum = By.xpath("//label[normalize-space() = 'Sequence Number']//following::input");
	private By fee = By.xpath("//label[normalize-space() = 'Fee']//following::input");
	private By gnames = By.xpath("//label[normalize-space() = 'Grade Names']//following::input");
	private By Gname = By.linkText("Grade 8");
	
	private By calendar = By.xpath("//a[ contains ( text() , 'School Calendar')]");
	private By month = By.xpath("//button[text() = 'Month']");
	private By date = By.xpath("//div[text() = '25']");
	private By type = By.xpath("//label[normalize-space() = 'Calendar Type']//following::select");
	private By ags = By.xpath("//label[normalize-space() = 'All Grade and Section']//following::input");
	private By sdate = By.xpath("//label[normalize-space() = 'Start Date']//following::input");
	private By edate = By.xpath("//label[normalize-space() = 'End Date']//following::input");
	private By title = By.xpath("//label[normalize-space() = 'Title']//following::input");
	private By csave = By.xpath("//span[text() = 'Save']");
	
	private By ite1 = By.xpath("(//td[normalize-space() = 'Grade Kg1'])[1]");
	private By lpt = By.linkText("Ms.Janani");
	private By lst = By.linkText("Ms.Krithika");
	
	private By ite2 = By.xpath("//td[normalize-space() = 'Grade 1']");
	
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By scrtion = By.linkText("Section Creation");
	private By aai = By.linkText("Add an item");
	private By sname = By.xpath("(//input[@type = 'text'])[3]");
	private By nop = By.xpath("(//input[@type = 'text'])[7]");
	
	private By ite3 = By.xpath("//td[normalize-space() = 'Godhavari']");
	
	private By hm = By.linkText("House Management");
	private By ite4 = By.xpath("//td[normalize-space() = 'Prithvi']");
	private By color = By.xpath("//label[normalize-space() = 'House Color']//following::select 	");
	
	private By ite5 = By.xpath("//td[normalize-space() = 'Shortlisted For Registration']");
	private By lfee = By.linkText("REGISTRATION FEE");
	
	private By itd1 = By.xpath("//td[normalize-space() = 'Dummy']");
	private By itd2 = By.xpath("//td[normalize-space() = 'Krishna']");
	private By itd3 = By.xpath("(//td[normalize-space() = 'Shortlisted For Registration'])[1]");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	
			public SchoolManagementPage(WebDriver driver) {
				this.driver = driver;
				elementUtil = new ElementUtil(this.driver);
			}
			
	@Step("class teacher allocation")
	public void classteacherAllocation(String PT, String ST) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(cta, 10);
		elementUtil.clickWhenReady(gkg1, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(pt, PT);
		elementUtil.doClick(apt);
		elementUtil.doSendKeys(st, ST);
		elementUtil.doClick(ast);
		//elementUtil.clickWhenReady(sst, 10);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(save, 10);
	}

	@Step("create grade")
	public void gradeCreation(String Ayear, String Gname, String Gcode,String Gfor, String Shift, String Stream, String Maxcap, String Sequence, String Fdate, String Tdate) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(gcrtion, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(ayear, "2021 - 2022");
		elementUtil.doSendKeys(gname, "Sports Academy 2");
		elementUtil.doSendKeys(gcode, "SPA2");
		elementUtil.doSendKeys(gfor, "ICSE");
		elementUtil.doSendKeys(shift, "Evening");
		elementUtil.doSendKeys(stream, "Normal");
		elementUtil.doSendKeys(maxcap, "50");
		elementUtil.doSendKeys(sequence, "2");
		elementUtil.selectValueFromDropDown(grange, "Grade 11 - Grade 12");
		elementUtil.clickWhenReady(eligiblity, 10);
		elementUtil.doSendKeys(datefrom, "01012006");
		elementUtil.doSendKeys(dateto, "31122009");
		Thread.sleep(3000);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create environment")
	public void createEnvironment(String Title , String School, String Ayear , String Grade , String PT , String ST , String Des) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(env, 10);
		elementUtil.clickWhenReady(cenv, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(etitle, Title);
		elementUtil.doSendKeys(school, School);
		elementUtil.doSendKeys(ayear, Ayear);
		elementUtil.doSendKeys(grade, Grade);
		elementUtil.doSendKeys(pt, PT);
		elementUtil.doSendKeys(st, ST);
		elementUtil.doSendKeys(des, Des);
		Thread.sleep(10000);
		elementUtil.clickWhenReady(save, 10);
	}

	@Step("Business stage setup")
	public void businessstageSetup(String Ayear, String BSN, String BSC, String Sequence, String Fee, String Gnames) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(bss, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(ayear, Ayear);
		elementUtil.doSendKeys(bsn, BSN);
		elementUtil.doSendKeys(bsc, BSC);
		elementUtil.doSendKeys(snum, Sequence);
		elementUtil.doSendKeys(fee, Fee);
		elementUtil.doSendKeys(gnames, Gnames);
		elementUtil.clickWhenReady(Gname, 5);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("school calendar")
	public void schoolCalendar() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(calendar, 10);
		elementUtil.clickWhenReady(month, 10);
		elementUtil.clickWhenReady(date, 10);
		elementUtil.doSendKeys(ayear, "2020 - 2021");
		elementUtil.selectValueFromDropDown(type, "Holidays");
		elementUtil.clickWhenReady(ags, 10);
		elementUtil.doSendKeys(sdate, "25042021");
		elementUtil.doSendKeys(edate, "31052021");
		elementUtil.doSendKeys(title, "Summer Vacation starts...");
		elementUtil.clickWhenReady(csave, 10);
	}
	
	@Step("Edit Class Teacher Allocation")
	public void editCTA() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(cta, 10);
		elementUtil.clickWhenReady(ite1, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(pt, "Jan");
		elementUtil.doClick(lpt);
		elementUtil.doSendKeys(st, "Kri");
		elementUtil.doClick(lst);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit grade creation")
	public void EditGC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(gcrtion, 10);
		elementUtil.clickWhenReady(ite2, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(maxcap, "120");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit section creation")
	public void editSC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(scrtion, 10);
		elementUtil.clickWhenReady(ite2, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(aai, 10);
		elementUtil.doSendKeys(sname, "L");
		elementUtil.doSendKeys(nop, "30");
		elementUtil.scrollUp();
		elementUtil.waitForElementToBeVisible(save, 20);
		elementUtil.clickWhenReady(save, 20);
	}
	
	@Step("edit environment")
	public void editEnvironemnt() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(env, 10);
		elementUtil.clickWhenReady(cenv, 10);
		elementUtil.clickWhenReady(ite3, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(des, "Junior-Campus");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit House Management")
	public void editHouse() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(hm, 10);
		elementUtil.clickWhenReady(ite4, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.selectValueFromDropDown(color, "Gray");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit business stage setup")
	public void editBSS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(schmgmt);
		elementUtil.clickWhenReady(bss, 10);
		elementUtil.clickWhenReady(ite5, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(fee, "fee");
		elementUtil.clickWhenReady(lfee, 10);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete house")
	public void deleteHouse() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(hm, 10);
		elementUtil.clickWhenReady(itd1, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete environment")
	public void deleteEnvironment() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(env, 10);
		elementUtil.clickWhenReady(cenv, 10);
		elementUtil.clickWhenReady(itd2, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete BSS")
	public void deleteBSS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(schmgmt, 10);
		elementUtil.clickWhenReady(bss, 10);
		elementUtil.clickWhenReady(itd3, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
}