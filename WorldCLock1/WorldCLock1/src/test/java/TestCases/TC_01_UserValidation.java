package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.*;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;



public class TC_01_UserValidation extends BaseClass {

		public HomePage hp;
		public WebDriver driver;
		
		@Test
		public void userValidity()
		{
			
			FluentWait wait = new FluentWait(BaseClass.driver);
			wait.withTimeout(Duration.ofSeconds(10));
			wait.pollingEvery(Duration.ofSeconds(3));
			wait.ignoring(NoSuchElementException.class);
	 
			
			//Clicking on the profile icon
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("O365_MainLink_Help_container")));
			WebElement ele = BaseClass.driver.findElement(By.id("meInitialsButton"));
			Actions ac = new Actions(BaseClass.driver);
			ac.moveToElement(ele).perform();
			ac.doubleClick(ele).perform();
			//Capturing the user information
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mectrl_currentAccount_primary")));
//			TakesScreenshot ts = ((TakesScreenshot) BaseClass.driver);
//		    hp=new HomePage(BaseClass.driver);
//			File srcFile = ts.getScreenshotAs(OutputType.FILE);
//			File destFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\Photo.png");
//			try {
//				FileUtils.copyFile(srcFile, destFile);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			scshot("picture1");
			
		//Assert.assertEquals(BaseClass.driver.findElement(By.id("mectrl_currentAccount_primary")).getText(),"Azharuddin, MD (Contractor)");
			System.out.println("Account Name Verified");
			Assert.assertEquals(BaseClass.driver.findElement(By.id("mectrl_currentAccount_secondary")).getText(),"2318407@cognizant.com");
			System.out.println("User Mail Id is verified");
		}
		
}