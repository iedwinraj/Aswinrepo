package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class IncidentPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locator
	
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By incident = By.linkText("Incident");
	private By im = By.linkText("Incident Management");
	private By ite = By.xpath("//td[normalize-space() = 'Date of birth wrong']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By des = By.xpath("//label[normalize-space() = 'Description']//following::textarea"); 
	private By save = By.xpath("//button[normalize-space() = 'Save']");
	
	//2. Constructor of page class:
	
	public IncidentPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("edit incident management")
	public void editIM() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(incident, 10);
		elementUtil.clickWhenReady(im, 10);
		elementUtil.clickWhenReady(ite, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(des, "In the bonafide section, its showing 'Wrong Date of birth'. Please fix this issue as per the records.");
		elementUtil.clickWhenReady(save, 10);
	} 
}
