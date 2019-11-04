package GMtesting;


import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExec {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/lkovalchu2/Documents/Selenium/geckodriver" );
		WebDriver driver = new FirefoxDriver();
		
		openNewTab(driver,"https://gmcdealerdemo.cms.dev.dealer.com/index.htm",1 );
		openNewTab(driver,"https://buickdealerdemo.cms.dev.dealer.com/index.htm",2 );
		openNewTab(driver,"https://chevroletdealerdemo.cms.dev.dealer.com/index.htm",3 );
		openNewTab(driver,"https://cadillacdealerdemo.cms.dev.dealer.com/index.htm",4 );
		openNewTab(driver,"https://gmcdealerdemoca.cms.dev.dealer.com/index.htm",5 );
		openNewTab(driver,"https://buickdealerdemoca.cms.dev.dealer.com/index.htm",6 );
		openNewTab(driver,"https://chevroletdealerdemoca.cms.dev.dealer.com/index.htm",7 );
		openNewTab(driver,"https://cadillacdealerdemoca.cms.dev.dealer.com/index.htm",8 );
		
		//assertTitle (driver,"https://gmcdealerdemo.cms.dev.dealer.com/index.htm", "GMC" );
	}
	
	public static void openNewTab(WebDriver driver, String url, int position) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        
       //ArrayList<String> actualTitles = new ArrayList <> (driver.getTitle());
        
        System.out.println("tabs : " + tabs.size() + " >position: " + position + " >\t" + url);
        driver.switchTo().window(tabs.get(position));
        driver.get(url);
       
        
     System.out.println( driver.getTitle());}
     
		
	}
			
	


