package apptivo;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AppLoading extends Login {

	@BeforeTest
	public void beforeTest() {

	}

	@Test
	public void f() {

		

		//
		// System.out.println(driver.getCurrentUrl());
		//
		// driver.findElement(By.linkText("Human Resources")).click();
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		// // candidates app
		//
		// driver.findElement(By.cssSelector(".open li:nth-child(1) .ng-binding
		// ")).click();
		//
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		//
		// ScreenCapture("candidates");
		//
		// // System.out.println(driver.getCurrentUrl());
		//
		// if
		// ("https://staging.apptivo.net/app/candidates.jsp#/dashboard/show-all/".equals(driver.getCurrentUrl()))
		// {
		// System.out.println("sussfully candidates app loading");
		//
		// } else {
		// System.out.println("Unable to loading candidates app");
		//
		// }
		//
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		//
		//
		//
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

	private static void ScreenCapture(String appName) {

		String fileName = "/Suite/ApploadingSS/ALSS_" + appName + ".png";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("/home/grajan/workspace/FInqa/ss" + fileName);
		try {
			FileUtils.copyFile(srcFile, screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<br><img src='" + fileName + "'height='558' width='1045'/><br>");
	}
	
}
