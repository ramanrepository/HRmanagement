package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.PomLogin;

public class Logintest extends BaseHRMClass{
   PomLogin Log;
   
	public void LoginTest() {
		
		super();
		
	}
	@BeforeMethod
	public void intialsetup() {
	initiate();
	Log = new PomLogin();
	
	}
	@Test
	
	public void Title() {
		String actual = Log.verify();
		Assert.assertEquals(actual, "OrangeHRM");
	}
	@AfterMethod
	public void close() {
		driver.close();
	
		
	}
	}
	
	

