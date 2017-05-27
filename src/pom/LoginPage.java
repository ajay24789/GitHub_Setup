package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.Basepage;

public class LoginPage extends Basepage {
	
	@FindBy(xpath="//nobr[.='actiTIME 2014 Pro']")
	private WebElement version;
	
	@FindBy(name = "username")
	private WebElement usernameTB;

	@FindBy(name = "pwd")
	private WebElement PasswordTB;
	
	@FindBy(id = "loginButton")
	private WebElement LoginBTN;
	
	@FindBy(xpath = "//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errorMSG;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion = version.getText();
		Reporter.log("aVersion: " + aVersion, true);
		Reporter.log("eVersion: " + eVersion, true);
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void setUsername(String un) {
		usernameTB.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		PasswordTB.sendKeys(pw);
	}
	
	public void clickLogin() {
		LoginBTN.click();
	}
	
	public void verifyErrormsgPresent() {
	verifyElementPresent(errorMSG);
	}
	
	public void displayErrormessage() {
		String getErrorMsg = errorMSG.getText();
		Reporter.log("Error Message is: " + getErrorMsg , true);
	}
	
	
}
	
	
	
