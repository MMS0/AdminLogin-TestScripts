package browserSetup;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Browser_Setup {
	public static WebDriver driver;
	String url="https://localhost:8443/";
	String advanced="details-button";
	String proceed="Proceed to localhost (unsafe)";
	//@BeforeTest
	public void browserselect(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/home/kaaspro-ld4/20Q/AdminLogin_TestScripts/Drivers/chromedriver");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","/home/kaaspro-ld4/20Q/AdminLogin_TestScripts/Drivers/geckodriver");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","/home/kaaspro-ld4/20Q/AdminLogin_TestScripts/Drivers/chromedriver");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(7,  TimeUnit.SECONDS);
		driver.findElement(By.id(advanced)).click();
		driver.findElement(By.linkText(proceed)).click();
	}

}
