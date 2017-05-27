package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class EnterTimeTrackPage extends Basepage{
	
	@FindBy(id = "logoutLink")
	private WebElement LogoutLNK;

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void ClickLogout() {
		LogoutLNK.click();
		
	}

}
