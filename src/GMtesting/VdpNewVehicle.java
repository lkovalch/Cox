package GMtesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VdpNewVehicle {
	


	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","/Users/lkovalchu2/Documents/Selenium/geckodriver" );
		WebDriver driver = new FirefoxDriver();
		
		String [] demoSites = {"https://chevroletdealerdemo.cms.dealer.com", "https://buickdealerdemo.cms.dealer.com"};
			
			for (int count=0; count< demoSites.length; count ++) {
				//System.out.println(demoSites[count]);
		
				driver.get(demoSites[count]);
				driver.findElement(By.xpath("//div[1]/div[2]/div[2]/ul/li[2]/a")).click(); //New Inventory
				driver.findElement(By.xpath("//div[1]/div[2]/div[2]/ul/li[2]/ul/li[1]/ul/li[2]/a")).click(); //New Vehicles
				
				
			
				Thread.sleep(5000); //wait for inventory loads
				
				System.out.println(driver.findElement(By.xpath("//div[2]/div[2]/div/div[3]/div[2]/div[2]/form/div/div[2]/ul[1]/li[1]/div[1]")).getText());//first car

				
				
				}
		
	}}
		


