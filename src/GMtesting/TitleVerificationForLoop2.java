package GMtesting;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerificationForLoop2 {
	
	WebDriver driver;
	String actualTitle;
	

	public void oneForLoop  (){
		
		System.setProperty("webdriver.gecko.driver","/Users/lkovalchu2/Documents/Selenium/geckodriver" );
		
		String [] urls = new String [7];
		 urls [0]= "https://gmcdealerdemo.cms.dev.dealer.com/index.htm";
		 urls [1]= "https://buickdealerdemo.cms.dev.dealer.com/index.htm";
		 urls [2]= "https://chevroletdealerdemo.cms.dev.dealer.com/index.htm";
		 urls [3]= "https://cadillacdealerdemoca.cms.dev.dealer.com/index.htm";
		 urls [4]= "https://gmcdealerdemoca.cms.dev.dealer.com/index.htm";
		 urls [5]= "https://buickdealerdemoca.cms.dev.dealer.com/index.htm";
		 urls [6]= "https://chevroletdealerdemoca.cms.dev.dealer.com/index.htm";
		
		 String [] expectedTitles = new String [7];
		 expectedTitles [0]= "GM Demo Motors | New GMC Dealership in Burlington, VT";
		 expectedTitles [1]= "Burlington's Buick Demo Motors | New and Used Buick Cars";
		 expectedTitles [2]= "GM Demo Motors | New Chevrolet Dealership in Burlington, VT";
		 expectedTitles [3]= "MC Dealer Demo | New CADILLAC Dealership in Mississauga, ON";
		 expectedTitles [4]= "GMC Dealer Demo | New GMC Dealership in Mississauga, ON";
		 expectedTitles [5]= "GMC Dealer Demo | New Buick Dealership in Mississauga, ON";
		 expectedTitles [6]= "GMC Dealer Demo | Concessionaire Chevrolet Neuf à Mississauga, ON";
		 
		
		
			for (int count =0; count< urls.length; count++ ) {
			WebDriver driver = new FirefoxDriver();			
		   
			driver.get(urls[count]);
					
			String actualTitle [] = {driver.getTitle()};
			System.out.println(urls[count]);
			System.out.println(actualTitle);   
			
			driver.quit();
			}
			
			/*
			Assert.assertArrayEquals("KARAUL", expectedTitles[count], actualTitle[count]);
			if (expectedTitles.equals(actualTitle) ) {
			System.out.println("CORRECT TITLE");
				
			}
			else System.out.println("WATCH OUT! PROBLEM!!!!!!"); 
			
			
		
			} */
			
	}	}
	
			
			
			


