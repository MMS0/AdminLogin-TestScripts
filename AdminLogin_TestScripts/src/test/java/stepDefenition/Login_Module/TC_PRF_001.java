package stepDefenition.Login_Module;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import browserSetup.Browser_Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_PRF_001 extends Browser_Setup {

	@Given("^Go to Product url$")
	public void go_to_Product_url() throws Throwable {
		Browser_Setup when = new Browser_Setup();
		when.browserselect("chrome");
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
	}

	@Given("^Signin using Admin Login ID \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void signin_using_Admin_Login_ID_and_Password(String ID, String password) throws Throwable {
		WebElement id = driver.findElement(By.id("userLoginId"));
		id.sendKeys(ID);
		WebElement pwd = driver.findElement(By.id("currentPassword"));
		pwd.sendKeys(password);
		WebElement signlogin = driver.findElement(By.xpath("//*[@id='sign_In']/div"));
		signlogin.click();
	}

	@When("^Click on the options and Settings icon$")
	public void click_on_the_options_and_Settings_icon() throws Throwable {
		WebElement profile = driver.findElement(By.id("person-image"));
		profile.click();
	}

	@Then("^It displays the above values$")
	public void it_displays_the_above_values() throws Throwable {
		WebElement home = driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[3]"));
		if (home.isDisplayed()) {
			System.out.println("\nIt displays the 1.Home option");
		} else {
			System.out.println("\nNot displayed the Home option");
		}
		WebElement dashboard = driver.findElement(By.xpath("//li[@onclick='Health.dashboard()']"));
		if (dashboard.isDisplayed()) {
			System.out.println("\nIt displays the 2.Dashboard option");
		} else {
			System.out.println("\nNot displayed the Dashboard option");
		}
		WebElement quicktour = driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[6]"));
		if (quicktour.isDisplayed()) {
			System.out.println("\nIt displays the 3.Quick Tour option");
		} else {
			System.out.println("\nNot displayed the Quick Tour option");
		}
		WebElement settings=driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[7]"));
		if (settings.isDisplayed()) {
			System.out.println("\nIt displays the 4.Settings option");
		} else {
			System.out.println("\nNot displayed the Settings option");
		}
		WebElement mgservice=driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[8]"));
		if (mgservice.isDisplayed()) {
			System.out.println("\nIt displays the 5.Migration Services option");
		} else {
			System.out.println("\nNot displayed the Migration Services option");
		}
		WebElement help=driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[9]"));
		if (help.isDisplayed()) {
			System.out.println("\nIt displays the 6.Help option");
		} else {
			System.out.println("\nNot displayed the Help option");
		}
		WebElement signout=driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[10]"));
		if (signout.isDisplayed()) {
			System.out.println("\nIt displays the 7.Sign out option");
		} else {
			System.out.println("\nNot displayed the Sign out option");
		}

	}
	@Then("^Takes Screenshot for reference$")
	public void takes_Screenshot_for_reference() throws Throwable {
	    File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(sc, new File("AdminLogin TestCase Features/1) Login Module Screenshots/TC_PRF_001.png"));
	}
}
