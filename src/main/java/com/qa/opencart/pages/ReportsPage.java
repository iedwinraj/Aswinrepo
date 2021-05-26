package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class ReportsPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locators
	
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By reportcard = By.linkText("Report Card");
	private By drc = By.linkText("Download Report Card");
	private By student = By.xpath("//label[normalize-space() = 'Student']//following::input");
	private By exam = By.xpath("//label[normalize-space() = 'Examination']//following::input");
	private By select = By.xpath("(//input[@type = 'checkbox'])[3]");
	private By download = By.xpath("//span[text() = 'Download Report Card']");
	
	private By whr = By.linkText("Withhold Result");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By school = By.xpath("//label[normalize-space() = 'School Name']//following::input");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By grade = By.xpath("//label[normalize-space() = 'Grade']//following::input");
	private By active = By.xpath("//input[@name = 'is_active']");
	private By save = By.xpath("//button[text() ='Save']");
	
	//2. Constructor of page class:
	
	public ReportsPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("download report card")
	public void DSR(String Student, String Exam) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(reportcard, 10);
		elementUtil.clickWhenReady(drc, 10);
		elementUtil.doSendKeys(student, Student);
		elementUtil.doSendKeys(exam, Exam);
		elementUtil.clickWhenReady(select, 10);
		elementUtil.clickWhenReady(download, 10);
	}
	
	@Step("withhold result")
	public void WHR(String School, String Ayear, String Grade, String Student) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(reportcard, 10);
		elementUtil.clickWhenReady(whr, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(grade, Grade);
		elementUtil.doSendKeys(student, Student);
		elementUtil.clickWhenReady(active, 10);
		elementUtil.clickWhenReady(save, 10);
	}
}
