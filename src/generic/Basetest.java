package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class Basetest implements AutoConstant {
	
	public WebDriver driver;
	
	// Paramertisation done  
	
	@Parameters({"nodeURL","browser","AppURL"})
	@BeforeMethod
	public void openApp(String nodeURL, String browser, String AppURL) throws MalformedURLException
	{
		URL ra = new URL(nodeURL);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		driver = new RemoteWebDriver(ra, dc);
		driver.get(AppURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(){
		driver.close();
	}

}
