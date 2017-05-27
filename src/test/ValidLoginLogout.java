package test;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends Basetest{

	@Test(priority=2)
	public void testvalidLoginlogout() {
		
		String un = Excel.getcellData(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pw = Excel.getcellData(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String hpTitle = Excel.getcellData(INPUT_PATH, "ValidLoginLogout", 1, 2);
		String lpTitle = Excel.getcellData(INPUT_PATH, "ValidLoginLogout", 1, 3);
		
		//Enter valid un
		
		LoginPage l = new LoginPage(driver);
		
		l.setUsername(un);
		
		//Enter valid pw
		
		l.setPassword(pw);
		
		//click on login
		l.clickLogin();
		
		//verify HP Title
		EnterTimeTrackPage e =  new EnterTimeTrackPage(driver);
		e.verifyTitle(hpTitle);
		
		//Click on logout 
		e.ClickLogout();
		
		//verify LP Title
		l.verifyTitle(lpTitle);
			
	}
}
