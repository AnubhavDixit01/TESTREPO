package TestNam;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEST {

	WebDriver driver;
	
	
	String url;
	
	
	

	
	

	@Before
	
	public void launchbrowser()throws Exception{

 // Setting system properties of FirefoxDriver
		
		System.setProperty("webdriver.chrome.driver", "C://Users//C media//Downloads//chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		this.driver = new ChromeDriver();
		
		driver.get("https://cc.healthrecoverysolutions.com/login/");
		//url="https://cc.healthrecoverysolutions.com/login/";
		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		//Creating an object of FirefoxDriver
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\C media\\Downloads\\geckodriver.exe");


           //WebDriver driver = new FirefoxDriver();		
	
	driver.manage().window().maximize();
		
		//Specifiying pageLoadTimeout and Implicit wait
		
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
				
    //driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
				 			   
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				
	} 
	


 @Test
 
  public void atTest()throws Exception{
  
  
  
	 driver.get("https://cc.healthrecoverysolutions.com/login/");
 
 Thread.sleep(2000);
  
 driver.findElement(By.name("username")).sendKeys("dixit.anubhav01@gmail.com");
 
 
  Thread.sleep(1000);
  driver.findElement(By.id("password")).sendKeys("abc@1234");
  
  Thread.sleep(1000);
  
  driver.findElement(By.id("loginSubmitButton")).click();
 
 Thread.sleep(1000);

 }
 

 
}
 
  
 


 