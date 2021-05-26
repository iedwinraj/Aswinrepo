package com.qa.opencart.base;

import java.util.Properties;

import javax.sound.sampled.TargetDataLine;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.google.common.util.concurrent.ExecutionList;
import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.AdministrationPage;
import com.qa.opencart.pages.BuildingPage;
import com.qa.opencart.pages.CircularPage;
import com.qa.opencart.pages.CurriculumManagementPage;
import com.qa.opencart.pages.DashboardPage;
import com.qa.opencart.pages.EmployeesPage;
import com.qa.opencart.pages.FeesManagementPage;
import com.qa.opencart.pages.IncidentPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.OnlineVideosPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.ReportsPage;
import com.qa.opencart.pages.SchoolManagementPage;
import com.qa.opencart.pages.SendEmailPage;
import com.qa.opencart.pages.StoriesPage;
import com.qa.opencart.pages.StudentLifeCyclePage;
import com.qa.opencart.pages.StudentManagementPage;
import com.qa.opencart.utils.ExcelUtil;

public class BaseTest {
	
	DriverFactory df;
	public Properties prop;
	WebDriver driver;
	public LoginPage loginPage;
	public AccountsPage accountsPage;
	public ProductInfoPage productInfoPage;
	public RegisterPage registerPage;
	public DashboardPage dashboardPage;
	public SchoolManagementPage schoolmanagementPage;
	public CurriculumManagementPage curriculummanagementPage;
	public SendEmailPage sendemailPage;
	public StoriesPage storiesPage;
	public CircularPage circularPage;
	public StudentLifeCyclePage studentlifecyclePage;
	public EmployeesPage employeesPage;
	public OnlineVideosPage onlinevideosPage;
	public ReportsPage reportsPage;
	public StudentManagementPage studentmanagementPage;
	public FeesManagementPage feesmanagementPage;
	public String sheetName,sheetNum;
	public BuildingPage buildingPage;
	public AdministrationPage administrationPage;
	public IncidentPage incidentPage;

	@Parameters({"browser", "version"})
	@BeforeTest
	public void setUp(String browserName, String browserVersion) {
		df = new DriverFactory();
		prop = df.init_prop();
		String browser = prop.getProperty("browser");
		
		if(browserName !=null) {
			browser = browserName;
		}
		
		driver = df.init_driver(browser, browserVersion);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		schoolmanagementPage = new SchoolManagementPage(driver);
		curriculummanagementPage = new CurriculumManagementPage(driver);
		sendemailPage = new SendEmailPage(driver);
		storiesPage = new StoriesPage(driver);
		circularPage = new CircularPage(driver);
		studentlifecyclePage = new StudentLifeCyclePage(driver);
		employeesPage = new EmployeesPage(driver);
		onlinevideosPage = new OnlineVideosPage(driver);
		reportsPage = new ReportsPage(driver);
		studentmanagementPage = new StudentManagementPage(driver);
		feesmanagementPage = new FeesManagementPage(driver);
		buildingPage = new BuildingPage(driver);
		administrationPage = new AdministrationPage(driver);
		incidentPage = new IncidentPage(driver);
	}
	
	@DataProvider(name = "getdata") 
		
		public Object[][] getData() {
		
			return ExcelUtil.getTestData(sheetName,sheetNum );
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
