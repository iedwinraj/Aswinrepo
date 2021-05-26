package com.qa.opencart.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class CurriculumManagementPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private WebDriverWait wait;
	private JavaScriptUtil jsUtil;
	
	//1.Locator
	private By chat = By.xpath("//a[@title='Conversations']");
	private By hscroll = By.xpath("//div[@class = 'slimScrollBar']");
	private By currmgmt = By.linkText("Curriculum Management");
	private By ops = By.linkText("Optional Subject");
	private By create = By.xpath("//button[ contains ( text() , 'Create')]");
	private By academicyear = By.id("oe-field-input-5");
	private By subject = By.xpath("//label[normalize-space() = 'Subject(s)']//following::input");
	private By gradename = By.xpath("//label[normalize-space() = 'Grade Name']//following::input");
	private By sectionname = By.id("oe-field-input-10");
	private By additem = By.xpath("//a[ text() = 'Add an item']");
	private By screate = By.xpath("//span[ contains ( text() , 'Create')]");
	private By firstname = By.xpath("//input[@placeholder  = 'First Name']");
	private By empnum = By.id("oe-field-input-32");
	private By pempnum = By.id("oe-field-input-34");
	private By dob = By.xpath("(//input[@class = 'o_datepicker_input'])[1]");
	private By gender = By.id("oe-field-input-37");
	private By doh = By.xpath("//label[normalize-space() = 'Dayscholar/Hosteller']//following::select"); 
	private By religion = By.xpath("//label[normalize-space() = 'Religion']//following::input");
	private By caste = By.xpath("//label[normalize-space() = 'Caste']//following::input");
	private By community = By.xpath("//label[normalize-space() = 'Community']//following::input");
	private By nationality = By.xpath("//label[normalize-space() = 'Nationality']//following::input");
	private By cob = By.xpath("//label[normalize-space() = 'Country of Birth']//following::input");
	private By acob = By.linkText("India");
	private By pob = By.xpath("//label[normalize-space() = 'Place of Birth']//following::input");
	private By mt = By.xpath("//label[normalize-space() = 'Mother Tongue']//following::input");
	private By bg = By.xpath("//label[normalize-space() = 'Blood Group']//following::input");
	private By contacts = By.linkText("Contacts");
	private By city = By.xpath("//label[normalize-space() = 'City']//following::input");
	private By zip = By.xpath("//label[normalize-space() = 'Zip']//following::input");
	private By sac = By.xpath("//span[ contains ( text() , 'Save  & Close')]");
	private By save = By.xpath("//button[text() ='Save']");
	
	private By report = By.linkText("Reports");
	private By assessment = By.linkText("Assessment");
	private By sper = By.linkText("Student Performance");
	private By schname = By.xpath("//label[normalize-space() = 'School Name']//following::input");
	private By ayearname = By.xpath("//label[normalize-space() = 'Academic Year Name']//following::input");
	private By secname = By.xpath("//label[normalize-space() = 'Section Name']//following::input");
	private By subname = By.xpath("//label[normalize-space() = 'Subject']//following::input");
	private By ename = By.xpath("//label[normalize-space() = 'Exam Name']//following::input");
	private By sname = By.xpath("//label[normalize-space() = 'Student Name']//following::input");
	
	private By icsecurriculum = By.linkText("ICSE Curriculum");
	private By icsereport = By.linkText("ICSE Report");
	private By swr = By.linkText("Subjectwise Report");
	private By cr = By.linkText("Consolidated Report");
	private By toe = By.xpath("//label[normalize-space() = 'Type of Examination']//following::input");
	private By month = By.xpath("//label[normalize-space() = 'Month']//following::input");
	private By examnum = By.xpath("//label[normalize-space() = 'Exam Number']//following::select");
	private By lsub = By.linkText("Subject-165 Mathematics");
	private By download1 = By.xpath("//span[text() = 'Download Excel Report MCA 9 and 11']");
	private By download2 = By.xpath("//span[text() = 'Download Excel Report MCA 10 and 12']");
	
	private By icse6to12 = By.linkText("ICSE Grade 6 to 12");
	private By portions = By.linkText("Portions");
	private By aportions = By.linkText("Approve Portions");
	private By pfg9 = By.xpath("//td[normalize-space() = 'Grade 9']");
	private By approve = By.xpath("//span[text() = 'Approve']");
	
	private By vportions = By.linkText("Verify Portions");
	private By geo = By.xpath("//td[normalize-space() = 'Geography']");
	private By verify = By.xpath("//span[text() = 'Verify']");
	
	private By srtlang = By.linkText("Second/Third Language");
	private By ayear = By.xpath("//label[normalize-space() = 'Academic Year']//following::input");
	private By grade = By.xpath("//label[normalize-space() = 'Grade']//following::input");
	private By lname = By.xpath("//label[normalize-space() = 'Language Name']//following::input");
	private By lcode = By.xpath("//label[normalize-space() = 'Language code']//following::input");
	private By tlcb = By.xpath("//input[@name = 'is_third_language']");

	//2. Constructor of page class:
	
			public CurriculumManagementPage(WebDriver driver) {
				this.driver = driver;
				elementUtil = new ElementUtil(this.driver);
			}
			
	@Step("optional subject")
	public void optionalSubject(String Ayear, String Subject, String Gradename, String Sectionname, String Firstname, String Empnum, String Pempnum, String DOB,String Gender, String DOH, String Religion, String Caste, String Community, String Nationality, String COB, String POB, String MT, String BG, String City, String Zip) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		//jsUtil.scrollIntoView(elementUtil.getElement(currmgmt));
		//elementUtil.moveToElement(currmgmt);
		elementUtil.clickWhenReady(currmgmt, 5);	
		elementUtil.clickWhenReady(ops, 5);
		elementUtil.clickWhenReady(create, 5);
		elementUtil.doSendKeys(academicyear, Ayear);
		elementUtil.doSendKeys(subject, Subject);
		elementUtil.doSendKeys(gradename, Gradename);
		elementUtil.doSendKeys(sectionname, Sectionname);
		elementUtil.clickWhenReady(additem, 5);
		elementUtil.clickWhenReady(screate, 5);
		elementUtil.doSendKeys(firstname, Firstname);
		elementUtil.doSendKeys(empnum, Empnum);
		elementUtil.doSendKeys(pempnum, Pempnum);	
		elementUtil.doSendKeys(dob, DOB);
		elementUtil.selectValueFromDropDown(gender, Gender);
		elementUtil.selectValueFromDropDown(doh, DOH);
		elementUtil.doSendKeys(religion, Religion);
		elementUtil.doSendKeys(caste, Caste);
		elementUtil.doSendKeys(community, Community);
		elementUtil.doSendKeys(nationality, Nationality);
		elementUtil.doSendKeys(cob, COB);
		elementUtil.doClick(acob);
		elementUtil.doSendKeys(pob, POB);
		elementUtil.doSendKeys(mt, MT);
		elementUtil.doSendKeys(bg, BG);
		elementUtil.clickWhenReady(contacts,5);
		elementUtil.doSendKeys(city, City);
		elementUtil.doSendKeys(zip, Zip);
		elementUtil.doClick(sac);
		elementUtil.clickWhenReady(save, 5);
	}
	
	@Step("student performance")
	public void studentPerformance(String Schname, String Ayear, String Grade, String Section, String Subject, String Sname) throws IOException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 5);
		elementUtil.clickWhenReady(report, 5);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(assessment, 5); 
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(sper, 5);
		elementUtil.doSendKeys(schname, Schname);
		elementUtil.doSendKeys(ayearname, Ayear);
		elementUtil.doSendKeys(gradename, Grade);
		elementUtil.doSendKeys(secname, Section);
		elementUtil.doSendKeys(subname, Subject);
		elementUtil.doSendKeys(sname, Sname);
		
		File file = new File("./testdata/sample.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("sper"); 
	}
	
	@Step("subjectwise report")
	public void subjectwiseReport(String Grade, String Section, String TOE, String Month, String Examnum, String Subject) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 10);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(icsecurriculum, 10);
		elementUtil.clickWhenReady(icsereport, 10);
		elementUtil.clickWhenReady(swr, 10);
		elementUtil.doSendKeys(gradename, Grade);
		elementUtil.doSendKeys(secname, Section);
		elementUtil.doSendKeys(toe, TOE);
		elementUtil.doSendKeys(month, Month);
		elementUtil.selectValueFromDropDown(examnum, Examnum);
		elementUtil.doSendKeys(subname, Subject);
		elementUtil.doClick(lsub);
		elementUtil.clickWhenReady(download2, 10);
	}
	
	@Step("consolidated report")
	public void consolidatedReport(String Grade, String Section, String TOE, String Month, String Examnum, String Subject) throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 10);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(icsecurriculum, 10);
		elementUtil.clickWhenReady(icsereport, 10);
		elementUtil.clickWhenReady(cr, 10);
		elementUtil.doSendKeys(gradename, Grade);
		elementUtil.doSend(secname, Section);
		elementUtil.doSendKeys(toe, TOE);
		elementUtil.doSendKeys(month, Month);
		elementUtil.selectValueFromDropDown(examnum, Examnum);
		elementUtil.doSendKeys(subname, Subject);
		elementUtil.clickWhenReady(download2, 10);
	}
	
	@Step("approve portions")
	public void approvePortions() throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 10);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(icsecurriculum, 30);
		elementUtil.clickWhenReady(icse6to12, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(portions, 10);
		elementUtil.clickWhenReady(aportions, 10);
		elementUtil.clickWhenReady(pfg9, 10);
		elementUtil.clickWhenReady(approve, 10);
	}
	
	@Step("verify portions")
	public void verifyPortions() throws InterruptedException {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 10);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(icsecurriculum, 10);
		elementUtil.clickWhenReady(icse6to12, 10);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(portions, 10);
		elementUtil.clickWhenReady(vportions, 10);
		elementUtil.clickWhenReady(geo, 10);
		elementUtil.clickWhenReady(verify, 10);
	}
	
	@Step("second or third language")
	public void srtLanguage(String Ayear, String Grade, String Lname, String Lcode) {
		
		elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.moveToElement(hscroll);
		elementUtil.doActionsClick(hscroll);
		elementUtil.clickWhenReady(currmgmt, 10);
		elementUtil.clickWhenReady(srtlang, 10);
		elementUtil.clickWhenReady(create, 10);
		elementUtil.doSendKeys(ayear, Ayear);
		elementUtil.doSendKeys(grade, Grade);
		elementUtil.doSendKeys(lname, Lname);
		elementUtil.doSendKeys(lcode, Lcode);
		elementUtil.clickWhenReady(tlcb, 10);
		elementUtil.clickWhenReady(save, 10);
	}
}