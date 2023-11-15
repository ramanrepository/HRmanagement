package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.PomLogin;


public class Logintest extends BaseHRMClass{
	
public void LoginTest() {
	super();

}
  
	
	PomLogin Log;
	@BeforeMethod
	public void initsetup() {
	initiate();
	Log = new PomLogin();
	
	}
	@Test
	
	public void Title() {
		String actual = Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
		String expectedtitle="OrangeHRM";
		String actualtitle="Null";
		try {
		    Assert.assertEquals(expectedtitle, actualtitle);
		} catch(Throwable t) {              
		    org.testng.Assert.fail("expected and actual result do not match");      
		}
	}
	@AfterMethod
	public void close() {
		driver.close();
	
		
	}
	}
	
	

