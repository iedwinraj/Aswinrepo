package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class StudentLifeCyclePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By slc = By.linkText("Student Life Cycle");
	private By ee = By.linkText("Enquiry Entry");
	private By ioe = By.linkText("Import/Export Enquiry Entry");
	private By imp = By.xpath("//input[@value = 'import']");
	private By sel = By.xpath("//span[text() = 'Select']");
	
	private By see = By.xpath("(//a[normalize-space() = 'Enquiry Entry'])[2]");
	private By eefu = By.linkText("Enquiry Entry Follow Up");
	private By admission = By.linkText("Admission");
	private By admissions = By.linkText("Admissions");
	private By mail = By.linkText("Emails");
	private By pef = By.linkText("Parent Email Form");
	
	private By itd1 = By.xpath("//td[normalize-space() = 'S. Viroshan']");
	private By itd2 = By.xpath("//td[normalize-space() = 'Closed Location Constrain']");
	private By itd3 = By.xpath("(//td[normalize-space() = 'Ashwin .S'])[2]");
	private By itd4 = By.xpath("//td[normalize-space() = 'Welcome to the Chettinad Hari Shree Vidyalayam family']");
	private By itd5 = By.xpath("//td[normalize-space() = 'Assessment']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	
	public StudentLifeCyclePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("import enquiry entity")
	public void doImport() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.doClick(slc);
		elementUtil.clickWhenReady(ee, 10);
		elementUtil.clickWhenReady(ioe, 10);
		elementUtil.clickWhenReady(imp, 10);
		elementUtil.clickWhenReady(sel, 10);
	}
	
	@Step("delete enquiry entry")
	public void deleteEnquiryEntry() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(slc, 10);
		elementUtil.clickWhenReady(ee, 10);
		elementUtil.clickWhenReady(see, 10);
		elementUtil.clickWhenReady(itd1, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete enquiry entry follow up")
	public void deleteEEFU() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(slc, 10);
		elementUtil.clickWhenReady(ee, 10);
		elementUtil.clickWhenReady(eefu, 10);
		elementUtil.clickWhenReady(itd2, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete admission")
	public void deleteAdmission() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(slc, 10);
		elementUtil.clickWhenReady(admission, 10);
		elementUtil.clickWhenReady(admissions, 10);
		elementUtil.clickWhenReady(itd3, 10);
		elementUtil.scrollUp();
		elementUtil.scrollUp();
		elementUtil.waitForElementToBeVisible(action, 20);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete email")
	public void deleteEmail() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(slc, 10);
		elementUtil.clickWhenReady(admission, 10);
		elementUtil.clickWhenReady(mail, 10);
		elementUtil.clickWhenReady(itd4, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}

	@Step("delete parent email form")
	public void deletePEF() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(slc, 10);
		elementUtil.clickWhenReady(admission, 10);
		elementUtil.clickWhenReady(pef, 10);
		elementUtil.clickWhenReady(itd5, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
}