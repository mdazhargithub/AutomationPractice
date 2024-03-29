package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;

public class TC_07_Timedifflondon extends BaseClass {

	public WebDriver driver;
	public HomePage hp;
	
	
	@Test
	void test7() {
		
		hp=new HomePage(BaseClass.driver);
		Assert.assertEquals(hp.londontimediff(),"5h 30m behind");
		System.out.println("Time difference for London is verified");
	}
}
