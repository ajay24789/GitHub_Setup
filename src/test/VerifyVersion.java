package test;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.LoginPage;

public class VerifyVersion extends Basetest {
	
	@Test(priority=1)
	public void testVerison() {
		String eVersion = Excel.getcellData(INPUT_PATH, "VerifyVersion", 1, 0);
		
		//verify the version of actiTime
		
		LoginPage l = new LoginPage(driver);
		l.verifyVersion(eVersion);
		
	}

}
