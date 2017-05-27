package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
	
	public WebDriver driver;
	
	public Basepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
				wait.until(ExpectedConditions.titleIs(eTitle));
				Reporter.log("Title is Matching: " + eTitle, true );
		}
		catch(Exception e)
		{
			Reporter.log("eTitle is: " + eTitle + "\naTitle is: " + driver.getTitle(), true);
			Reporter.log("Title is NOT Matching", true);
			Assert.fail();
		}
	}
	public void verifyElementPresent(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present", true );
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present", true);
			Assert.fail();
		}
	}


	

}
