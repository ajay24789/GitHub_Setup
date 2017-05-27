package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements AutoConstant {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(){
		driver.close();
	}

}
