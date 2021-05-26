package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class CircularPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locator
	
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By circular = By.linkText("Circular");
	private By announcement = By.linkText("Announcements");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By category = By.xpath("//label[normalize-space() = 'Category']//following::select");
	private By type = By.xpath("//label[normalize-space() = 'Type']//following::select");
	private By sdate = By.xpath("//label[normalize-space() = 'Start Date']//following::input");
	private By edate = By.xpath("//label[normalize-space() = 'End Date']//following::input");
	private By option = By.xpath("//input[@value= 'both']");
	private By message = By.xpath("//label[normalize-space() = 'Message']//following::textarea");
	private By approve = By.xpath("//span[text() = 'Approve']");
	private By save = By.xpath("//button[text() ='Save']");
	
	private By configuration = By.linkText("Configuration");
	private By group = By.linkText("Group");
	private By name = By.xpath("//label[normalize-space() = 'Name']//following::input");
	private By tos = By.xpath("//input[@value = 'students']");
	private By tclass = By.xpath("//label[normalize-space() = 'Class']//following::input");
	private By section = By.xpath("//label[normalize-space() = 'Section']//following::input");
	private By add = By .linkText("Add an item");
	private By data = By.xpath("//td[ contains ( text() , 'CHSV2977')]");
	private By sall = By.xpath("(//input[@type = 'checkbox'])[5]");
	private By select = By.xpath("//span[text() = 'Select']");
	
	private By homeworks = By.linkText("Home Works");
	private By close = By.xpath("//span[@class = 'oe_facet_remove']");
	private By newhw = By.xpath("//button[@class = 'btn btn-default fa fa-edit oe-cp-switch-form']");
	private By subjects = By.linkText("Subjects");
	private By hwu = By.linkText("Homework Upload");
	private By sub = By.xpath("(//input[@type='text'])[8]");
	private By pt = By.xpath("(//input[@type='text'])[9]");
	private By sdes = By.xpath("//textarea[@class='field_text']");
	
	private By newsletter = By.linkText("Newsletter");
	private By opt = By.xpath("//input[@value= 'environment']");
	private By grade = By.xpath("//label[normalize-space() = 'Grade']//following::input");
	private By env = By.xpath("(//label[normalize-space() = 'Environment']//following::input)[3]");
	private By subject = By.xpath("//label[normalize-space() = 'Subject']//following::input");
	private By des = By.xpath("//div[@class='note-editable panel-body']");
	private By sac = By.xpath("//span[text() = 'Save  & Close']");
	
	private By diary = By.linkText("Diary");
	private By student = By.xpath("//label[normalize-space() = 'Student']//following::input");
	
	private By worksheet = By.linkText("Worksheet");
	
	private By itd1 = By.xpath("(//td[normalize-space() = 'Individual Class and Environment'])[2]");
	private By edit = By.xpath("//button[normalize-space() = 'Edit']");
	private By action = By.xpath("//button[normalize-space() = 'Action']");
	private By delete = By.xpath("//a[normalize-space() = 'Delete']");
	
	private By ite1 = By.xpath("(//td[normalize-space() = 'Individual Class and Environment'])[1]");
	private By ite2 = By.xpath("//td[normalize-space() = '30/10/2020']");
	private By nf = By.xpath("//input[@value = 'grade']");
	private By gname = By.xpath("(//label[normalize-space() = 'Grade'])[2]//following::input");
	private By lgrade = By.linkText("Grade 11");
	private By lsec =By.linkText("Nalanda");
	private By ite3 = By.xpath("//td[normalize-space() = 'Dem0']");
	
	private By itd2 = By.xpath("//td[normalize-space() = 'Grade 12']");
	private By itd3 = By.xpath("//td[normalize-space() = 'Skg']");
	private By itd4 = By.xpath("//td[normalize-space() = 'Grade 3']");
	private By itd5 = By.xpath("//td[normalize-space() = 'test group']");
	
	//2. Constructor of page class:
	
		public CircularPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(this.driver);
		}
		
		@Step("create new announcement")
		public void doAnnouncement(String Ayear, String Category, String Sdate, String Edate, String Message) {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(announcement, 5);
			elementUtil.clickWhenReady(create, 5);
			elementUtil.doSendKeys(ayear, Ayear);
			elementUtil.selectValueFromDropDown(category, Category);
			elementUtil.selectValueFromDropDown(type, "All Classes and Environment");
			elementUtil.doSendKeys(sdate, Sdate);
			elementUtil.doSendKeys(edate, Edate);
			elementUtil.doClick(option);
			elementUtil.doSendKeys(message, Message);
			elementUtil.clickWhenReady(approve, 5);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("group")
		public void doGroup(String Name, String Ayear, String Tclass, String Section) throws InterruptedException {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(configuration, 5);
			elementUtil.clickWhenReady(group, 5);
			elementUtil.clickWhenReady(create, 5);
			elementUtil.doSendKeys(name, Name);
			elementUtil.doSendKeys(ayear, Ayear);
			elementUtil.doClick(tos);
			elementUtil.doSendKeys(tclass, Tclass);
			elementUtil.doSendKeys(section, Section);
			elementUtil.doClick(add);
			//Thread.sleep(10000);
			elementUtil.waitForElementToBeVisible(data, 25);
			elementUtil.clickWhenReady(sall, 5);
			elementUtil.clickWhenReady(select, 5);
			elementUtil.clickWhenReady(save, 5);
		}
		
		@Step("Home Works")
		public void doHomeworks(String Ayear, String Tclass, String Section, String Sub, String PT, String Sdes) throws InterruptedException {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(homeworks, 10);
			elementUtil.clickWhenReady(create, 10);
			elementUtil.doSendKeys(ayear, Ayear);
			elementUtil.doSendKeys(tclass, Tclass);
			elementUtil.doSendKeys(section, Section);
			elementUtil.clickWhenReady(subjects, 10);
			elementUtil.clickWhenReady(add, 10);
			Thread.sleep(2000);
			elementUtil.doSendKeys(sub, Sub);
			elementUtil.doSendKeys(pt, PT);
			elementUtil.doSendKeys(sdes, Sdes);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("news letter")
		public void newsLetter(String Ayear, String Env, String Subject, String Des) throws InterruptedException {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(newsletter, 10);
			elementUtil.clickWhenReady(create, 10);
			elementUtil.doSendKeys(ayear, "2020 - 2021");
			elementUtil.clickWhenReady(opt, 10);
			elementUtil.doSendKeys(env, "Ganga");
			//elementUtil.doSendKeys(grade, "Grade 10");
			//elementUtil.doSendKeys(section, "Janaloka");
			elementUtil.clickWhenReady(add, 10);
			elementUtil.doSendKeys(subject, "Reagrding school reopen");
			elementUtil.doSendKeys(des, "School will get reopened on 01-06-2020");
			elementUtil.clickWhenReady(sac, 10);
			Thread.sleep(5000);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("diary")
		public void doDiary(String Ayear, String Grade, String Section, String Student, String Subject, String Des) {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(diary, 10);
			elementUtil.clickWhenReady(create, 10);
			elementUtil.doSendKeys(ayear, Ayear);
			elementUtil.doSendKeys(grade, Grade);
			elementUtil.doSendKeys(section, Section);
			elementUtil.doSendKeys(student, Student);
			elementUtil.clickWhenReady(add, 10);
			elementUtil.doSendKeys(subject, Subject);
			elementUtil.doSendKeys(des, Des);
			elementUtil.clickWhenReady(sac, 10);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("worksheet")
		public void doWorksheet(String Grade, String Section, String Subject, String Des) throws InterruptedException {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(worksheet, 10);
			elementUtil.clickWhenReady(create, 10);
			Thread.sleep(3000);
			elementUtil.doSendKeys(grade, "Grade 12");
			elementUtil.doSendKeys(section, "Hamsadhwani");
			elementUtil.clickWhenReady(add, 10);
			elementUtil.doSendKeys(subject, "Demo");
			elementUtil.doSendKeys(des, "Demo to create new worksheet");
			elementUtil.clickWhenReady(sac, 10);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("delete announcement") 
		public void deleteAnnouncement() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(announcement, 5);
			elementUtil.clickWhenReady(itd1, 10);
			elementUtil.clickWhenReady(action, 10);
			elementUtil.clickWhenReady(delete, 10);
		}
		
		@Step("edit announcement")
		public void editAnnouncement() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(announcement, 5);
			elementUtil.clickWhenReady(ite1, 10);
			elementUtil.clickWhenReady(edit, 10);
			elementUtil.clickWhenReady(option, 10);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("edit newsletter")
		public void editNewsletter() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(newsletter, 10);
			elementUtil.clickWhenReady(ite2, 10);
			elementUtil.clickWhenReady(edit, 10);
			elementUtil.clickWhenReady(nf, 10);
			elementUtil.doSendKeys(gname, "Grade 11");
			elementUtil.doClick(lgrade);
			elementUtil.doSendKeys(section, "Nalanda");
			elementUtil.doClick(lsec);
			elementUtil.clickWhenReady(add, 10);
			elementUtil.doSendKeys(subject, "Test");
			elementUtil.doSendKeys(des, "Sample data ");
			elementUtil.clickWhenReady(sac, 10);
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("edit group")
		public void editGroup() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 5);
			elementUtil.clickWhenReady(configuration, 5);
			elementUtil.clickWhenReady(group, 5);
			elementUtil.clickWhenReady(ite3, 10);
			elementUtil.clickWhenReady(edit, 10);
			elementUtil.doSendKeys(name, "Demo");
			elementUtil.clickWhenReady(save, 10);
		}
		
		@Step("delete homework")
		public void deleteHomework() {
		
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 10);
			elementUtil.clickWhenReady(homeworks, 10);
			elementUtil.clickWhenReady(itd2, 10);
			elementUtil.clickWhenReady(action, 10);
			elementUtil.clickWhenReady(delete, 10);
			elementUtil.acceptPopup();
		}
		
		@Step("delete diary")
		public void deleteDiary() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 10);
			elementUtil.clickWhenReady(diary, 10);
			elementUtil.clickWhenReady(itd3, 20);
			elementUtil.clickWhenReady(action, 20);
			elementUtil.clickWhenReady(delete, 10);
			elementUtil.acceptPopup();
		}
		
		@Step("delete worksheet")
		public void deleteWorksheet() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 10);
			elementUtil.clickWhenReady(worksheet, 10);
			elementUtil.clickWhenReady(itd3, 20);
			elementUtil.clickWhenReady(action, 20);
			elementUtil.clickWhenReady(delete, 10);
			elementUtil.acceptPopup();
		}
		
		@Step("delete newsletter")
		public void deleteNewsletter() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 10);
			elementUtil.clickWhenReady(newsletter, 10);
			elementUtil.clickWhenReady(itd4, 20);
			elementUtil.clickWhenReady(action, 20);
			elementUtil.clickWhenReady(delete, 10);
			elementUtil.acceptPopup();
		}
		
		@Step("delete group")
		public void deleteGroup() {
			
			elementUtil.waitForElementToBeVisible(chat, 30);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(circular, 10);
			elementUtil.moveToElement(hscroll);
			elementUtil.doActionsClick(hscroll);
			elementUtil.clickWhenReady(configuration, 10);
			elementUtil.clickWhenReady(group, 10);
			elementUtil.clickWhenReady(itd5, 20);
			elementUtil.clickWhenReady(action, 20);
			elementUtil.clickWhenReady(delete, 20);
			elementUtil.acceptPopup();
		}
		
}