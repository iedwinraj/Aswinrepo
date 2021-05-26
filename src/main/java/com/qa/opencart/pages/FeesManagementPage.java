package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class FeesManagementPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By conf = By.linkText("Configurations");
	private By fmgmt = By.linkText("Fees Management");
	private By fhead = By.linkText("Fees Head");
	private By create = By.xpath("//button[normalize-space() = 'Create']");
	private By fhn = By.xpath("//label[normalize-space() = 'Fee Head Name']//following::input");
	private By fhc = By.xpath("//label[normalize-space() = 'Fee Head Code']//following::input");
	private By fg = By.xpath("//label[normalize-space() = 'Fee Group']//following::input");
	private By type = By.xpath("//label[normalize-space() = 'Type']//following::select");
	private By amount = By.xpath("//label[normalize-space() = 'Net Amount']//following::input");
	private By save = By.xpath("//button[text() = 'Save']");
	
	private By fterm = By.linkText("Fees Term");
	
	private By fgroup = By.linkText("Fees Group");
	private By fgn = By.xpath("//label[normalize-space() = 'Fee Group Name']//following::input");
	private By fgc = By.xpath("//label[normalize-space() = 'Fee Group Code']//following::input");
	
	private By ftype = By.linkText("Fees Type");
	private By sname = By.xpath("//label[normalize-space() = 'School Name']//following::input");
	private By ftn = By.xpath("//label[normalize-space() = 'Fee Type Name']//following::input");
	private By ftc = By.xpath("//label[normalize-space() = 'Fee Type Code']//following::input");
	private By gender = By.xpath("//label[normalize-space() = 'Gender']//following::select");
	private By doh = By.xpath("//label[normalize-space() = 'Dayscholar/Hosteller']//following::select");
	
	private By fstruct = By.linkText("Fees Structure");
	private By fsn = By.xpath("//label[normalize-space() = 'Fee Structure Name']//following::input");
	private By fsc = By.xpath("//label[normalize-space() = 'Fee Structure Code']//following::input");
	private By tname = By.xpath("//label[normalize-space() = 'Term Name']//following::input");
	private By ft = By.xpath("//label[normalize-space() = 'Fee Type']//following::input");
	private By sdate = By.xpath("//label[normalize-space() = 'Start Date']//following::input");
	private By edate = By.xpath("//label[normalize-space() = 'End Date']//following::input");
	private By ddate = By.xpath("//label[normalize-space() = 'Due Date']//following::input");
	
	private By sbc = By.linkText("Sibling Fees Concession");
	private By con = By.xpath("//td[normalize-space() = 'Sibling Concession']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By add = By.linkText("Add an item");
	private By data = By.xpath("(//input[@class = 'ui-autocomplete-input'])[2]");
	private By ldata = By.linkText("BOOK & ACTIVITY FEE - G11");
	//private By percentage = By.xpath("//span[@data-fieldname = 'per_amount']");
	private By percentage = By.xpath("(//input[@type ='text'])[5]");
	
	private By bankmaster = By.linkText("Bank Master");
	private By name = By.xpath("//label[normalize-space() = 'Name']//following::input");
	
	private By sfc = By.linkText("Standard Fee Collection");
	private By fcbt = By.linkText("Fee Collection by Term");
	private By fc = By.linkText("Fee Collection");
	private By itd6 = By.xpath("(//input[@type = 'checkbox'])[6]");
	private By itd7 = By.xpath("(//input[@type = 'checkbox'])[5]");
	private By itd8 = By.xpath("(//input[@type = 'checkbox'])[4]");
	
	private By ite1 = By.xpath("//td[normalize-space() = 'BOOK & ACTIVITY FEE - G11']"); 
	private By ite2 = By.xpath("//td[normalize-space() = 'Term 1']");
	private By ite3 = By.xpath("//td[normalize-space() = 'Fees Structure for TUITION FEE - PRE KG Term 3']");
	private By ite4 = By.xpath("//td[normalize-space() = 'FG001']");
	private By ite5 = By.xpath("//td[normalize-space() = 'Sibling Concession']");
	private By ite6 = By.xpath("//td[normalize-space() = 'Indusland Bank']");
	private By ite7 = By.xpath("(//td[normalize-space() = 'Compulsory'])[2]");
	
	private By itd1 = By.xpath("//td[normalize-space() = 'LUNCH FEE - G10']");
	private By itd2 = By.xpath("//td[normalize-space() = 'Term 1']");
	private By itd3 = By.xpath("//td[normalize-space() = 'Value Additions']");
	private By itd4 = By.xpath("//td[normalize-space() = 'Fees Structure for TERM FEE - TOD Term 2']");
	private By itd5 = By.xpath("//td[normalize-space() = 'Corporation Bank']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2.Constructor of page class:
	
	public FeesManagementPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("fees head")
	public void feesHead() {

		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fhead, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(fhn,"Sample");
		elementUtil.doSendKeys(fhc, "Test");
		elementUtil.doSendKeys(fg, "Other Term Fees");
		elementUtil.selectValueFromDropDown(type, "Admission/Other Fees");
		elementUtil.doSendKeys(amount, "100");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("fees group")
	public void feesGroup() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fgroup, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(fgn, "Miscellaneous");
		elementUtil.doSendKeys(fgc, "Miscc");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("fees type")
	public void feesType() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(ftype, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(sname, "CH");
		elementUtil.doSendKeys(ftn, "Fitness-F");
		elementUtil.doSendKeys(ftc, "Gym-F");
		elementUtil.selectValueFromDropDown(gender, "Female");
		elementUtil.selectValueFromDropDown(doh, "Hosteller");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("sibling fees concession")
	public void siblingfeesConcession() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(sbc, 10);
		elementUtil.clickWhenReady(con, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.clickWhenReady(add, 10);
		elementUtil.doSendKeys(data, "Book");
		elementUtil.clickWhenReady(ldata, 10);
		elementUtil.doSendKeys(percentage, "12.50");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("Bank Master")
	public void bankMaster() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(bankmaster, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(name, "Kotak Mahindra Bank");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit fees head")
	public void editFeesHead() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fhead, 10);
		elementUtil.clickWhenReady(ite1, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(amount, "10000");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit fees term")
	public void editFeesTerm() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fterm, 10);
		elementUtil.clickWhenReady(ite2, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(name, "Semester-1");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit fees structure")
	public void editFeesStructure() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fstruct, 10);
		elementUtil.clickWhenReady(ite3, 10);
		elementUtil.scrollUp();
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doActionsSendKeys(fsn, "");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit fees group")
	public void editFeesGroup() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fgroup, 10);
		elementUtil.clickWhenReady(ite4, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(fgn, "Tution Fees");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit Sibling fess concession")
	public void editSFC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(sbc, 10);
		elementUtil.clickWhenReady(ite5, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.clickWhenReady(add, 10);
		elementUtil.doSendKeys(data, "BOOK");
		elementUtil.doClick(ldata);
		elementUtil.doSendKeys(percentage, "12.50");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit bank master")
	public void editBankMaster() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(bankmaster, 10);
		elementUtil.clickWhenReady(ite6, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(name, "Indusland Bank");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("edit fees type")
	public void editFeesType() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(ftype, 10);
		elementUtil.clickWhenReady(ite7, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(ftn, "Compulsory-Misc");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete fees head")
	public void deleteFeesHead() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fhead, 10);
		elementUtil.clickWhenReady(itd1, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete fees term")
	public void deleteFeesTerm() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fterm, 10);
		elementUtil.clickWhenReady(itd2, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete fees group")
	public void deleteFeesGroup() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fterm, 10);
		elementUtil.clickWhenReady(itd3, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete fees structure")
	public void deleteFeesStructure() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fterm, 10);
		elementUtil.clickWhenReady(itd4, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete bank master")
	public void deleteBankMaster() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(conf, 10);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fterm, 10);
		elementUtil.clickWhenReady(itd5, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete standard fees collection")
	public void deleteSFC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(sfc, 10);
		elementUtil.clickWhenReady(itd6, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete fees collection by term")
	public void deleteFCBT() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fcbt, 10);
		elementUtil.clickWhenReady(itd7, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete fees collection")
	public void deleteFC() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(fmgmt, 10);
		elementUtil.clickWhenReady(fc, 10);
		elementUtil.clickWhenReady(itd8, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
 }