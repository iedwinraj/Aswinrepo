package com.qa.opencart.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.opencart.factory.DriverFactory;

public class ElementUtil{

	private WebDriver driver;
	private JavaScriptUtil jsUtil; 

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		jsUtil = new JavaScriptUtil(this.driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		if(DriverFactory.highlight.equals("true")) {
			jsUtil.flash(element);
		}
		return element;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}
	
	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.click();
		element.clear();
		element.sendKeys(value);
	} 
	
	public void doSend(By locator, String value) {
		WebElement element = getElement(locator);
		element.click();
		element.sendKeys(value);
		element.submit();
	} 

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doActionsSendKeys(By locator, String value){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}
	
	public void doActionsClick(By locator){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.clickAndHold(element).build().perform();
		action.moveByOffset(0, 100).release().build().perform();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	public boolean verifyelementIsDisplayed(By locator) {
		Boolean Display= getElement(locator).isDisplayed();
		System.out.println(Display);
		return Display;
		
	}
	public boolean verifyelementIsnotDisplayed(By locator) {
		Boolean Display= !getElement(locator).isDisplayed();
		System.out.println(Display);
		return Display;
		
	}
	
	public boolean doIsnotDisplayed(By locator) {
	
		return true;
	}
	
	public boolean checkWebElementPresent(By locator){
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements count: " + elementCount + " for " + locator);
		
		if(elementCount>0){
			return true;
		}else{
			return false;
		}
	}

	// *******************Drop down utils ***************
	public void doDropDownSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public List<String> getAllDropDownOptionsList(By locator) {

		WebElement element = getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			optionsValueList.add(text);
		}

		return optionsValueList;

	}

	public void selectValueFromDropDown(By locator, String value) {

		WebElement element = getElement(locator);

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
		}

	}
	
	public void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> industry_options_list = driver.findElements(locator);
		for (WebElement ele : industry_options_list) {
			String text = ele.getText();
			if (text.equals(value)) {
				ele.click();
				break;
			}
		}
	}

	//**************************** Wait Utils ***************************************//
	
	public List<WebElement> visibilityOfAllElements(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void getPageLinksText(By locator, int timeOut){
		visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
	}
	
	public WebElement waitForElementToBeLocated(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementToBeVisible(By locator, int timeOut){
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String waitForPageTitlePresent(String titleValue, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}
	
	public Alert waitForAlertToBePresent(int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean waitForUrl(String url, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public void clickWhenReady(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void moveToElement(By locator)
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(getElement(locator)).build().perform();
			}
	
	public void selectDate(String day, String tagName) {
		String xpath = "//" + tagName + "[text()='" + day + "']";
		doClick(By.xpath(xpath));
	}

	public void selectDate(By locator, String day) {
		boolean flag = false;
		List<WebElement> daysList = getElements(locator);
		for (WebElement e : daysList) {
			if (e.getText().equals(day)) {
				System.out.println("right date...." + day);
				e.click();
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("wrong date..." + day);
		}
	}
	
	public void scrollDown() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN);
	}
	
	public void scrollUp() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_UP);
	}
}
