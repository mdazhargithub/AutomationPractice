package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BasePage;

public class GooglePage extends BasePage{

	public GooglePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='gsrt vk_bk FzvWSb YwPhnf']")WebElement nygoogle;
	@FindBy(xpath="//div[@class='gsrt vk_bk FzvWSb YwPhnf']")WebElement londongoogle;
	
	public String nytime() {
		
		String ny=nygoogle.getText();
		return ny;
	}
	
	public String lntime() {
		String ln=londongoogle.getText();
		return ln;
	}

	
}
