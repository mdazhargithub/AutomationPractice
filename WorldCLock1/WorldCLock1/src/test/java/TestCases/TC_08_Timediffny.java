package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;

public class TC_08_Timediffny extends BaseClass {

public HomePage hp;
public WebDriver driver;

	@Test
	void test7() {
		
		hp=new HomePage(BaseClass.driver);
		scrollPage();
		Assert.assertEquals(hp.nytimediff(),"9h 30m behind");
		System.out.println("Time difference for New York is verified");
	}
}
