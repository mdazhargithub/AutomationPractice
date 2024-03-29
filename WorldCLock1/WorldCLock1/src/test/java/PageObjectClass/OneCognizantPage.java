package PageObjectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BasePage;

public class OneCognizantPage extends BasePage{

	public OneCognizantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//div[text()='View All Apps']")WebElement viewall;
	@FindBy(xpath="//div[@class='aZHolder']//div")List<WebElement> header;
	@FindBy(xpath="//div[text()='J']")WebElement randomtab;

	
	
	public void clickall() throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click();",viewall);
		
	}
	
	public void viewheader()
	{
		for(WebElement alp : header) {
			if(alp.isDisplayed()) {
				System.out.println(alp.getText() + " is Displayed.");
			}
			else {
				System.out.println(alp.getText() + " is not Displayed");
			}
		}
	}
	
	public void clickrandomtab() throws InterruptedException {
		randomtab.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement jTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='JLL Client Portal Opens in a new tab']/div")));
		String text=jTab.getText();
		Thread.sleep(1200);
		System.out.println(text);

	}
	

}
