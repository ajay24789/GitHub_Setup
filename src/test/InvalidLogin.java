package test;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends Basetest{
	
	@Test(priority=3)
	public void testInvaidLogin() {
		
		String un = Excel.getcellData(INPUT_PATH, "InvalidLogin", 1, 0);
		String pw = Excel.getcellData(INPUT_PATH, "InvalidLogin", 1, 1);
	
		//Enter invalid un
		LoginPage l = new LoginPage(driver);
		l.setUsername(un);
		
		//Enter invalid pw
		l.setPassword(pw);
		
		//Click on login
		l.clickLogin();
		
		//verify and display error message is displayed 
		l.displayErrormessage();
		l.verifyErrormsgPresent();
	}

}
