package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class OnlineVideosPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By onlinevideo = By.linkText("Online Videos");
	private By onlinevideos = By.xpath("(//a[contains ( text() , 'Online Videos')])[2]");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By school = By.xpath("//label[normalize-space() = 'School']//following::input");
	private By lschool = By.linkText("CHSV Chettinad Hari Shree Vidyalayam School");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By cls = By.xpath("//label[normalize-space() = 'Class']//following::input");
	private By section = By.xpath("//label[normalize-space() = 'Class']//following::input");
	private By time = By.xpath("//label[normalize-space() = 'Time']//following::input");
	private By title = By.xpath("//label[normalize-space() = 'Title']//following::input");
	private By des = By.xpath("//label[normalize-space() = 'Description']//following::textarea");
	private By vurl = By.xpath("//label[normalize-space() = 'Videos URL']//following::textarea");
	private By save = By.xpath("(//button[ contains ( text() , 'Save')])[1]");
	
	private By ite = By.xpath("//*[* = 'Tedit']");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By itd = By.xpath("//li[normalize-space() = 'sample']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	//2. Constructor of page class:
	public OnlineVideosPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("online videos")
	public void onlineVideo(String School, String Ayear, String Cls, String Section,String Time, String Title, String Des, String VURL) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(onlinevideo, 10);
		elementUtil.clickWhenReady(onlinevideos, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(school, School);
		elementUtil.doClick(lschool);
		elementUtil.doSendKeys(ayear, Ayear);
		elementUtil.doSendKeys(cls, Cls);
		elementUtil.doSendKeys(section, Section);
		elementUtil.doSendKeys(time, Time);
		elementUtil.doSendKeys(title, Title);
		elementUtil.doSendKeys(des, Des);
		elementUtil.doSendKeys(vurl, VURL);
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("Edit online videos")
	public void editOnlineVideo() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(onlinevideo, 10);
		elementUtil.clickWhenReady(onlinevideos, 10);
		elementUtil.clickWhenReady(ite, 10);
		elementUtil.clickWhenReady(edit, 10);
		elementUtil.doSendKeys(title, "Tedit");
		elementUtil.doSendKeys(vurl,"https://www.youtube.com");
		elementUtil.clickWhenReady(save, 10);
	}
	
	@Step("delete online video")
	public void deleteOnlineVideo() {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(onlinevideo, 10);
		elementUtil.clickWhenReady(onlinevideos, 10);
		elementUtil.clickWhenReady(itd, 10);
		elementUtil.clickWhenReady(action, 10);
		elementUtil.clickWhenReady(delete, 10);
		elementUtil.acceptPopup();
	}
}
