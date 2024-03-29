package TestCases;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;

public class TC_04_BangaloreTime extends BaseClass {

	

	public WebDriver driver;
	public HomePage hp;
	
	
	@Test
	void test3() {
		hp=new HomePage(BaseClass.driver);
		scrollPage();
		LocalTime currentTime = LocalTime.now();

		Assert.assertEquals(hp.validatecurtime(),HomePage.formatTime);
		System.out.println("Bangalore location Time is verified zone with the System Time.");
	}
		 
		
}
