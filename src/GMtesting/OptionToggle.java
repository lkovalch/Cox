package GMtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionToggle {
	


	public static void main(String[] args) {
		//de-viewer-toggle
		
		WebDriver driver = null;
		//click on toggle 
		driver.findElement(By.id("de-viewer-toggle")).click();

}
}