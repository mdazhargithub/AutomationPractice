package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;

public class TC_03_DateTime extends BaseClass {

	
	public WebDriver driver;
	public HomePage hp;
	
	
	@Test
	void test2() {
		
		hp=new HomePage(BaseClass.driver);
		scrollPage();
		Assert.assertEquals(hp.isdisplayeddate(),true);
		System.out.println("Current date and week details are displayed in World clock.");
	}
	
}
