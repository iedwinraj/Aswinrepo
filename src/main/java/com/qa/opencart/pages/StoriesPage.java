package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class StoriesPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locator
	
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By stories =By.linkText("Stories");
	private By createstory = By.linkText("Create New Story");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By gac = By.xpath("//label[normalize-space() ='All Grade and Section']//following::input");
	private By section = By.xpath("//label[normalize-space() ='Section']//following::input");
	private By environment = By.xpath("//label[normalize-space() ='Environment']//following::input");
	private By title = By.xpath("//label[normalize-space() ='Story title']//following::input");
	private By urstory = By.xpath("//label[normalize-space() ='Your Story']//following::textarea");
	private By save = By.xpath("//button[text() ='Save']");
	
	private By vstories = By.linkText("View Stories");
	private By stitle = By.xpath("//td[ contains ( text() , 'Tests')]");
	private By lstory = By.xpath("(//span[ contains ( text() , 'Like Story')])[2]");
	private By next = By.xpath("//a[@accesskey = 'P']");
	
	private By ars = By.linkText("Approve/Reject Story");
	
	private By ite = By.xpath("//td[normalize-space() = 'RRR']");
	private By ite2 = By.xpath("//td[normalize-space() = 'Check']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	
	//2. Constructor of page class:
	
	public StoriesPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("create new story")
	public void createStory(String Section, String Env, String Title, String Story) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stories, 5);
		elementUtil.doClick(createstory);
		elementUtil.clickWhenReady(create, 5);
		elementUtil.doClick(gac);
		elementUtil.doSendKeys(section, Section);
		Thread.sleep(2000);
		elementUtil.doSend(environment, Env);
		elementUtil.doSendKeys(title, Title);
		elementUtil.doSendKeys(urstory, Story);
		elementUtil.clickWhenReady(save, 5);		
	}
	
	@Step("View stories")
	public void viewStory() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stories, 5);
		elementUtil.clickWhenReady(vstories, 5);
		elementUtil.clickWhenReady(stitle, 5);
		elementUtil.clickWhenReady(lstory, 5);
		elementUtil.clickWhenReady(next, 5);
	}
	
	@Step("Edit story")
	public void editStory() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stories, 5);
		elementUtil.doClick(createstory);
		elementUtil.clickWhenReady(ite2, 20);
		elementUtil.clickWhenReady(edit, 10);
		//elementUtil.doSendKeys(title, "Check");
		elementUtil.doSendKeys(urstory, "Trial data");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("Edit approve/reject story")
	public void editARS() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(stories, 10);
		elementUtil.doClick(ars);
		elementUtil.clickWhenReady(ite, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(urstory, "Trial story data");
		elementUtil.clickWhenReady(save, 10);
	}
}