package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.GooglePage;
import PageObjectClass.HomePage;

public class TC_06_NeyworkTime extends BaseClass{

	public WebDriver driver;
	public HomePage hp;
	public GooglePage gp;
	
	@Test
	void test4() throws InterruptedException {
		hp=new HomePage(BaseClass.driver);
		gp=new GooglePage(BaseClass.driver);
		
		
		Thread.sleep(5000);
		BaseClass.driver.get("https://www.google.com/search?q=new+york+time&rlz=1C1GCEU_enIN1094IN1094&oq=new+york+time&gs_lcrp=EgZjaHJvbWUyEQgAEEUYORhDGLEDGIAEGIoFMgwIARAAGEMYgAQYigUyDAgCEAAYQxiABBiKBTIMCAMQABhDGIAEGIoFMgoIBBAuGLEDGIAEMg8IBRAuGEMYsQMYgAQYigUyDAgGEC4YQxiABBiKBTISCAcQABhDGIMBGLEDGIAEGIoFMgwICBAuGEMYgAQYigUyDwgJEAAYQxixAxiABBiKBdIBCTQ3MTRqMGoxNagCALACAA&sourceid=chrome&ie=UTF-8");
		 String finalGoogleData;
		  if(gp.nytime().length() == 7) {
		  String googleTime = gp.nytime().substring(0, 4);
		  String timePeriod = gp.nytime().substring(5).toUpperCase();
		  finalGoogleData = googleTime.concat(timePeriod);
		  }
		  else {
			  String googleTime = gp.nytime().substring(0, 5);
			  String timePeriod = gp.nytime().substring(6).toUpperCase();
			  finalGoogleData = googleTime.concat(timePeriod);
		  }
		  
		  BaseClass.driver.navigate().back();
		  scrollPage();
		  Assert.assertEquals(finalGoogleData,hp.newyorktime());
		  System.out.println("New York Time zone is verified with the Google data.");
	}
		
	
}
