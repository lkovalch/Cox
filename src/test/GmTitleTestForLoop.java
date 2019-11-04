package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import GMtesting.GmSitesTitleVerification1;
import GMtesting.TitleVerificationForLoop2;

public class GmTitleTestForLoop {

	GmSitesTitleVerification1 launch = new GmSitesTitleVerification1();
	TitleVerificationForLoop2 forloop2 = new TitleVerificationForLoop2();

	WebDriver driver;

	@Before
	public void startFirefox() {
		launch.webDriverFirefox();
	}

	@After
	public void quiteBrowser() {
		launch.quitBrowser();
	}

	@Test
	public void verifyGmTitlesCorrect() {

		forloop2.oneForLoop();

	}
}
