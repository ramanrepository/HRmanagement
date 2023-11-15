package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;



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
	@SuppressWarnings("deprecation")
	public static void initiate() {
    		//driver path
    	String browsername =prop.getProperty("browser");
    	if(browsername.equals("chrome")) {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\HRmanagement\\chromedriver.exe");
    		driver = new ChromeDriver();
    	}
    		else if (browsername.equals("Microsoft Edge")) {
    			System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
    			driver = new FirefoxDriver();
    		}
    	
    		
    	
    	
    	driver.manage().window().maximize();
  driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
    	driver.get(prop.getProperty("url"));
    	
    	
} }
    
    
