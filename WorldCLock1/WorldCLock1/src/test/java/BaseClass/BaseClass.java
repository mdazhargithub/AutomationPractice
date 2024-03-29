package BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObjectClass.GooglePage;
import PageObjectClass.HomePage;

public class BaseClass {

	public static WebDriver driver;
	public HomePage hp;
	public GooglePage gp;
	
		
	
@BeforeTest
public void setup()
{
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
}

//Method to Scroll
protected void scrollPage() {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,1800)");
}
protected void scrollPageOnec() {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementsByClassName('c_a_beed2cf1 b_a_beed2cf1 f_a_beed2cf1 g_a_beed2cf1')[0].scrollBy(0,400)");
}
public void scshot(String nameOfFile) {
	TakesScreenshot ts = ((TakesScreenshot) driver);
    hp=new HomePage(driver);
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\"+nameOfFile+".png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
@AfterTest
public void close() throws InterruptedException {
	Thread.sleep(6000);
	driver.quit();
}
	
}
