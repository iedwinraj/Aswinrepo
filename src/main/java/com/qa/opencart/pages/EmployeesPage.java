package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class EmployeesPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locators
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By employees = By.xpath("(//a[normalize-space() = 'Employees'])[2]");
	private By departments = By.linkText("Departments");
	private By employee = By.linkText("Employees");
	private By create = By.xpath("//button[contains ( text() , 'Create')]");
	private By ep = By.xpath("//label[normalize-space() = 'Existing Parent']//following::input");
	private By fn = By.xpath("//label[normalize-space() = 'First Name']//following::input");
	private By ln = By.xpath("//label[normalize-space() = 'Last Name']//following::input");
	private By doj = By.xpath("//input[@class = 'o_datepicker_input']");
	private By emptype = By.xpath("//label[normalize-space() = 'Employment Type']//following::input");
	private By empid = By.xpath("//label[normalize-space() = 'Employee Id']//following::input");
	
	private By sname = By.xpath("//label[normalize-space() = 'School Name']//following::input");
	private By depname = By.xpath("//label[normalize-space() = 'Department Name']//following::input");
	private By depcode = By.xpath("//label[normalize-space() = 'Department Code']//following::input");
	private By pd = By.xpath("//label[normalize-space() = 'Parent Department']//following::input");
	private By rmn = By.xpath("//label[normalize-space() = 'Reporting Manager Name']//following::input");
	private By sc = By.xpath("//input[@value = 'teaching']");
	private By save = By.xpath("//button[text() = 'Save']");
	
	private By emp = By.xpath("(//button[contains( text() , 'Employees')])[4]");
	private By mobile = By.xpath("//label[normalize-space() = 'Work Mobile']//following::input");
	private By street = By.xpath("//input[@placeholder = 'Street...']");
	private By city = By.xpath("//input[@placeholder = 'City']");
	private By state = By.xpath("//input[@placeholder = 'State']");
	private By zip = By.xpath("//input[@placeholder = 'ZIP']");
	private By country = By.xpath("//input[@placeholder = 'Country']");
	private By mail = By.xpath("//label[normalize-space() = 'Work Email Address']//following::input");
	private By phone = By.xpath("//label[normalize-space() = 'Work Phone']//following::input");
	private By mngr = By.xpath("//label[normalize-space() = 'Manager']//following::input");
	
	private By config = By.linkText("Configuration");
	private By asset = By.linkText("Asset");
	private By aname = By.xpath("//label[normalize-space() = 'Asset Name']//following::input");
	private By acode = By.xpath("//label[normalize-space() = 'Asset Code']//following::input");
	private By count = By.xpath("//label[normalize-space() = 'Total Number of Asset']//following::input");
	
	private By fr = By.linkText("Family Relationships");
	private By name = By.xpath("//label[normalize-space() = 'Name']//following::input");
	
	private By letype = By.linkText("Employee Type");
	private By etype = By.xpath("//label[normalize-space() = 'Employee Type']//following::input");
	
	private By designation = By.linkText("Designation");
	private By dname = By.xpath("//label[normalize-space() = 'Designation Name']//following::input");
	private By dcode = By.xpath("//label[normalize-space() = 'Designation Code']//following::input");
	private By vacancy = By.xpath("//label[normalize-space() = 'Total Number of Vacancies']//following::input");
	private By stages = By.xpath("//label[normalize-space() = 'Interview stages']//following::input");
	private By ldepname = By.linkText("Teaching / Extra Curricular Activity");
	private By lstages = By.linkText("Face to face interview"); 
	
	private By ite = By.xpath("//td[normalize-space() = 'Tutor']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	
	private By itd1 = By.xpath("(//*[contains( text() , 'Arun Kumar')])[2]");
	private By itd2 = By.xpath("//td[normalize-space() = 'Faculty']");
	private By itd3 = By.xpath("(//td[normalize-space() = 'CN Chettinad Niyogaa Corporate'])[1]");
	private By itd4 = By.xpath("//td[normalize-space() = 'Spouse']");
	private By itd5 = By.xpath("//td[normalize-space() = 'SIM']");
	
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	
	public EmployeesPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("create department")
	public void createDepartment(String SN, String DN, String DC, String PD, String RMN) {
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(departments, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(sname, SN);
		elementUtil.doSendKeys(depname, DN);
		elementUtil.doSendKeys(depcode, DC);
		elementUtil.doSendKeys(pd, PD);
		elementUtil.doSendKeys(rmn, RMN);
		elementUtil.doClick(sc);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create employee")
	public void createEmployee() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(departments, 10);
		elementUtil.clickWhenReady(create, 10);
	}
	
	@Step("create asset")
	public void createAsset() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(asset, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(sname, "CH");
		elementUtil.doSendKeys(aname, "Printers");
		elementUtil.doSendKeys(acode, "CHSV-print");
		elementUtil.doSendKeys(count, "3");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create family relationships")
	public void createFR() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(fr, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(name, "Blood Relation");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create employee type")
	public void createET() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(letype, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(etype, "Manager");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("create designation")
	public void createDesignation() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(designation, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(sname, "CH");
		elementUtil.doSendKeys(dname, "Hindi Trainer");
		elementUtil.doSendKeys(dcode, "HSR");
		elementUtil.doSendKeys(depname, "Extra");
		elementUtil.clickWhenReady(ldepname, 10);
		elementUtil.doSendKeys(vacancy, "1");
		elementUtil.doSendKeys(stages, "Face");
		elementUtil.clickWhenReady(lstages, 10);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("Edit designation")
	public void editDesignation() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(designation, 10);
		elementUtil.clickWhenReady(ite, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(vacancy, "15");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete employee")
	public void deleteEmployee() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employees, 10);
		elementUtil.clickWhenReady(itd1, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete employee type")
	public void deleteEmployeeType() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(letype, 10);
		elementUtil.clickWhenReady(itd2, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete department")
	public void deleteDepartment() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(departments, 10);
		
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete designation") 
	public void deleteDesignation() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(designation, 10);
		elementUtil.clickWhenReady(itd3, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete FR")
	public void deleteFR() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(fr, 10);
		elementUtil.clickWhenReady(itd4, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
	@Step("delete asset")
	public void deleteAsset() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(employee, 10);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(config, 10);
		elementUtil.clickWhenReady(asset, 10);
		elementUtil.clickWhenReady(itd5, 20);
		elementUtil.clickWhenReady(action, 20);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
}