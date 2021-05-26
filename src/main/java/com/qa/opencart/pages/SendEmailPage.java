package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class SendEmailPage {


	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By sendmail = By.linkText("Send Email");
	private By sendemail = By.xpath("//a[contains ( text() , 'Send Email')]");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By dob = By.xpath("(//input[@class = 'o_datepicker_input'])[1]");
	private By type = By.xpath("//label[normalize-space() = 'Type']//following::select");
	private By option = By.xpath("//input[@value = 'both']");
	private By subject = By.xpath("//label[normalize-space() = 'Subject']//following::input");
	private By content = By.xpath("//div[@class='note-editable panel-body']");
	private By approve = By.xpath("//span[text() = 'Approve']");
	private By save = By.xpath("(//button[ contains ( text() , 'Save')])[1]");
	private By send = By.xpath("//span[text() = 'Send Mail']");
	
	private By itd = By.xpath("//td[normalize-space() = 'First term fee']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	public SendEmailPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("send email")
	public void sendEmail(String Ayear, String Type, String Subject, String Content) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(sendmail, 5);
		elementUtil.doClick(sendemail);
		elementUtil.clickWhenReady(create, 5);
		elementUtil.doSendKeys(ayear, Ayear);
		elementUtil.doClick(dob);
		elementUtil.selectValueFromDropDown(type, Type);
		elementUtil.doClick(option);
		elementUtil.doSendKeys(subject, Subject);
		Thread.sleep(10000);
		elementUtil.doSendKeys(content, Content);
		elementUtil.moveToElement(save);
		elementUtil.clickWhenReady(save, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(approve));
		elementUtil.clickWhenReady(approve, 30);
		elementUtil.clickWhenReady(send, 50);
	}
	
	@Step("delete send email")
	public void deleteSendEmail() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(sendmail, 10);
		elementUtil.clickWhenReady(sendemail, 10);
		elementUtil.clickWhenReady(itd, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
	
}
