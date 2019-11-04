package GMtesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class CSVDataValuesReader {

	// for examample:
	// "/Users/lkovalchu2/eclipse-workspace/Cox/src/GMtesting/gmdata.csv"
	/// Users/lkovalchu2/eclipse-workspace/Cox/src/gmTitles.xlsx

	WebDriver driver;

	public Map<String, String> getTestData(String filePath) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		HashMap<String, String> testData = new HashMap<String, String>();
		String line = null;

		while ((line = reader.readLine()) != null) {

			String[] values = line.split(";");

			testData.put(values[0], values[1]);
		}

		reader.close();

		for (String key : testData.keySet()) {

			// driver.get(?);
			// String actualTitle = driver.getTitle();
			// String expectedTitle = testData.keySet();

			// Assert.assertEquals("SOMETYHING WRONG!", expectedTitle, actualTitle);
			System.out.println(key + " " + testData.get(key));
		}

		return testData;
	}

}