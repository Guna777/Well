package apptivo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "/home/grajan/Desktop/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.apptivo.com/");

		driver.manage().window().maximize();
	}

	public static void main(String[] args) {

		userLogin();
		CalendarApploading();
		AnswersApploading();
		AppbuilderApploading();
		CampaignsApploading();
		CandidatesApploading();
		CasesApploading();
		CashmanagementApploading();
		CompetitorstApploading();
		ContactsApploading();
		ContractsApploading();
		CreditnotesApploading();
		CrninsightsApploading();
		CrnApploading();
		CustomerpaymentsApploading();
		CustomerApploading();

	}

	@Test(priority = 1)
	private static void userLogin() {

		driver.findElement(By.linkText("Log In"));

		driver.get("https://www.apptivo.com/");

		driver.findElement(By.name("login_email")).sendKeys("Gunasan@berijam.com");

		driver.findElement(By.name("login_password")).sendKeys("Welcome123");

		driver.findElement(By.id("sign_up_button")).click();

		System.out.println("Sussfully user login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector(".odd:nth-child(1) .h5_mgn05")).click();

		System.out.println("Sussfully multi user login");

		System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/firm-selection/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully Home page Loading");

		} else {
			System.out.println("Unable to loading Home page");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	private static void CalendarApploading() {

		driver.get("https://apptivo.net/app/home.jsp#/my-agenda/calendar-view");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("Calendar");

		if ("https://apptivo.net/app/home.jsp#/my-agenda/calendar-view".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully calendar app loading");

		} else {
			System.out.println("Unable to loading calendar app");

		}
	}

	@Test(priority = 3)
	private static void AnswersApploading() {

		driver.get("https://apptivo.net/app/answers.jsp#/home");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("answers");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/answers.jsp#/home".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully answers app loading");

		} else {
			System.out.println("Unable to loading answers app");

		}
	}

	@Test(priority = 4)
	private static void AppbuilderApploading() {

		driver.get("https://apptivo.net/app/appbuilder.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("appbuilder");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/appbuilder.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully appbuilder app loading");

		} else {
			System.out.println("Unable to loading appbuilder app");

		}
	}

	@Test(priority = 5)
	private static void CampaignsApploading() {

		driver.get("https://apptivo.net/app/campaigns.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("campaigns");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/campaigns.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully campaigns app loading");

		} else {
			System.out.println("Unable to loading campaigns app");

		}
	}

	@Test(priority = 6)
	private static void CandidatesApploading() {

		driver.get("https://apptivo.net/app/candidates.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("candidates");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/candidates.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully candidates app loading");

		} else {
			System.out.println("Unable to loading candidates app");

		}
	}

	@Test(priority = 7)
	private static void CasesApploading() {

		driver.get("https://apptivo.net/app/cases.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("cases");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/cases.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully cases app loading");

		} else {
			System.out.println("Unable to loading cases app");

		}
	}

	@Test(priority = 8)
	private static void CashmanagementApploading() {

		driver.get("https://apptivo.net/app/cashmanagement.jsp#!/home");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("cashmanagement");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/cashmanagement.jsp#!/home".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully cashmanagement app loading");

		} else {
			System.out.println("Unable to loading cashmanagement app");

		}
	}

	@Test(priority = 9)
	private static void CompetitorstApploading() {

		driver.get("https://apptivo.net/app/competitors.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("competitors");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/competitors.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully competitors app loading");

		} else {
			System.out.println("Unable to loading competitors app");

		}
	}

	@Test(priority = 10)
	private static void ContactsApploading() {

		driver.get("https://apptivo.net/app/contacts.jsp#/dashboard/byqueue/mycontacts");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("contacts");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/contacts.jsp#/dashboard/byqueue/mycontacts".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully contacts app loading");

		} else {
			System.out.println("Unable to loading contacts app");

		}
	}

	@Test(priority = 11)
	private static void ContractsApploading() {

		driver.get("https://apptivo.net/app/contracts.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("contracts");

		// System.out.println(driver.getCurrentUrl());

		if ("https://apptivo.net/app/contracts.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully contracts app loading");

		} else {
			System.out.println("Unable to loading contracts app");

		}
	}

	@Test(priority = 12)
	private static void CreditnotesApploading() {

		driver.get("https://apptivo.net/app/creditnotes.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("creditnotes");

		if ("https://apptivo.net/app/creditnotes.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully creditnotes app loading");

		} else {
			System.out.println("Unable to loading creditnotes app");

		}
	}

	@Test(priority = 13)
	private static void CrninsightsApploading() {

		driver.get("https://apptivo.net/app/crninsights.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("crninsights");

		if ("https://apptivo.net/app/crninsights.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully crninsights app loading");

		} else {
			System.out.println("Unable to loading crninsights app");

		}
	}

	@Test(priority = 14)
	private static void CrnApploading() {

		driver.get("https://apptivo.net/app/crn.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("crn");

		if ("https://apptivo.net/app/crn.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully crn app loading");

		} else {
			System.out.println("Unable to loading crn app");

		}
	}

	@Test(priority = 15)
	private static void CustomerpaymentsApploading() {

		driver.get("https://apptivo.net/app/customerpayments.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("customerpayments");

		if ("https://apptivo.net/app/customerpayments.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully customerpayments app loading");

		} else {
			System.out.println("Unable to loading customerpayments app");

		}
	}

	@Test(priority = 16)
	private static void CustomerApploading() {

		driver.get("https://apptivo.net/app/customers.jsp#/dashboard/show-all/");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("customers");

		if ("https://apptivo.net/app/customers.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl())) {
			System.out.println("sussfully customers app loading");

		} else {
			System.out.println("Unable to loading customers app");

		}
	}

	private static void ScreenCapture(String appName) {

		String fileName = "/home/grajan/git/Prod_AppLoad/Apploading/App loading/test-output/Suite/Suite/ApploadingSS/ALSS_"
				+ appName + ".png";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("/home/grajan/workspace/App loading/test-output/Suite" + fileName);
		try {
			FileUtils.copyFile(srcFile, screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<br><img src='" + fileName + "'height='558' width='1045'/><br>");
	}

}
