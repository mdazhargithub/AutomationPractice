package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectClass.GooglePage;
import PageObjectClass.HomePage;

public class TC_05_LondonTIme extends BaseClass  {

	public WebDriver driver;
	public HomePage hp;
	public GooglePage gp;

	@Test
	void test4() throws InterruptedException {
		hp=new HomePage(BaseClass.driver);
		gp=new GooglePage(BaseClass.driver);
		
		
		Thread.sleep(5000);
		BaseClass.driver.get("https://www.google.com/search?q=london+time&rlz=1C1GCEU_enIN1094IN1094&oq=london+time&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDIHCAQQABiABDITCAUQLhiDARjHARixAxjRAxiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDIHCAgQABiABDIWCAkQLhiDARjHARixAxjRAxiABBiKBdIBCDI3OTZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
		 String finalGoogleData1;
		  if(gp.lntime().length() == 7) {
		  String googleTime = gp.lntime().substring(0, 4);
		  String timePeriod = gp.lntime().substring(5).toUpperCase();
		  finalGoogleData1 = googleTime.concat(timePeriod);
		  }
		  else {
			  String googleTime = gp.lntime().substring(0, 5);
			  String timePeriod = gp.lntime().substring(6).toUpperCase();
			  finalGoogleData1 = googleTime.concat(timePeriod);
		  }
		  
		  BaseClass.driver.navigate().back();
		  scrollPage();
		  Assert.assertEquals(finalGoogleData1,hp.londontime());
		  System.out.println("London time zone is verified with the Google data.");
	}
		
		
	
}
