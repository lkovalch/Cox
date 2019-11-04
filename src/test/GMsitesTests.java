package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import GMtesting.GmSitesTitleVerification1;


public class GMsitesTests {
	
	GmSitesTitleVerification1 launch = new GmSitesTitleVerification1 ();
	WebDriver driver;
	
	@Before
	public void startFirefox() {
	launch.webDriverFirefox();}
	
	@After 
	public void quiteBrowser() {
	launch.quitBrowser();}
	
	@Test 
	public void verifyGmcCAsuccessLaunch () {
		
		
		launch.verifySuccessURLlaunch("https://gmcdealerdemoca.cms.dev.dealer.com/index.htm");
		
		launch.assertGmcTitleIsCorrect();}
	
	@Test 
	public void verifyCadillacUSsuccessLaunch () {
		
		launch.webDriverFirefox();
		
		launch.verifySuccessURLlaunch("https://chevroletdealerdemo.cms.dev.dealer.com/index.htm");

		launch.assertChevyTitleIsCorrect();}
	
	@Test 
	public void verifyGMCUSsuccessLaunch () {
	
		
		launch.verifySuccessURLlaunch("https://gmcdealerdemo.cms.dev.dealer.com/index.htm");
}

}
