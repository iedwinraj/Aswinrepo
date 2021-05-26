package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class BuildingPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locator
	
	private By building = By.xpath("//span[normalize-space() = 'Building']");
	private By bm = By.linkText("Building Masters");
	private By lbuilding = By.linkText("Building");
	private By create = By.xpath("//button[normalize-space() = 'Create']");
	
	private By ORFOA = By.linkText("Owner RFO Approval");
	
	//private By bv = By.cssSelector("#side-menu > li.toplevel-menu.active.highlight > ul > li.active > ul > li:nth-child(13) > a");
	private By bv = By.linkText("Building Vendor");
	
	private By employees = By.linkText("Employees");
	private By ec = By.linkText("Employee Creation");
	
	//2. Constructor of page class:
	
	public BuildingPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	@Step("Building")
	public void doBuilding() {
		
		/*
		 * elementUtil.clickWhenReady(building, 10); elementUtil.clickWhenReady(bm, 10);
		 * elementUtil.clickWhenReady(lbuilding, 10);
		 */ 
		
		  elementUtil.scrollDown(); elementUtil.clickWhenReady(employees, 10);
		  elementUtil.clickWhenReady(ec, 10);
		 
		elementUtil.clickWhenReady(create, 10);
	}
	
	@Step("owner RFO approval")
	public void doApproval() {
		
		elementUtil.clickWhenReady(building, 10);
		elementUtil.clickWhenReady(bm, 10);
		elementUtil.clickWhenReady(ORFOA, 10);
	}
	
	@Step("Building vendor")
	public void buildingVendor() {
		
		elementUtil.clickWhenReady(building, 10);
		elementUtil.clickWhenReady(bm, 10);
		elementUtil.scrollDown();
		elementUtil.clickWhenReady(bv, 10);
		elementUtil.clickWhenReady(create, 10);
	}
	
}
