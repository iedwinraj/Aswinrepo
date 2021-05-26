package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.opencart.utils.ElementUtil;
import io.qameta.allure.Step;

public class DashboardPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By administration = By.linkText("Administration");
	private By organizations = By.linkText("Organizations");
	private By create = By.xpath("//button[contains ( text() , 'Create')]");
	//private By name = By.xpath("//td[normalize-space() = 'Chettinad Hari Shree Vidyalayam']");
	private By name = By.id("oe-field-input-4");
	private By chat = By.xpath("//a[@title='Conversations']");
	private By users = By.linkText("Users");
	private By staff = By.linkText("Academic Teaching Staff");
	private By orgtype = By.xpath("//input[@value ='corporate']");
	private By street = By.xpath("//input[@placeholder =\"Street...\"]");
	private By city = By.xpath("//input[@placeholder =\"City\"]");
	private By state = By.xpath("//input[@placeholder =\"State\"]");
	private By zip = By.xpath("//input[@placeholder =\"ZIP\"]");
	private By site = By.id("oe-field-input-17");
	private By phone = By.xpath("//input[@placeholder =\"Phone\"]");
	private By mobile = By.xpath("//input[@placeholder =\"Mobile\"]");
	private By mail = By.id("oe-field-input-23");
	private By save = By.xpath("(//button[ contains ( text() , 'Save')])[1]");
	private By ok = By.xpath("(//button[@class=\"btn btn-sm oe_button btn-primary\"])[1]");
	
	//2. Constructor of page class:
	
		public DashboardPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(this.driver);
		}
	
	@Step("selecting inner links")
	public void subLink(String Name, String Street, String City, String State, String ZIP, String Site, String Phone, String Mobile, String Mail) {
		 
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(administration, 5);
		elementUtil.waitForElementToBeVisible(organizations, 5);
		elementUtil.clickWhenReady(organizations, 10);
		elementUtil.clickWhenReady(create, 5);
		elementUtil.doSendKeys(name, "Spectromax");
		elementUtil.clickWhenReady(orgtype, 5);
		elementUtil.doSendKeys(street, "27/61,Solaiyappan Street");
		elementUtil.doSendKeys(city, "Kumbakonam");
		elementUtil.doActionsSendKeys(state, "Tamil Nadu");
		elementUtil.doSendKeys(zip, "612001");
		elementUtil.doSendKeys(site,"www.spectromax.com");
		elementUtil.doSendKeys(phone, "7418275699");
		elementUtil.doSendKeys(mobile, "7397083973");
		elementUtil.doSendKeys(mail, "ashwin.swaminathan@spectromax.com");
		elementUtil.clickWhenReady(name, 5);
		elementUtil.clickWhenReady(users, 5);
		elementUtil.clickWhenReady(staff, 5);
		elementUtil.doClick(save);
		elementUtil.clickWhenReady(ok, 5);
	}
 }