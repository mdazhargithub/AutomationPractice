package TestCases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.HomePage;
import PageObjectClass.OneCognizantPage;

public class TC_09_OneCognizant extends BaseClass {

	public HomePage hp;
	OneCognizantPage oc;
	public WebDriver driver;
	
	@Test
	void test9() throws InterruptedException {
		scrollPageOnec();
		hp=new HomePage(BaseClass.driver);
		oc=new OneCognizantPage(BaseClass.driver);
		
		
		
		hp.clickonec();
		String pwh = BaseClass.driver.getWindowHandle();
		
		Set<String> wh = BaseClass.driver.getWindowHandles();
		for(String s:wh) {
			if(s.equals(pwh)) {
			}
			else {
				BaseClass.driver.switchTo().window(s);
			}
		}
		
		oc.clickall();
		Thread.sleep(3000);
		scshot("picture3");
		oc.viewheader();
		oc.clickrandomtab();
		Thread.sleep(3000);
		scshot("picture4");
		
	}
}
