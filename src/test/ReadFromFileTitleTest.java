package test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import GMtesting.CSVDataValuesReader;
import GMtesting.GmSitesTitleVerification1;
import GMtesting.GmTitleDataFromFile;


public class ReadFromFileTitleTest {

	GmTitleDataFromFile readData = new GmTitleDataFromFile();
	GmSitesTitleVerification1 launch = new GmSitesTitleVerification1();
	CSVDataValuesReader csv = new CSVDataValuesReader();
	
	String filePath = "/Users//lkovalchu2/eclipse-workspace/Cox/src/GMtesting//gmdata.csv";

	WebDriver driver;

	
	@Test
	public void readDataFromCsvFile() throws Exception {
		csv.getTestData(filePath);
				
}
}