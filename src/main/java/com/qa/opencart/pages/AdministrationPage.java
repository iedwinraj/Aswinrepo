package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class AdministrationPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locators
	private By chat = By.xpath("//a[@title='Conversations']");
	private By administration = By.linkText("Administration");
	private By users = By.linkText("Users");
	private By ite1 = By.xpath("//td[normalize-space() = 'Sarayu Ganesan']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By doj = By.xpath("//label[normalize-space() = 'Date of Joining']//following ::input");
	private By save = By.xpath("//button[text() = 'Save']");
	
	private By ats = By.linkText("Academic Teaching Staff");
	private By ite2 = By.xpath("//td[normalize-space() = 'Bharathi']");
	private By HG = By.xpath("//label[normalize-space() = 'Homeroom Grade']//following::input");
	private By HS = By.xpath("//label[normalize-space() = 'Homeroom Section']//following::input");
	private By lHS = By.linkText("Maharaloka");
	
	private By om = By.linkText("Other Masters");
	private By ayear = By.linkText("Academic Year");
	private By ite3 = By.xpath("//td[normalize-space() = '2021 - 2022']");
	private By sdate = By.xpath("//label[normalize-space() = 'Start Date']//following::input");
	
	private By shift = By.linkText("Shift");
	private By ite4 = By.xpath("//td[normalize-space() = 'General']");
	private By sn = By.xpath("//label[normalize-space() = 'Shift Name']//following::input");
	private By sid = By.xpath("//label[normalize-space() = 'Shift ID']//following::input");
	
	private By stream = By.linkText("Stream");
	private By ite5 = By.xpath("//td[normalize-space() = 'Science4']");
	private By stn = By.xpath("//label[normalize-space() = 'Stream Name']//following::input");
	private By stid = By.xpath("//label[normalize-space() = 'Stream ID']//following::input");
	
	private By board = By.linkText("Board");
	private By ite6 = By.xpath("//td[normalize-space() = 'State']");
	private By name = By.xpath("//label[normalize-space() = 'Name']//following::input");
	private By code = By.xpath("//label[normalize-space() = 'Code']//following::input");
	
	private By country = By.linkText("Country");
	private By ite7 = By.xpath("//td[normalize-space() = 'Afghanisthan']");
	private By cn =By.xpath("//label[normalize-space() = 'Country Name']//following::input");
	
	private By state = By.linkText("State");
	private By ite8 = By.xpath("//td[normalize-space() = 'Maharashtra']");
	private By SN = By.xpath("//label[normalize-space() = 'State Name']//following::input");
	private By sc = By.xpath("//label[normalize-space() = 'State Code']//following::input");
	
	private By district = By.linkText("District");
	private By ite9 = By.xpath("//td[normalize-space() = 'Dibang Valley']");
	private By dn = By.xpath("//label[normalize-space() = 'District Name']//following::input");
	private By dc = By.xpath("//label[normalize-space() = 'District Code']//following::input");
	
	private By religion = By.linkText("Religion");
	private By ite10 = By.xpath("//td[normalize-space() = 'African Traditional & Diasporic']");
	private By rn = By.xpath("//label[normalize-space() = 'Religion Name']//following::input");
	private By rc = By.xpath("//label[normalize-space() = 'Religion Code']//following::input");
	
	private By community = By.linkText("Community");
	private By ite11 = By.xpath("//td[normalize-space() = 'Others']");
	private By cc = By.xpath("//label[normalize-space() = 'Community Code']//following::input");
	private By CN = By.xpath("//label[normalize-space() = 'Community Name']//following::input");
	
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By nationality = By.linkText("Nationality");
	private By ite12 = By.xpath("//td[normalize-space() = 'Barbadian']");
	
	private By efs = By.linkText("Enquiry Follow-up Status");
	private By ite13 = By.xpath("//td[normalize-space() = 'Telephonic Counselling Booked']");
	private By cs = By.xpath("//label[normalize-space() = 'Current Status']//following::input"); 
	
	private By efm = By.linkText("Enquiry Follow-up Mode");
	private By ite14 = By.xpath("//td[normalize-space() = 'Message']");
	private By mode = By.xpath("//label[normalize-space() = 'Mode']//following::input");
	
	private By agc = By.linkText("Admission Grade Conf");
	private By ite15 = By.xpath("//td[normalize-space() = 'Grade PP1']");
	private By fdate = By.xpath("//label[normalize-space() = 'From Date']//following::input");
	
	private By com = By.linkText("Cut-Off Master");
	private By ite16 = By.xpath("//td[normalize-space() = 'CHSV Chettinad Hari Shree Vidyalayam School']");
	private By cot = By.xpath("//label[normalize-space() = 'Cut-Off Time']//following::input");
	
	private By org = By.linkText("Organizations");
	private By ite17 = By.xpath("//td[normalize-space() = 'Chettinad Vidya Mandir - Karur']");
	private By faa = By.xpath("//input[@name = 'is_foreafternoon_attendance']");
	
	private By es = By.linkText("Enquiry Source");
	private By ite18 = By.xpath("//td[normalize-space() = 'Walk In Enquiry']");
	private By ecn = By.xpath("//label[normalize-space() = 'Enquiry Category Name']//following::input");
	
	private By ite19 = By.xpath("//td[normalize-space() = 'Dummy']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	private By ite20 = By.xpath("//td[normalize-space() = 'CBE Chettinad Vidya Mandir - Coimbatore School']");
	private By itd = By.xpath("//td[normalize-space() = 'Nicobar']");
	private By al = By.linkText("Account Access Level");
	
	private By create = By.xpath("//button[contains ( text() , 'Create')]");
	
	//2. Constructor of page class:
	
	public AdministrationPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("edit user")
	public void editUser() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(users, 10);
		elementUtil.clickWhenReady(ite1, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(doj, "05062017");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("Edit ATS")
	public void editATS() {

		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(ats, 10);
		elementUtil.clickWhenReady(ite2, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(HG, "Grade 10");
		elementUtil.doSendKeys(HS, "Ma");
		elementUtil.clickWhenReady(lHS,10);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit ayear")
	public void editAyear() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(ayear, 10);
		elementUtil.clickWhenReady(ite3, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(sdate, "01062021");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit shift")
	public void editShift() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(shift, 10);
		elementUtil.clickWhenReady(ite4, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(sid, "Sh-Gen");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit stream")
	public void editStream() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(stream, 10);
		elementUtil.clickWhenReady(ite5, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(stn, "Science4");
		elementUtil.doSendKeys(stid, "SCI4");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit board") 
	public void editBoard() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(board, 10);
		elementUtil.clickWhenReady(ite6, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(name, "State");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit Country")
	public void editCountry() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(country, 10);
		elementUtil.clickWhenReady(ite7, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(cn, "Afghanisthan");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit state")
	public void editState() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(state, 10);
		elementUtil.clickWhenReady(ite8, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(sc, "MH");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit district")
	public void editDistrict() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(district, 10);
		elementUtil.clickWhenReady(ite9, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(dc, "DV");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit relegion")
	public void editRelegion() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(religion, 10);
		elementUtil.clickWhenReady(ite10, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(rn, "African Traditional & Diasporic");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit community")
	public void editCommunity() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(community, 10);
		elementUtil.clickWhenReady(ite11, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(cc, "Oth");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit nationality")
	public void editNationality() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(nationality, 10);
		elementUtil.clickWhenReady(ite12, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(name, "Barbarian");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit efs")
	public void editEFS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(efs, 10);
		elementUtil.clickWhenReady(ite13, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(cs, "Telephonic Counselling booked");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit efm")
	public void editEFM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(efm, 10);
		elementUtil.clickWhenReady(ite14, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(mode, "SMS");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit agc")
	public void editAGC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(agc, 10);
		elementUtil.clickWhenReady(ite15, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(fdate, "02042021");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit com")
	public void editCOM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(com, 10);
		elementUtil.clickWhenReady(ite16, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(cot, "25");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit organizations")
	public void editOrg() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(org, 10);
		elementUtil.clickWhenReady(ite17, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.clickWhenReady(faa, 10);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit source")
	public void editEnquirySource() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(es, 10);
		elementUtil.clickWhenReady(ite18, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(ecn, "Face to Face Enquiry");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete shift")
	public void deleteShift() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(shift, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete stream")
	public void deleteStream() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(stream, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete board") 
	public void deleteBoard() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(board, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete access level")
	public void deleteAL() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(al, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete district")
	public void deleteDistrict() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(district, 10);
		elementUtil.clickWhenReady(itd, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete relegion")
	public void deleteRelegion() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(religion, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete community")
	public void deleteCommunity() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(community, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete source")
	public void deleteES() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(es, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete efs")
	public void deleteEFS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(efs, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete efm")
	public void deleteEFM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(efm, 10);
		elementUtil.clickWhenReady(ite19, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete com")
	public void deleteCOM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(com, 10);
		elementUtil.clickWhenReady(ite20, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}

	@Step("create shift") 
	public void createShift() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(shift, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(sn, "Sample");
		elementUtil.doSendKeys(sid, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create stream") 
	public void createStream() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(stream, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(stn, "Sample");
		elementUtil.doSendKeys(stid, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create board") 
	public void createBoard() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(board, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(name, "Sample");
		elementUtil.doSendKeys(code, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}

	@Step("create state") 
	public void createState() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(state, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(SN, "Sample");
		elementUtil.doSendKeys(sc, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create district") 
	public void createDistrict() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(district, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(dn, "Sample");
		elementUtil.doSendKeys(dc, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}

	@Step("create relegion") 
	public void createRelegion() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(religion, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(rn, "Sample");
		elementUtil.doSendKeys(rc, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create community") 
	public void createCommunity() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(community, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(CN, "Sample");
		elementUtil.doSendKeys(cc, "smpl");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create ES")
	public void createES() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(es, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(ecn, "Sample");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create EFS")
	public void createEFS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(efs, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(cs, "Sample");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create EFM")
	public void createEFM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 10);
		elementUtil.clickWhenReady(om, 10);
		elementUtil.clickWhenReady(efm, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(mode, "Sample");
		elementUtil.clickWhenReady(save, 10);
	}
}