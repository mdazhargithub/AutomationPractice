package PageObjectClass;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BaseClass.BasePage;

public class HomePage extends BasePage{
	JavascriptExecutor js;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By qst_mark=By.id("O365_MainLink_Help_container");
	By user_info=By.id("meInitialsButton");
	By emp_id=By.id("mectrl_currentAccount_secondary");
	@FindBy(id="meInitialsButton")public WebElement userinfo;
	@FindBy(id="mectrl_currentAccount_secondary")public WebElement empid;
	@FindBy(xpath="//div[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']")WebElement clock;
	@FindBy(xpath="(//div[@data-automation-id = 'clock-card']//div[@data-automation-id = 'clock-card-AM-PM-time'])[3]") WebElement newyorktime;
	@FindBy(xpath="(//div[@data-automation-id = 'clock-card']//div[@data-automation-id = 'clock-card-AM-PM-time'])[2]")WebElement londontime;
	@FindBy(xpath="(//div[@data-automation-id='clock-card-time-offset'])[2]")WebElement londondiff;
	@FindBy(xpath="(//div[@data-automation-id='clock-card-time-offset'])[3]")WebElement newyorkdiff;
	@FindBy(xpath="(//div[@class='n_b_816e1fa6']/div[2])[1]")WebElement dateweek;
	@FindBy(xpath="(//div[@data-automation-id = 'clock-card']//div[@data-automation-id = 'clock-card-AM-PM-time'])[1]")WebElement currenttime;
	@FindBy(xpath="//div[@title='OneCognizant']")WebElement onecognizant;
	
	
	public boolean isdisplayed() throws InterruptedException {
		
//		js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		boolean status=clock.isDisplayed();
		return status;
	}
	
	public boolean isdisplayeddate() {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		boolean datew=dateweek.isDisplayed();
		return datew;
	}
   
	static LocalTime currentTime = LocalTime.now();
	public static DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("h:mma");
	public static String  formatTime=currentTime.format(formatter1);
	public String validatecurtime() {
		 
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		
		String curtime=currenttime.getText();
		String formattedTime="";
		 if(curtime.length()==6) {
			  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mma");
			  formattedTime = currentTime.format(formatter);
		  }
		  else {
			  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mma");
			  formattedTime = currentTime.format(formatter);
		  }
		 
		 
		return formattedTime;
	}
	
	public String newyorktime() {
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		String nytime=newyorktime.getText();
		return nytime;
	}
	
	public String londontime() 
	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		String ldtime=londontime.getText();
		return ldtime;
	}
	
	public String londontimediff() {
		

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		
		String ldtimediff=londondiff.getText();
		return ldtimediff;
	}
	
	public String nytimediff() {
		

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
		String nytimediff=newyorkdiff.getText();
		return nytimediff;
	}
	
	public void clickonec() {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,400)");
		onecognizant.click();
	}

}
