package TestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import BaseClass.BaseClass;
//import BaseClass.BaseClass.BaseTestClass;
import PageObjectClass.HomePage;



public class TC_02_Clockdisplay extends BaseClass {

	public WebDriver driver;
	public HomePage hp;
	
	

	@Test
	public void test1() throws InterruptedException {
		
	
		hp=new HomePage(BaseClass.driver);
		BaseClass bc=new BaseClass();
		scrollPage();
		Assert.assertEquals(hp.isdisplayed(),true);
		Thread.sleep(3000);
		bc.scshot("picture2");
		System.out.println("World Clock section is displayed in Be.Cognizant page.");
		
	}

}
