package ReadWriteCSVfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvReadWriter {

	public String filePath = "//Users//lkovalchu2//eclipse-workspace//Cox//src//GMtesting//gmdata2.csv";

	public static void writeCSV(String filePath) {

		// Create data

		List<User> users = new ArrayList<User>();

		User user = new User(); // Create object of class "User"

		// GMC US
		user.setCountry("US");
		user.setUrl("https://gmcdealerdemo.cms.dev.dealer.com/");
		user.setTitles("GMC Dealer Demo | New Buick, Chevrolet, GMC Dealership in Mississauga, ON");
		user.add(user);

		user = new User(); // create new object
		// BUICK US
		user.setCountry("US");
		user.setUrl("https://buickdealerdemo.cms.dev.dealer.com/");
		user.setTitles("Burlington's Buick Demo Motors | New and Used Buick Cars");
		user.add(user);

		// Write data to CSV fiel

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.append("country, url, titles");
			for (User u : users) { // User class, users- name of the array

				fileWriter.append(String.valueOf(u.getCountry()));
				fileWriter.append(";");
				fileWriter.append(String.valueOf(u.getUrl()));
				fileWriter.append(";");
				fileWriter.append(String.valueOf(u.getTitles()));
				fileWriter.append("/n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {

				fileWriter.flush();
				fileWriter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void readCSV(String filePath) {
		BufferedReader reader = null;
		try {
			List<User> users = new ArrayList<User>();
			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(";");

				if (fields.length > 0) {

					User user = new User(); // to call User class we create object of this class

					user.setCountry(fields[0]);
					user.setUrl(fields[1]);
					user.setTitles(fields[2]);
					user.add(user);

				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
