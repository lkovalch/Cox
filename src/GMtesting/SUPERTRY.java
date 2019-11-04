package GMtesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SUPERTRY {

	public static void main(String[] args) throws IOException {
		
		 String url = null;
		 String line =null;
		 String [] column = null;
		 int lines =0;
		 int columns=0;
		 String csvFile = "/Users/lkovalchu2/eclipse-workspace/Cox/src/test/gmdata.csv";
		 BufferedReader br = new BufferedReader(new FileReader(csvFile));
		
		 String [][] readFromCSV = new String [lines][columns];
			
			 String titleExpected = null;
			 String titleActual = null;
			 String SplitBy=";";
			
			readFromCSV [0][0]= url;
			readFromCSV [0][1]= titleExpected;
			 
			 while ((line = br.readLine())!= null){
			 lines++;
			 
			 column =line.split(SplitBy);
			 columns = line.length();
			 }
			 br.close();
			 
			 String s2d [][] = new String [lines][columns];
			 br = new BufferedReader (new FileReader (csvFile));
			 
			 WebDriver driver = new FirefoxDriver();
			 int i=0;
			 while ((line = br.readLine())!=null) {
				 //s2d[i][0]= url;
				 //s2d[i][1]= titleExpected;
				//s2d[i][2]= titleActual;
				 
				 String [] csv=line.split(SplitBy);
				url = csv[0];
				titleExpected = csv[1];
				 
				 driver.get(url);
				 driver.manage().window().maximize();
				titleActual = driver.getTitle();
				 
				 Assert.assertEquals(titleExpected, titleActual);
				 if (titleExpected==titleActual) {
					 System.out.println("Title of the" + url +"is correct"+ titleActual); 
				 }
				 else System.out.println("SOMETHING WRONG!");
				 i++;
				 
				 }
			 driver.close();
			 br.close();
			 //return;
			
			  }

	//private static Reader FileReader() {
		// TODO Auto-generated method stub
		//return null;
	}
		 


			


	
