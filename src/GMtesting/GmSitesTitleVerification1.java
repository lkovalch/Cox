package GMtesting;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmSitesTitleVerification1 {
	
	WebDriver driver;
	String actual;
	String expected;
	String url;
	
	public void webDriverFirefox () {
		System.setProperty("webdriver.gecko.driver","/Users/lkovalchu2/Documents/Selenium/geckodriver" );
		driver = new FirefoxDriver();	}
		
	
	public void webDriverChrome () {
		System.setProperty("webdriver.gecko.driver","/Users/lkovalchu2/Documents/Selenium/geckodriver" );
		driver = new ChromeDriver();	}
	
	
	
	
	public void verifySuccessURLlaunch (String url) {
	
		driver.get(url);
		actual = driver.getTitle();
		System.out.println(driver.getTitle());}
	
	public void assertGmcTitleIsCorrect () {
		
		expected= "GMC Dealer Demo | New Buick, Chevrolet, GMC Dealership in Mississauga, ON";
		Assert.assertEquals("This is NOT correct Title", expected, actual);
		if (actual.contentEquals(expected)) {
			System.out.print("GMC title is correct");}
		else 
			System.out.print("KARAUL!!!! WE have an issue");
	}
public void assertGmcUSTitleIsCorrect () {
		
		expected= "GM Demo Motors | New GMC Dealership in Burlington, VT";
		Assert.assertEquals("This is NOT correct Title", expected, actual);
		if (actual.contentEquals(expected)) {
			System.out.print("GMC US title is correct");}
		else 
			System.out.print("KARAUL!!!! WE have an issue");
	}
		
	public void assertChevyTitleIsCorrect () {
			
			expected= "GM Demo Motors | New Chevrolet Dealership in Burlington, VT";
			Assert.assertEquals("This is NOT correct Titleee", expected, actual);
			if (actual.contains(expected)) {
				System.out.println("Chevrolet title is correct");
			}
			else System.out.println("KARAUL! Something wrong with Chevrolet");
	}
			
	public void quitBrowser() {
		
		driver.quit();
		
	}
	
	public void closeBrowser() {
		
		driver.close();
		
	}
	
	}
		
		
	
	


