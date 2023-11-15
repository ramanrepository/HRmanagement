package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseHRMClass {
   public static Properties prop = new Properties();
   public static WebDriver driver;
	
    //Step1
   
	public BaseHRMClass() {
    	try {
    	FileInputStream file= new FileInputStream("C:\\Users\\raman\\eclipse-workspace\\HRmanagement\\src\\main\\java\\environmentvariables\\Config.properties");
    prop.load(file);
    
    	}
    catch(FileNotFoundException e) {
    	e.printStackTrace();
    }
    	catch (IOException a) {
    		a.printStackTrace();
    	}
    }
	public static void initiate() {
    		//driver path
    	String browsername =prop.getProperty("browser");
    	if(browsername.equals("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    		driver = new ChromeDriver();
    	}
    		else if (browsername.equals("Firefox")) {
    			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    			driver = new FirefoxDriver();
    		}
    	}
    		
    		//maximize,pageload,implicit,getting url
    	
    	//driver.manage().window().maximize();
    //	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
    	//driver.get(prop.getProperty("url"));
    	
    	
} 
    
    
