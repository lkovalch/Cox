package GMtesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmTitleDataFromFile {

	WebDriver driver;

	public String[][] readFromCSV() throws IOException { // - Array 2 dimentional

		String csvFile = "/Users/lkovalchu2/eclipse-workspace/Cox/src/GMtesting/gmdata.csv";

		BufferedReader br = null;
		String line = null;
		String[] column = null;
		int lines = 0;
		int columns = 0;
		String SplitBy = ";";
		String url = null;
		String titleExpected = null;
		String titleActual = null;

		br = new BufferedReader(new FileReader(csvFile));

		while ((line = br.readLine()) != null) {
			lines++;

			column = line.split(SplitBy);
			columns = line.length();
		}
		br.close();

		String s2d[][] = new String[lines][columns];
		br = new BufferedReader(new FileReader(csvFile));

		WebDriver driver = new FirefoxDriver();
		int i = 0;
		
		while ((line = br.readLine()) != null) {
			s2d[i][0] = url;
			s2d[i][1] = titleExpected;

			String[] csv = line.split(SplitBy);
			url = csv[0];
			titleExpected = csv[1];

			driver.get(url);
			titleActual = driver.getTitle();

			Assert.assertEquals(titleExpected, titleActual);

			if (titleActual.equals(titleExpected)) {
				System.out.println("Title of the is correct");
			}

			else
				System.out.println("SOMETHING WRONG!");

			i++;

		}
		driver.close();
		br.close();
		return s2d;

	}
}
